FROM tomcat
MAINTAINER Jef De Smedt <Jef.DeSmedt@betavzw.org>
LABEL Een testje

COPY tomcat-users.xml /usr/local/tomcat/conf/

EXPOSE 8080
