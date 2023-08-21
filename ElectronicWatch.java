package com.comname.rd.autotasks.meetautocode;

import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a < 86400) {
            int h = ((a / 60) / 60);
            int m = ((a / 60) % 60);
            int s = (a % 60);
            if (m > 9) {
                if (s > 9)
                    System.out.println(h + ":" + m + ":" + s);
                else
                    System.out.println(h + ":" + m + ":" + "0" + s);
            } else {
                if (s > 9)
                    System.out.println(h + ":" + "0" + m + ":" + s);
                else
                    System.out.println(h + ":" + "0" + m + ":" + "0" + s);
            }

        } else {
            int h = (((a / 60) / 60) % 24);
            int m = ((a / 60) % 60);
            int s = (a % 60);
            if (m > 9) {
                if (s > 9)
                    System.out.println(h + ":" + m + ":" + s);
                else
                    System.out.println(h + ":" + m + ":" + "0" + s);
            } else {
                if (s > 9)
                    System.out.println(h + ":" + "0" + m + ":" + s);
                else
                    System.out.println(h + ":" + "0" + m + ":" + "0" + s);
            }

        }

    }
}

