#!/bin/sh

# containers
docker container prune

# untagged images
docker rmi $(docker images | grep "^<none>" | awk "{print $3}")