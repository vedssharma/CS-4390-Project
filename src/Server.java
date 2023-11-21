import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws Exception{
        String clientExpression;
        String result;

        // Server socket
        ServerSocket welcomeSocket = new ServerSocket(6789);

        while(true){
            // Accept client connection
            Socket clientSocket = welcomeSocket.accept();

            // Client input stream
            BufferedReader inFromClient = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            // Output stream to client
            DataOutputStream outToClient = new DataOutputStream(clientSocket.getOutputStream());

            // Read expression from client
            clientExpression = inFromClient.readLine();

            //Calculate the result of the expression

            // Send result to client

        }

    }
}
