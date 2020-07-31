package Lab2;

import java.util.Scanner;



public class Exercise1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("number 1: ");
        double b1 = scanner.nextDouble();
        System.out.print("number 2: ");
        double b2 = scanner.nextDouble();
        System.out.print("number 3: ");
        double b3 = scanner.nextDouble();
        System.out.print("numner 4: ");
        double b4 = scanner.nextDouble();
        System.out.print("number 5: ");
        double b5 = scanner.nextDouble();

        double total = b1 + b2 + b3 + b4 + b5;
        System.out.print("ผลรวมคือ"+total);
        System.out.print("total / 5");


    }

}//main
