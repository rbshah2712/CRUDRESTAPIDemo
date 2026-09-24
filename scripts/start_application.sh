#!/bin/bash

cd /home/ec2-user/app

JAR_FILE=$(find . -name "*.jar" | head -n 1)

nohup java -jar "$JAR_FILE" > application.log 2>&1 &