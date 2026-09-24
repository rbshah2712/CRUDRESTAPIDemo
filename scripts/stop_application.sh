#!/bin/bash

if [ -f /home/ec2-user/CRUDRESTAPIDemo/application.pid ]; then

    PID=$(cat /home/ec2-user/CRUDRESTAPIDemo/application.pid)

    if kill -0 "$PID" 2>/dev/null; then
        kill "$PID"
    fi

    rm -f /home/ec2-user/CRUDRESTAPIDemo/application.pid
fi

exit 0