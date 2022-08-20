# java-spring-docker

# java-spring-docker

Docker

—>Add Dockerfile at root

# syntax=docker/dockerfile:1
FROM openjdk:18-jdk-alpine

WORKDIR /testproj

COPY .mvn/ .mvn
COPY mvnw pom.xml ./

RUN ./mvnw dependency:resolve

COPY src ./src
CMD ["./mvnw", "spring-boot:run"]

—>Add .dockerignore 
target




-->Run the command on terminal to build docker image
docker build --tag java-docker .


-->View local images

 docker images


docker run -d -p 8080:8080 java-docker



 docker volume create mysql_data
 docker volume create mysql_config
docker network create mysqlnet

 docker run -it --rm -d -v mysql_data:/var/lib/mysql \
-v mysql_config:/etc/mysql/conf.d \
--network mysqlnet \
--name mysqlserver \
-e MYSQL_USER=testuser -e MYSQL_PASSWORD=testpw \
-e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=sampledb \
-p 3306:3306 mysql:8.0


docker run --rm \
--name springboot-server \
--network mysqlnet \
-e MYSQL_URL=jdbc:mysql://mysqlserver/sampledb \
-p 8080:8080 java-docker
