package com.UGAHacks.server;

public class Main {

    public static void main(String[] args) {
        int port = 8080; // Example port number
        Server server = new Server(port);
        server.start();
    }

}
