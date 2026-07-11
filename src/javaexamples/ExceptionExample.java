package javaexamples;

public class ExceptionExample {

    public static void main(String[] args) {

        try {

            int result = 10 / 0;

        } catch(Exception e) {

            System.out.println(e.getMessage());

        }
    }
}