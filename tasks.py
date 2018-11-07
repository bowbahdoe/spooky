"""
Script for handling build tasks for this projects.
"""
import os
from invoke import task
from distutils.dir_util import copy_tree


@task
def generate_docs(c):
    c.run("lein codox")


def _remove_if_exists(filename):
    """https://stackoverflow.com/questions/10840533/most-pythonic-way-to-delete-a-file-which-may-not-exist"""
    if os.path.exists(filename):
        os.remove(filename)


@task
def generate_soap_classes(c):
    try:
        c.run("lein pom")
        c.run("mvn generate-sources")
    finally:
        print("Removing generated pom.xml.")
        _remove_if_exists("pom.xml")


@task
def compile_elm_prod(c):
    c.run("cd frontend && elm-app build")
    from_directory = "frontend/build/"
    to_directory = "resources/public"
    copy_tree(from_directory, to_directory)


@task
def make_uberjar(c):
    generate_soap_classes(c)
    compile_elm_prod(c)
    c.run("lein uberjar")
