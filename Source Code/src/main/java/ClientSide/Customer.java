package ClientSide;

import java.io.*;
import java.net.Socket;

public class Customer {

    public void ConnectToIntermediate(String name) throws IOException {

        Socket CustomerSocket = new Socket("localhost", 2000);

        DataOutputStream output = new DataOutputStream(CustomerSocket.getOutputStream());
        DataInputStream input = new DataInputStream(CustomerSocket.getInputStream());
        output.writeUTF(name);

        System.out.println("You have bought 1 " + input.readUTF());

        output.close();
        input.close();
        CustomerSocket.close();
    }

    public static void main(String args[]) throws IOException {
        WelcomePage WP = new WelcomePage();
        WP.setVisible(true);
    }
}
