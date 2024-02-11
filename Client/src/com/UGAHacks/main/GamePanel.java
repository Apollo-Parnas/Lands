package com.UGAHacks.main;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Objects;

public class GamePanel extends JPanel implements Runnable
{

    // Screen size
    private final int screenWidth = 1920;
    private final int screenHeight = 1080;

    public GamePanel() {
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);   // improves game's rendering performance by drawing rendered images off-screen
        //this.addKeyListener(keyHandler);
        this.setFocusable(true);    // allows GamePanel to be focused to receive key input [over other applications?]
    }

    public void setupGame() throws IOException
    {
        BufferedImage image;
        try {
            image = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/u_card0.png"))); // image = ImageIO.read(getClass().getResourceAsStream("/back0.png"));
            Graphics2D g2 = image.createGraphics();
            g2.drawImage(image, 0, 0, 814, 1114, null);
            g2.dispose();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        // playMusic(0);
    }

    @Override
    public void run()
    {
    }
}
