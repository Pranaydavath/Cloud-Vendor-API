# Use an official OpenJDK runtime as a parent image (Using Java 21 as specified in your pom.xml)
FROM openjdk:21-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the Maven wrapper files
COPY .mvn/ .mvn
COPY mvnw pom.xml ./

# Download dependencies (this layer is cached if pom.xml doesn't change)
RUN ./mvnw dependency:go-offline -B

# Copy the project source code
COPY src ./src

# Build the application using the Maven wrapper, skipping tests
RUN ./mvnw package -DskipTests

# Expose the port the app runs on (8081 from your application.properties)
EXPOSE 8081

# Command to run the application
# Note: Adjust the JAR file name if it's different in your 'target' directory after building
ENTRYPOINT ["java", "-jar", "target/rest-demo-0.0.1-SNAPSHOT.jar"]