package com.UGAHacks.main;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Server's hostname or IP. Use "localhost" if the server is running on the same machine
        String host = "172.21.67.47";
        int port = 8080; // Server port number

        Client client = new Client(host, port);
        client.connect();

        // The client is now attempting to connect to the server on port 8080
    }
}