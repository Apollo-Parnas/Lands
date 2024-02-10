package com.UGAHacks.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.util.Set;

public class Server  implements Runnable
{

    private int port;
    private boolean running;
    private Selector selector;
    private ServerSocket serverSocket;
    private ByteBuffer buffer;

    public Server(int port, int bufferSize)
    {
        this.port = port;
        this.buffer = ByteBuffer.allocate(bufferSize);
    }

    public void start()
    {
        new Thread(this).start();
    }

    @Override
    public void run()
    {
        running = true;
        while(running)
        {
            try
            {
                int client = selector.select();

                if (client == 0)
                {
                    continue;
                }

                Set<SelectionKey> keys = selector.selectedKeys();
            } catch (IOException e)
            {
                throw new RuntimeException(e); // https://youtu.be/9vz-Dcdl8JA?si=VNgWorOfnfeAk19w&t=366
            }
        }
    }

}
