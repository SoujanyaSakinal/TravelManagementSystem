FROM eclipse-temurin:21-jdk

WORKDIR /app

COPY dist/Travel_Management_System.jar app.jar

CMD ["java", "-jar", "app.jar"]
