package Lap7;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("How many you employee:");
        int emp = sc.nextInt();
        //list use to stored object
        ArrayList<Employee> myEmp = new ArrayList<Employee>();
        //input employee
        myEmp = inputEmpData(myEmp,emp);

        //display employee data
        displayEmpData(myEmp);





    }

    private static void displayEmpData(ArrayList<Employee> myEmp) {
        System.out.println("Your employee info below:");
        for (Employee e:myEmp) {
           System.out.println(e.toString());
        }//for
    }//displayEmpdata

    private static ArrayList<Employee> inputEmpData(ArrayList<Employee> myEmp, int emp) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee data below:");
        for (int i = 0; i <emp ; i++) {
            //input
            System.out.print("Enter employee data name");
            String name = sc.nextLine();
            System.out.print("Enter employee data age");
            String age = sc.nextLine();
            System.out.print("Enter employee data designation");
            String designation = sc.nextLine();
            System.out.print("Enter employee data salary");
            String salary = sc.nextLine();

            myEmp.add(new Employee(name,Integer.parseInt(age),designation,Double.parseDouble(salary)));


        }//for
        return myEmp;
    }//inputEmpData

}//class
