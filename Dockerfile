#FROM openjdk:11-slim as build
#LABEL maintainer="Sergey Ignatyuk <signatuk89@gmail.com>"
#ARG JAR_FILE=target/*.jar
#COPY ${JAR_FILE} careerboot.jar
#RUN mkdir -p target/dependency && (cd target/dependency; jar -xf /careerboot.jar)
#FROM openjdk:11-slim
#VOLUME /tmp
#ARG DEPENDENCY=/target/dependency
#COPY --from=build ${DEPENDENCY}/BOOT-INF/lib /app/lib
#COPY --from=build ${DEPENDENCY}/META-INF /app/META-INF
#COPY --from=build ${DEPENDENCY}/BOOT-INF/classes /app
#ENTRYPOINT ["java","-cp","app:app/lib/*", "com.careerboot.CareerBootApplication"]

#FROM openjdk:11-slim
#
#ARG JAR_FILE=target/*.jar
#COPY ${JAR_FILE} app.jar
#
#EXPOSE 8080
#
#ENTRYPOINT ["java","-jar","/app.jar"]