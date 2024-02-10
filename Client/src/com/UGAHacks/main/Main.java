package com.UGAHacks.main;

public class Main {
    public static void main(String[] args) {
        // Server's hostname or IP. Use "localhost" if the server is running on the same machine
        String host = "localhost";
        int port = 8080; // Server port number

        Client client = new Client(host, port);
        client.connect();

        // The client is now attempting to connect to the server on port 8080
    }
}