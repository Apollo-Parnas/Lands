package com.UGAHacks.main;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException
    {
        // Server's hostname or IP. Use "localhost" if the server is running on the same machine
        String host = "172.21.67.47";
        int port = 8080; // Server port number

        Client client = new Client(host, port);
        client.connect();

        // The client is now attempting to connect to the server on port 8080

        JFrame window = new JFrame();   // create a window
        window.setSize(1920, 1080);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // set window to exit when closed
        window.setLayout(new FlowLayout());
        window.setResizable(true); // prevents resizing of the window
        window.setTitle("Power");  // set name of the window
        // Add GamePanel object to main method for instantiating GUI on game launch
        GamePanel gamePanel = new GamePanel();
        window.add(gamePanel);

        window.pack();  // Causes the GUI window to be sized to fit the preferred size and layouts of its subcomponents (GamePanel class in this case)

        window.setLocationRelativeTo(null); // sets window not to be relative to any [coordinate] on the screen, therefore null defaults it to center of screen
        window.setVisible(true);    // makes window visible

        gamePanel.setupGame();
        //gamePanel.startGameThread();


    }
}