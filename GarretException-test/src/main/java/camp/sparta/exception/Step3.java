package camp.sparta.exception;

import java.io.*;
import java.util.Scanner;

public class Step3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String readFile = sc.nextLine();
        String writeFile = sc.nextLine();

        Step1 step1 = new Step1();
        try {
            step1.fileReadAndWrite(readFile, writeFile);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}