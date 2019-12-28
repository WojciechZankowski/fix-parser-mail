FROM openjdk:13-alpine

ARG VERSION=*

COPY target/mail-app-${VERSION}.jar /opt/mail-app.jar

CMD ["java", "-jar", "-Dspring.profiles.active=default", "/opt/mail-app.jar"]