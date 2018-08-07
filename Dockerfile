#FROM openjdk:8-jdk-alpine
#VOLUME /tmp
#COPY ./build/libs/gs-accessing-data-mysql-ayushi-0.1.0.jar app.jar
#ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]



FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY gs-accessing-data-mysql-ayushi-0.1.0.jar app.jar
EXPOSE 8080
CMD ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
