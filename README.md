# Orion
All stars are here...

Intro:-
1. This is a spring-boot-docker project where we configure Dockerfile and Spin Up the spring-boot-docker images in docker container
2. We are using one getmapping endpoint "/message" and having port 9090.

TO RUN 🦖
1. clone this repo and run mvn clean install
2. Go to root directory "D:<Path>/spring-boot-docker"
3. Open cmd and run command "docker build -t spring-boot-docker.jar"
4. Once finished then run "docker run -p 9090:8080 spring-boot-docker.jar"
  
  Now you can hit on browser "your IP address : 9090/message" and get response.
