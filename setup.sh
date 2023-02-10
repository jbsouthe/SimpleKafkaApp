#!/bin/zsh

set -x

docker-compose -f ./docker-compose.yml up -d
if [[ $? -ne 0 ]]; then
  echo "Error in last command, exiting"
  exit
fi
echo "well, hopefully that finished successfully, continue!"

#removed the next two steps by adding them to the docker-compose.yml
#docker exec -it kafka /bin/sh /opt/kafka/bin/kafka-topics.sh --create --zookeeper zookeeper:2181 --replication-factor 1 --partitions 1 --topic users

#docker exec -it kafka /bin/sh /opt/kafka/bin/kafka-topics.sh --list --zookeeper zookeeper:2181
