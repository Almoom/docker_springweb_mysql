FROM debian

RUN apt update -y && \
	apt upgrade -y && \
	apt install -y tzdata default-jdk default-jre git emacs maven

COPY q1 /restService
WORKDIR /restService
RUN mvn package -DskipTests=true
ENTRYPOINT java -jar target/serving-web-content-0.0.1-SNAPSHOT.jar

# How to build it?
# docker build -t b01 .

# How to run it?
# docker run --rm -ti b01