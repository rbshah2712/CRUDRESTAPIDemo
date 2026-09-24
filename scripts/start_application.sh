#!/bin/bash

APP_DIR="/home/ec2-user/CRUDRESTAPIDemo"

cd "$APP_DIR" || exit 1

JAR_FILE=$(find "$APP_DIR/target" -maxdepth 1 -type f -name "*.jar" | head -n 1)

if [ -z "$JAR_FILE" ]; then
    echo "ERROR: No JAR file found in $APP_DIR/target"
    exit 1
fi

echo "Starting application: $JAR_FILE"

nohup java -jar "$JAR_FILE" > "$APP_DIR/application.log" 2>&1 &

echo $! > "$APP_DIR/application.pid"

echo "Application started with PID $(cat "$APP_DIR/application.pid")"

exit 0