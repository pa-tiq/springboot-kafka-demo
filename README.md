# springboot-kafka-demo

[Install Kafka](https://kafka.apache.org/quickstart)

Start the Kafka environment:

```bash
# Start the ZooKeeper service
bin/zookeeper-server-start.sh config/zookeeper.properties
# Start the Kafka broker service
bin/kafka-server-start.sh config/server.properties
```

Run project with:

```bash
./mvnw spring-boot:run
```

Open [localhost:8080](http://localhost:8080) to view it in your browser.
