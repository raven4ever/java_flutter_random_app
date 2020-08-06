# build the source code of the app
FROM maven:3-openjdk AS BUILDER

WORKDIR /build

COPY pom.xml .
RUN mvn dependency:go-offline

COPY src/ ./src/

RUN mvn package -DskipTests

# copy JAR to runtime container
FROM openjdk

COPY --from=BUILDER /build/target/randombackendapp*.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]
