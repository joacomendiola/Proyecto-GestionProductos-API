# Etapa 1: Construcción con Maven
FROM eclipse-temurin:17-jdk AS build

WORKDIR /app
COPY . .

RUN ./mvnw clean package -DskipTests

# Etapa 2: Imagen final ligera con solo el JRE
FROM eclipse-temurin:17-jre
WORKDIR /app

COPY --from=build /app/target/*.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]