FROM openjdk:8
ADD target/demo.jar /usr/src/myapp.jar
WORKDIR  /usr/src
ENV JAVA_OPTS="-Xdebug -Xrunjdwp:server=y,transport=dt_socket,address=8787,suspend=n"
EXPOSE 8080 8787
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -Dspring.config.location=/usr/include/application.yaml -jar myapp.jar" ]