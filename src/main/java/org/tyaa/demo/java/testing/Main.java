package org.tyaa.demo.java.testing;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* for(var arg : args) {
            System.out.println(arg);
        } */
        Integer x, y = null;
        if (args.length == 2
                && args[0].contains("-Dx=")
                && args[1].contains("-Dy=")
        ) {
            x = Integer.valueOf(args[0].replace("-Dx=", ""));
            y = Integer.valueOf(args[1].replace("-Dy=", ""));
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.println("First number: ");
            x = scanner.nextInt();
            System.out.println("Second number: ");
            y = scanner.nextInt();
        }
        System.out.println(DemoClass.multiply(x, y));
    }
}
