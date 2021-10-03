FROM openjdk:11
VOLUME /tmp
ADD build/libs/controle-fianceiro-eureka-server-0.0.1-SNAPSHOT.jar controle-financeiro-eureka-server.jar
ENTRYPOINT ["java","-jar","/controle-financeiro-eureka-server.jar"]