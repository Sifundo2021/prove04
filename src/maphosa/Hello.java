package maphosa;

import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.printf("Enter your name: ");
        String userName = name.nextLine();
        System.out.println("Hello, my name is: "+ userName);

    }
}
