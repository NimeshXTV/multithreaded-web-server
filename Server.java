import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {

    public void handler(Socket clientSocket){
                try {
                    PrintWriter toClient = new PrintWriter(clientSocket.getOutputStream(),true);
                    BufferedReader formClient = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                    String line = formClient.readLine();
                    System.out.println("Message from the client : "+ line);
                    toClient.println("Hello from Server");
                    System.out.println(
                    Thread.currentThread().getName());
                    clientSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                
            }
    }
    public static void main(String[] args){
        int port = 8010;
        Server server = new Server();
            try (ServerSocket serverSocket = new ServerSocket(port)) {
                System.out.println("Server is listening on port " + port);
                ExecutorService pool = Executors.newFixedThreadPool(5);
                while(true){
                    Socket acceptedSocket = serverSocket.accept();
                    pool.execute(()-> server.handler(acceptedSocket));
                    // Thread thread = new Thread(()-> server.handler(acceptedSocket));
                    // thread.start();
                }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
