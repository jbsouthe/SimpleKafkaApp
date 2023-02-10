#!/bin/zsh

if [ ! -f ./JavaAgent/javaagent.jar ]; then
    echo "./JavaAgent/javaagent.jar not found!"
    exit
fi

JAVAAGENT="-javaagent:./JavaAgent/javaagent.jar"

java $JAVAAGENT -jar $1 
