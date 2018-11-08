"""
Script for handling build tasks for this projects.
"""
import os
from invoke import task
from distutils.dir_util import copy_tree
import json

@task
def start_hotreload_server(c, port=None):
    if port is None:
        with open("resources/config.json") as f:
            port = int(json.load(f)["port"])
    c.run("lein ring server {port}".format(port=port))

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
def compile_java(c):
    c.run("lein javac")


@task
def start_webpack_server(c):
    with c.cd("frontend"):
        c.run("elm-app start")

@task
def compile_elm_prod(c):
    with c.cd("frontend"):
        c.run("elm-app build")
    from_directory = "frontend/build/"
    to_directory = "resources/public"
    copy_tree(from_directory, to_directory)


@task
def make_uberjar(c):
    generate_soap_classes(c)
    compile_elm_prod(c)
    c.run("lein uberjar")
