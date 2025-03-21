package MainServer;

import java.io.*;
import java.net.*;
import java.util.*;

public class SingleThreadServer implements Runnable {

    private static Products Tshirt = new Products("Cool T-Shirt", "Super Soft Cotton Regular Fit Tshirt", "$100", 3, "icons/TShirt.jpg");
    private static Products Hat = new Products("Stylish Hat", "High Quality, Rounded Hat", "$70", 3, "icons/Hat.jpg");
    private static Products Shoe = new Products("Fancy Shoe", "Classic British Hand-Crafted Oxfords Shoes", "$120", 3, "icons/Shoe.jpg");
    private static ArrayList<Products> ProductList = new ArrayList<>(Arrays.asList(Tshirt, Hat, Shoe));
    Socket cSocket;
    private static DataOutputStream output;
    private static DataInputStream input;

    public SingleThreadServer(Socket cSocket) throws IOException {
        this.cSocket = cSocket;
        this.output = new DataOutputStream(cSocket.getOutputStream());
        this.input = new DataInputStream(cSocket.getInputStream());
    }

    public static void SendProducts() throws IOException {

        if (input.readUTF().equals("RequestProducts")) {
            output.writeInt(ProductList.size());
            for (Products P : ProductList) {
                output.writeUTF(P.getProductName());
                output.writeUTF(P.getProductDescription());
                output.writeUTF(P.getProductPrice());
                output.writeInt(P.getProductStockLevel());
                output.writeUTF(P.getProductImage());
            }
        }
    }

    @Override
    public void run() {
        try {
            while (true) {
                boolean ProductFound = false;

                String PName = input.readUTF();

                for (Products P : ProductList) {
                    if (P.getProductName().equals(PName)) {
                        P.setProductStockLevel(P.getProductStockLevel() - 1);
                        System.out.println("1 " + P.getProductName() + " got sold.");
                        System.out.println("Currently Avalaibe: " + P.getProductStockLevel());
                        ProductFound = true;
                        break;
                    }
                }

                if (ProductFound) {
                    output.writeUTF("Acknowledged");
                } else {
                    output.writeUTF("Product Not Found");
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Opening Main Server to Intermediate Server...");
        ServerSocket sSocket = new ServerSocket(3000);
        System.out.println("Listening");
        while (true) {
            Socket S = sSocket.accept();
            Thread Client = new Thread(new SingleThreadServer(S));
            System.out.println("Connected");
            System.out.println("Sending Available Products to Intermediate Server...");
            SendProducts();
            System.out.println("Done! " + ProductList.size() + " Products Sent");
            Client.start();
        }
    }
}
