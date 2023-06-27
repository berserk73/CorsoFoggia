FROM openjdk:17-jdk-alpine
VOLUME /tmp
ARG JAVA_OPTS
ENV JAVA_OPTS=$JAVA_OPTS
ENV Xmx=-Xmx96m Xss=-Xss512k
ADD target/demo-0.0.1-SNAPSHOT.jar demo-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT exec java $JAVA_OPTS -Dms=gui -Djava.security.egd=file:/dev/./urandom -jar demo-0.0.1-SNAPSHOT.jar
