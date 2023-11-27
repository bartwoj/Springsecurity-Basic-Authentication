FROM ghcr.io/graalvm/jdk-community:21
RUN mkdir /project
COPY /build/libs/example-*-SNAPSHOT.jar /project/example.jar
WORKDIR /project
CMD java -jar example.jar
