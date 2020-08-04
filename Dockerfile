FROM openjdk:11-jdk-slim

RUN apt-get update && apt-get install -y \
    curl \
    git \
 && apt-get clean \
 && rm -rf /var/lib/apt/lists/*
