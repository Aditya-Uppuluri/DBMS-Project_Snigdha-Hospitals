FROM maven:3.1.5-openjdk-17 AS build 
COPY . . 
RUN mvn clean package --DskipTests

FROM openjdk:20-jdk-slim
COPY --from=build /target/DBMS-Project_Snigdha-Hospitals-0.0.1-SNAPSHOT.jar DBMS-Project_Snigdha-Hospitals.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","DBMS-Project_Snigdha-Hospitals.jar"]

