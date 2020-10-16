package Lab8;

public class StudentApp {
    public static void main(String[] args) {

        Person p = new Person("kittipas chanapan",34,"man");


        Student std1 = new Student("kittipas",25,"men");

        System.out.println(p.toString());
        System.out.println(std1.toString());


        std1.setSid("027");
        std1.setMajor("MIT");

        System.out.println(std1.toString());

        System.out.println(std1.getName());






    }//main

}//class
