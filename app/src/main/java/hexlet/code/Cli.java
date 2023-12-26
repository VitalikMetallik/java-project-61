package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void askUsername() {
        Scanner nameScan = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games! "
                +
                "May I have your name?");
        String name = nameScan.nextLine();
        System.out.println("Hello, " + name + "!");
    }

}
