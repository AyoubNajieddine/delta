#!/bin/bash

# runing maven clean and goal
mvn clean package
# copying package to webapps
echo "copiying file to tomcat webpapp"
cp /home/hhmaster/Documents/workspace/delta_parc/target/delta_parc.war /home/hhmaster/Documents/apache-tomcat-9.0.12/webapps/

