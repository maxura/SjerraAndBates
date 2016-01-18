package ua.sjerra.book.net;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created by maxura on 18.01.2016.
 */
public class SimpleChatClientA {
    JTextField outgoing;
    PrintWriter writer;
    Socket sock;
    public void  go(){
        JFrame frame = new JFrame("Ludicrously Simple Chat Client");
        JPanel mainJPanel = new JPanel();
        outgoing = new JTextField(20);
        JButton sendButton = new JButton("Send");
        sendButton.addActionListener(new SendButtonListener());
        mainJPanel.add(outgoing);
        mainJPanel.add(sendButton);
        frame.getContentPane().add(BorderLayout.CENTER, mainJPanel);
 //       setUpNetworking();
        frame.setSize(400, 500);
        frame.setVisible(true);
     }
    private void setUpNetworking(){
        try {
            sock = new Socket("127.0.0.1", 5000);
            writer = new PrintWriter(sock.getOutputStream());
            System.out.println("networking established");
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
    }
    class SendButtonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                writer.println();
                writer.flush();
            }
            catch (Exception ex ){
                ex.printStackTrace();
            }
            outgoing.setText("");
            outgoing.requestFocus();
        }
    }

    public static void main(String[] args) {
        new SimpleChatClientA().go();
    }
}
