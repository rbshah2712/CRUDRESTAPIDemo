#!/bin/bash

APP_DIR="/home/ec2-user/CRUDRESTAPIDemo"
PID_FILE="$APP_DIR/application.pid"

if [ -f "$PID_FILE" ]; then
    PID=$(cat "$PID_FILE")

    if kill -0 "$PID" 2>/dev/null; then
        echo "Stopping application PID $PID"
        kill "$PID"
        sleep 5
    fi

    rm -f "$PID_FILE"
fi

exit 0