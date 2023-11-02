##FROM openjdk:20-ea-4-jdk AS build
#FROM adoptopenjdk:21-jdk-hotspot AS build
#COPY . .
#
#RUN apt-get update && apt-get install -y maven
#RUN mvn clean package
#
#FROM adoptopenjdk:21-jre-hotspot
#COPY --from=build /target/DBMS-Project_Snigdha-Hospitals-0.0.1-SNAPSHOT.jar DBMS-Project_Snigdha-Hospitals.jar
#EXPOSE 8080
#ENTRYPOINT ["java","-jar","DBMS-Project_Snigdha-Hospitals.jar"]

# Use AdoptOpenJDK 21.0.1 for the build stage
FROM adoptopenjdk:21-jdk-hotspot AS build
WORKDIR /app
COPY . .
RUN apt-get update && apt-get install -y maven
RUN mvn clean package

# Use AdoptOpenJDK 21.0.1 in the final image
FROM adoptopenjdk:21-jre-hotspot
WORKDIR /app
COPY --from=build /app/target/DBMS-Project_Snigdha-Hospitals-0.0.1-SNAPSHOT.jar DBMS-Project_Snigdha-Hospitals.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "DBMS-Project_Snigdha-Hospitals.jar"]
