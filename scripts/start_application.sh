#!/bin/bash

cd /home/ec2-user/CRUDRESTAPIDemo

JAR_FILE=$(find . -name "*.jar" | head -n 1)

echo "Starting $JAR_FILE"

nohup java -jar "$JAR_FILE" > application.log 2>&1 &

echo $! > application.pid