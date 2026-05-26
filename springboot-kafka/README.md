1. Create a docker-compose.yml file in your project root:
2. Start Kafka:
docker-compose up -d
3. Verify Kafka is running:
docker ps
You should see both zookeeper and kafka containers running.

4. Now start your Spring Boot application:
mvn clean compile
mvn clean install
mvn spring-boot:run

9. Test the Application

# Start the Spring Boot application
mvn spring-boot:run

# Send a message
curl -X POST http://localhost:8080/api/kafka/publish \
  -H "Content-Type: application/json" \
  -d '{"id":"1","message":"Hello Kafka"}'