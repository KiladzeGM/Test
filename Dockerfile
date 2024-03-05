FROM openjdk:17
COPY target /app
WORKDIR /app
ENTRYPOINT ["sh", "-c", "java -jar /app/Test-1.0-SNAPSHOT.jar & tail -f /dev/null"]