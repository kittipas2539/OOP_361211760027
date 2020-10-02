package Lap7;

public class Employee {

        private String name;
        private int age;
        private String designation;
        private double salary;
        //constructor
        public Employee(){
        }

        public Employee(String name,int age,String desiagntion,double salary){

            this.name = name;
            this.age = age;
            this.designation = desiagntion;
            this.salary = salary;

        }

        public String getName() {
        return name;
        }
        public void setName(String newname){
            name = newname;
        }
        public double getAge(){
            return age;
        }
        public void  setAge(int newage){
            age = newage;
        }
        public String getDesignation(){
            return designation;
        }
        public void setDesignation(String newDesigntion){
            designation = newDesigntion;
        }
        public double getSalary(){
            return salary;
        }
        public void setSalary(double newSalary){
            salary =newSalary;
        }


    @Override
    public String toString() {
        return "Employee{" +
                "name=" + name +
                ", age=" + age +
                ", designation=" + designation +
                ", salary=" + salary +
                '}';
    }
}//class

