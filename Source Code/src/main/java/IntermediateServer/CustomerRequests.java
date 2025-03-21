package IntermediateServer;

import java.io.*;
import java.net.Socket;

public class CustomerRequests {

    private int ID;
    private String Name;
    private Socket CustomerSocket;
    private DataInputStream Cinput;
    private DataOutputStream Coutput;
    private String Status;
    private String Viewing;

    public CustomerRequests(int ID, Socket CustomerSocket) throws IOException {
        this.ID = ID;
        this.CustomerSocket = CustomerSocket;
        this.Cinput = new DataInputStream(CustomerSocket.getInputStream());
        this.Coutput = new DataOutputStream(CustomerSocket.getOutputStream());
        this.Name = Cinput.readUTF();
    }

    public void closeConnection() throws IOException {
        Cinput.close();
        Coutput.close();
        CustomerSocket.close();
    }

    public CustomerRequests() {
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public Socket getCustomerSocket() {
        return CustomerSocket;
    }

    public DataInputStream getCinput() {
        return Cinput;
    }

    public DataOutputStream getCoutput() {
        return Coutput;
    }

    public String getStatus() {
        return Status;
    }

    public String getViewing() {
        return Viewing;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public void setViewing(String Viewing) {
        this.Viewing = Viewing;
    }
}
