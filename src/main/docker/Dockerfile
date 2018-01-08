# From the openjdk 8 alpine in dockerhub
FROM openjdk:8-jre-alpine

# Add our project specific scripts, configs and deployment files
ADD dccf-billing-1.0.0-SNAPSHOT.jar  /dccf-billing-1.0.0-SNAPSHOT.jar

MAINTAINER pputta "pramod.putta@centurylink.com"

EXPOSE 20004

CMD ["java","-jar", "/dccf-billing-1.0.0-SNAPSHOT.jar"]
