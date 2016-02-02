package ua.sjerra.book.net;

import java.io.BufferedReader;
import java.net.Socket;
import java.util.ArrayList;

/**
 * Created by maxura on 03.02.2016.
 */
public class VerySimpleChatServer {
    ArrayList clientOutputStream;
    public class ClientHandler implements Runnable {
        BufferedReader reader;
        Socket sock;

        @Override
        public void run() {

        }
    }
}
