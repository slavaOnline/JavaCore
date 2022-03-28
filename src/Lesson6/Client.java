package Lesson6;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Client {

    public static void main(String[] args) {
        try(Socket socket = new Socket("127.0.0.1", 5000)) { //ip + port

            try(DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream())) {
                dataOutputStream.writeBytes("Hello server");
                System.out.println("Сообщение отправил");
            }

            try(DataInputStream dataInputStream = new DataInputStream(socket.getInputStream())) {
                System.out.println("Сообщение получил");
                String request = dataInputStream.readLine();
                System.out.println(request);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
