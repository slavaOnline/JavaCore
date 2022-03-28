package Lesson2;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String variant;

        do {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            variant = scanner.next();

            int[] ourNums = {a, b};

            if (variant.equals("1")) {
                System.out.println(sum(ourNums));
            }
            else if (variant.equals("2")) {
                System.out.println(minus(ourNums));
            }
            else if (variant.equals("3")) {
                System.out.println(multiply(ourNums));
            }
            else if (variant.equals("4")) {
                try {
                    System.out.println(divide(ourNums));
                } catch (ArithmeticException e) {
                    e.printStackTrace();
                    System.out.println("Я обрабатываю только арифметику");
                } catch (Exception e) {
                    System.out.println("Я обрабатываю вообще всё");
                }   finally {
                    System.out.println("Я выполнюсь сто процентов");
                }


            }
            else if (variant.equals("5")) {

                try {
                    System.out.println(divideAsFormula(ourNums));
                } catch (MyCalculusException e) {
                    e.printStackTrace();
                }


            }
            else if (variant.equals("6")) {
                break;
            }
            else {
                System.out.println("Вы ввели не то");
            }

        } while (true);

        System.out.println("Спасибо что пользовались нашим супер крутым калькулятором B)");
        System.out.println("Поддержите проект переведя 50р на номер 8(800)555-35-35");


    }

    public static int sum(int[] arr) {
        return arr[0] + arr[1];
    }

    public static int minus(int[] arr) {
        return arr[0] - arr[1];
    }

    public static int multiply(int[] arr) {
        return arr[0] * arr[1];
    }

    public static int divide(int[] arr) {
        return arr[0] / arr[1];
    }

    public static int divideAsFormula(int[] arr) throws MyCalculusException {

        Integer integer;

        if (arr[1] == 7) {
            throw new MyCalculusException("Почему тут семь, ты чево ноделол ;( ..." + " " + arr[1]);
        }

        return (arr[0] + 2) - arr[1];
    }




}
