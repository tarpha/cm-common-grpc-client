FROM gradle:7.6-jdk17
RUN mkdir /cm-common-grpc-client
COPY . /cm-common-grpc-client
WORKDIR /cm-common-grpc-client
RUN gradle clean build

FROM openjdk:17-alpine
COPY --from=0 /cm-common-grpc-client/build/libs/cm-common-grpc-client-*.jar cm-common-grpc-client.jar
ENTRYPOINT [ "java", "-jar", "cm-common-grpc-client.jar" ]