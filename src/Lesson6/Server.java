package Lesson6;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {
        try(ServerSocket serverSocket = new ServerSocket(5000)) { //ip + port

            Socket socket = serverSocket.accept();

            try(DataInputStream dataInputStream = new DataInputStream(socket.getInputStream())) {
                System.out.println("Сообщение получил");
                String request = dataInputStream.readLine();
                System.out.println(request);
            }


            try(DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream())) {
                dataOutputStream.writeBytes("Hello client");
                System.out.println("Сообщение отправил");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
