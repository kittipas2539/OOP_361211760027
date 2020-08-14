package Lab3;

import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your Score");
        double score = scanner.nextDouble();

        // display menu
        System.out.println("What is your favorite food? ");
        System.out.println("1.KFC");
        System.out.println("2.Shabu");
        System.out.println("3.pizza");
        System.out.println("Select:");
        int s = scanner.nextInt();

        if (s == 1 ){
            System.out.println("Wow, i like berger at KFC.");
        } else if ( s == 2){
            System.out.println("you have to spend 300 THB per person.");
        } else if ( s == 3){
            System.out.println("I do like pizza. ");
        } else {
            System.out.println("please, enter score between 1-3" );
    }
















    }

}


