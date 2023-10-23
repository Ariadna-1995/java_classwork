FROM ubuntu:latest
COPY ./src ./src
RUN mkdir ./out
RUN javac -sourcepath ./src -d out ./src/main/java/Main.java
CMD java -classpath ./out main.java.Main
