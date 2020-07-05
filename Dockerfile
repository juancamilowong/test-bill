FROM openjdk:8
VOLUME /tmp
EXPOSE 8991
ADD ./target/test-bill-1.0.jar test-bill.jar
ENTRYPOINT ["java","-jar","test-bill.jar"]