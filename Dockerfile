FROM amazoncorretto:24-apline-jsk

COPY target/demo-0.0.1-SNAPSHOT.jar /crud-v1.jar

ENTRYPOINT ["java", "-jar", "/crud-v1.jar"]