package com.epam.rd.autotasks.meetstrangers;

import java.util.Scanner;

public class HelloStrangers {
    public static void main(String[] args) {
        //Write a program, asks for a number - amount of strangers to meet.
        //Then reads stranger names line by line and prints line by line "Hello, ...".

        //System.out.println("Enter number of person >> ");
        Scanner scanner = new Scanner(System.in);
        int personNumber = scanner.nextInt();

        if (personNumber > 0) {
            //System.out.println("Enter strangers names >> ");
            for (int i = 0; i < personNumber; i++) {
                Scanner sc = new Scanner(System.in);
                String name = sc.nextLine();
                System.out.println("Hello, " + name);
            }
        }else if (personNumber == 0) {
            System.out.println("Oh, it looks like there is no one here");
        } else {
            System.out.println("Seriously? Why so negative?");
        }
    }
}

