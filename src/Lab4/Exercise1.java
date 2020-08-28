package Lab4;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //display menu
        System.out.println("จงหาค่าของรูปเลขาคณิต");
        System.out.println("1.รูปสี่เหลี่ยม");
        System.out.println("2.รูปสามเหลี่ยม");
        System.out.println("3.รูปวงกลม");
        System.out.println("Select");
        int s = scanner.nextInt();

        switch (s) {
            case 1:findAreaRec();
            break;
            case 2:findAreaRec();
            break;
            case 3:findAreaRec();
            break;
            default:System.out.println("Please, select 1-3.thank.");
        }























    }//main
    private static void findAreaRec(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter width:");
        double x = sc.nextInt();
        System.out.print("Enter lenght:");
        double y = sc.nextDouble();
        System.out.println("The area of rectangle is:"+(x*y));
    }

    private static void findAreaRec2(){
        Scanner sc = new Scanner(System.in)
        System.out.print("Enter width");
        double x = sc.nextInt();
        System.out.print("Enter lenght");
        double y = sc.nextDouble();
        System.out.println();

    }





}//class
