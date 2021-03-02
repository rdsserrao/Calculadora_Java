FROM openjdk:16-jdk-alpine
COPY *.jar /app/calc.jar
ENTRYPOINT ["java","-jar","/app/calc.jar"]