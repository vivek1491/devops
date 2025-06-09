# Use a base image with Java 17
FROM openjdk:21-jdk

EXPOSE 8080

# Set the working directory
WORKDIR /app

# Copy the JAR file into the container
COPY target/*.jar spring-boot-docker.jar

# Command to run the application
ENTRYPOINT ["java", "-jar", "spring-boot-docker.jar"]