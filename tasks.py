"""
Script for handling build tasks for this projects.
"""
from invoke import task
from distutils.dir_util import copy_tree

@task
def generate_docs(c):
    r = c.run("lein codox")
    print(len(r))


@task
def generate_soap_classes(c):
    c.run("lein pom")
    c.run("mvn generate-sources")


@task
def compile_elm_prod(c, docs=False):
    c.run("cd frontend && elm-app build")
    # copy subdirectory example
    from_directory = "frontend/build/"
    to_directory = "resources/frontend"
    copy_tree(from_directory, to_directory)


@task
def production_build(c):
    pass