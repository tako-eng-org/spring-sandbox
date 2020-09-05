FROM openjdk:11-jdk-slim

RUN apt-get update && apt-get install -y \
    curl \
    git \
    default-mysql-client \
 && apt-get clean \
 && rm -rf /var/lib/apt/lists/*

RUN mkdir /workspace
WORKDIR /workspace
COPY ./app /workspace/app

RUN cd app && ./gradlew build
