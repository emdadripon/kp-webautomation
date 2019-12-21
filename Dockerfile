FROM openjdk:8u191-jre-alpine3.8

# Workspace
WORKDIR /Users/emdadripon/documents/dockerworkspace

# ADD.jar under target from host
# into this image
ADD target/kp_page.jar        kp_page.jar
ADD target/kp_page-tests.jar  kp_page-tests.jar
ADD target/libs                       libs

# in case of any other dependency like .csv / .json / .xls
#please ADD that as well
# ADD suite files

ADD kppagetestrunner.xml            kppagetestrunner.xml


#BROWSER
#HUB_HOST
#MODULE

ENTRYPOINT java -cp selenium-docker.jar:selenium-docker-tests.jar:libs/* -DBROWSER=$BROWSER -DHUB_HOST=$HUB_HOST org.testng.TestNG $MODULE
