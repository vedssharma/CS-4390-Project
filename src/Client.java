import java.io.*;
import java.net.*;

public class Client {

    public static void main(String[] args) throws Exception{
        String expression;
        String result;

        // Client input stream
        BufferedReader inFromClient = new BufferedReader(new InputStreamReader(System.in));

        // Client socket
        Socket clientSocket = new Socket("localhost", 6789);

        // Client output stream
        DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());

        // Input stream from server
        BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

        // Read input from client
        expression = inFromClient.readLine();

        // Send input to server
        outToServer.writeBytes(expression + "\n");

        // Read result from server and print it
        result = inFromServer.readLine();
        System.out.println("Server: " + result);

        clientSocket.close();

    }
}
