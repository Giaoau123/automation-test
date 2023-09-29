package lab;

import java.util.Scanner;

public class lab22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int inputNum = scanner.nextInt();
        //số chẵn chia hết cho 2
        if (inputNum % 2 == 0) {
            System.out.println("Số " + inputNum + " là số chẵn. ");
        } else {
            System.out.println("Số " + inputNum + " là số lẻ. ");
        }
    }
}
