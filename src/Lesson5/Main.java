package Lesson5;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){

        File inputFile = new File("src/input.txt");
        File outputFile = new File("src/output2.txt");


        char a = 'a';
        System.out.println((a+1)); //a1

        //массив
        ArrayList<Byte> data = new ArrayList<>();

        try (FileInputStream fileInputStream = new FileInputStream(inputFile)) {
            byte b;
            while ((b = (byte) fileInputStream.read()) != -1) {
                data.add(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Алгоритм
        String firstMessage = "";
        String finalMessage;

        for (byte b: data) {
            firstMessage += (char) b;
        }

        if (firstMessage.equals("Cats")) {
            finalMessage = "Cats sent";
        }
        else {
            finalMessage = "I don't know how to respond";
        }

        byte[] bytesToSend = finalMessage.getBytes();

        // 14:45 -> 14:50 -> 14:50 - 14:45 = 5 минут
        long time = System.currentTimeMillis();
        try (BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(outputFile))) {
            for (int i = 0; i < 1024*1024*4; i++) {
                bufferedOutputStream.write('a');
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(System.currentTimeMillis() - time);


        File file = new File("dataInput.txt");

        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file))) {
            dataOutputStream.writeDouble(1256.1234);
            dataOutputStream.writeDouble(1256.1234);
            dataOutputStream.writeDouble(1256.1234);
            dataOutputStream.writeInt(15);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));) {
            System.out.println(dataInputStream.readDouble());
            System.out.println(dataInputStream.readDouble());
            System.out.println(dataInputStream.readDouble());
            System.out.println(dataInputStream.readDouble());
        } catch (IOException e) {
            e.printStackTrace();
        }


        File file1 = new File("src/employee.txt");
        Employee employee = new Employee(20, "Leonid", 153456);

        Employee readEmployee = null;
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file1))) {
            readEmployee = (Employee) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(readEmployee);


        ArrayList<Character> dataC = new ArrayList<>();
        File file2 = new File("src/input.txt");
        try (FileReader fileReader = new FileReader(file2)) {
            char b;
            while ((b = (char) fileReader.read()) != '?') {
                dataC.add((char) b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (char b: dataC) {
            System.out.print(b);
        }


    }
}
