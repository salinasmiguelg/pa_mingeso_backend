FROM openjdk:11
EXPOSE 8080
RUN mkdir -p /app/
ADD build/libs/pa_back-0.0.1-SNAPSHOT.jar /app/pa_back-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar", "/app/pa-mingeso-back-0.0.1-SNAPSHOT.jar"]
