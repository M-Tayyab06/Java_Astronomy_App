FROM openjdk:17

WORKDIR /app 

COPY build/libs/AstronomyApp.jar /app/AstronomyApp.jar

CMD ["java", "-jar", "AstronomyApp.jar"]