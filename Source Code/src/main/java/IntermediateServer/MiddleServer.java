package IntermediateServer;

import java.io.*;
import java.net.*;
import java.util.*;

public class MiddleServer implements Runnable {

    private static IntermediateServerConsole ISC = new IntermediateServerConsole();
    private static ArrayList<CustomerRequests> CustomerQueue = new ArrayList<>();
    private static ArrayList<StorePage> StorePages = new ArrayList<>();
    private static ArrayList<ProductsIntermediate> ProductList = new ArrayList<>();
    private CustomerRequests CR;
    private Socket S;
    private DataOutputStream outputToServer;
    private DataInputStream inputToServer;

    public MiddleServer(int ID, Socket cSocket, Socket s1) throws IOException {
        CR = new CustomerRequests(ID, cSocket);
        CustomerQueue.add(CR);
        this.S = s1;
        this.outputToServer = new DataOutputStream(S.getOutputStream());
        this.inputToServer = new DataInputStream(S.getInputStream());
    }

    public MiddleServer() {
    }

    public void AddStorePage(StorePage SP) {
        StorePages.add(SP);
        SP.setVisible(true);
    }

    public void RemoveStorePage(StorePage SP) {
        StorePages.remove(SP);
    }

    public void UpdateStorePages() {
        for (StorePage SP : StorePages) {
            SP.BuildStorePage();
        }
    }

    public void ExitStorePage() {
        CR.setStatus("Offline");
        CR.setViewing("Welcome Page");
        ISC.UpdateQueue(CustomerQueue);
    }

    public void EnterBuyPage() {
        CR.setViewing("Product Page");
        ISC.UpdateQueue(CustomerQueue);
    }
    
    public void ExitBuyPage(){
        CR.setViewing("Store Page");
        ISC.UpdateQueue(CustomerQueue);
    }

    public static void ReceiveProducts(Socket s1) throws IOException {
        DataOutputStream output = new DataOutputStream(s1.getOutputStream());
        DataInputStream input = new DataInputStream(s1.getInputStream());
        output.writeUTF("RequestProducts");

        int NumOfProducts = input.readInt();

        for (int i = 0; i < NumOfProducts; i++) {
            ProductList.add(new ProductsIntermediate(input.readUTF(), input.readUTF(),
                    input.readUTF(), input.readInt(), input.readUTF()));
        }
        System.out.println("Done! " + ProductList.size() + " Products Found");
    }

    public void UpdateProduct(String ProductName) throws IOException {
        System.out.println("Sending confirmation message to customer...");
        CR.getCoutput().writeUTF("You have bought a " + ProductName);
        System.out.println("Sending request to main server to update product stock...");

        outputToServer.writeUTF(ProductName);
        System.out.println("Response from the main server: " + inputToServer.readUTF());
    }

    @Override
    public void run() {
        try {

            StorePage SP = new StorePage(this, ProductList);
            AddStorePage(SP);
            CR.setStatus("Online");
            CR.setViewing("Store Page");
            ISC.UpdateQueue(CustomerQueue);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws IOException {

        System.out.println("Connecting to main Server...");
        Socket s1 = new Socket("localhost", 3000);
        System.out.println("Connected!");
        System.out.println("Requesting Data...");
        ReceiveProducts(s1);

        System.out.println("Opening Intermediate Server to clients...");
        ServerSocket sSocket = new ServerSocket(2000);
        System.out.println("Listening");
        ISC.setVisible(true);

        int ID = 1;
        while (true) {
            Socket S = sSocket.accept();
            System.out.println("Connected");

            Thread Client = new Thread(new MiddleServer(ID++, S, s1));
            Client.start();
        }
    }
}
