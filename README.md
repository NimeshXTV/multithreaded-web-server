# Multithreaded Web Server (Java)

A simple multithreaded client-server application built using Java sockets, threads, and thread pools.

## Features
- TCP socket communication
- Multithreaded server
- Thread pool using ExecutorService
- Concurrent client handling
- Bidirectional communication between client and server

## Concepts Practiced
- ServerSocket vs Socket
- Blocking I/O
- Runnable and Threads
- Lambda Expressions
- ExecutorService
- Fixed Thread Pool
- Concurrent Client Handling

## Technologies Used
- Java
- Socket Programming
- Multithreading

## Project Structure

```text
.
├── Client.java
├── Server.java
├── README.md
└── .gitignore
```

## How to Run

### 1. Compile

```bash
javac Server.java
javac Client.java
```

### 2. Run Server

```bash
java Server
```

### 3. Run Client

```bash
java Client
```

## Example Output

### Server

```text
Server is listening on port 8010
Message from the client : Hello from the client
Message from the client : Hello from the client
```

### Client

```text
Response from the socket is : Hello
Response from the socket is : Hello
```

## Learning Outcomes
Through this project, I practiced:
- Socket communication in Java
- Handling multiple clients concurrently
- Creating and managing threads
- Using thread pools for optimized concurrency
- Understanding blocking I/O
- Basic client-server architecture