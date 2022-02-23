#!/bin/bash

if ! [ -x "$(command -v ./gradlew)" ]; then
  echo 'Error: unable to find gradlew. Check your directory.' >&2
  exit 1
fi

gradle_build()
{
  ./gradlew bootJar
  ./gradlew bootBuildImage
}

docker_up()
{
  docker compose up --build app --remove-orphans
}

gradle_build
docker_up
