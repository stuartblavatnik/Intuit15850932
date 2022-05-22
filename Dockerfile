FROM openjdk:11
MAINTAINER twoforboth.com
COPY build/libs/intuittest-0.0.1-SNAPSHOT.jar intuittest-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/intuittest-0.0.1-SNAPSHOT.jar"]
