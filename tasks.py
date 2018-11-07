"""
Script for handling build tasks for this projects.
"""
from invoke import task
from distutils.dir_util import copy_tree


@task
def generate_docs(c):
    c.run("lein codox")

@task
def generate_soap_classes(c):
    c.run("lein pom")
    c.run("mvn generate-sources")


@task
def compile_elm_prod(c):
    c.run("cd frontend && elm-app build")
    # copy subdirectory example
    from_directory = "frontend/build/"
    to_directory = "resources/public"
    copy_tree(from_directory, to_directory)


@task
def make_uberjar(c):
    compile_elm_prod(c)
    c.run("lein uberjar")
