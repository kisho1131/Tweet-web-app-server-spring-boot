FROM openjdk:17-oracle
ADD target/tweet-app-server-0.0.2-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]

