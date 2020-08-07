package Lab2;

import java.util.Scanner;

//
public class Exercise3 {
    public static void main(String[] args) {
        //ค่างวดผ่อนรถ ราคารถ x เงินดาว Y ดอกเบี่ย Z ค่างวด W
        Scanner scanner = new Scanner(System.in);
        //รับค่าราคารถ
        System.out.print("ราคารถ: ");
        double x = scanner.nextDouble();

        //รับค่าเงินดาว
        System.out.print("ราคาเงินดาว: ");
        double Y = scanner.nextDouble();
        //รับค่าดอกเบี้ย
        System.out.print("ดอกเบี้ย: ");
        double z = scanner.nextDouble();
        //รับค่างวด
        System.out.print("จำนวนงวด(ต่องวด): ");
        int w = scanner.nextInt();
        double a = x - Y ;
        double b = a * (z/100)*(w/12) ;
        double c = a + b;
        double d = c / (w);
        //display
        System.out.print("ผ่อนงวดละ: "+d);







    }//main
}//class
