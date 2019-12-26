FROM openjdk:13-alpine

COPY target/mail-app-*.jar /opt/mail-app.jar

CMD ["java", "-jar", "-Dspring.profiles.active=default", "/opt/mail-app.jar"]