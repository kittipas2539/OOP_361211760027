package Lab8;

public class AnimalApp {

    public static void main(String[] args) {


        Dog d = new Dog("mama",5);
        Cat c = new Cat("zala", 4);

        d.makeNoise();
        d.makeNoise();

        //polymorphism หรือ การพ้องรูป
        Animal A1 = new Dog("sara",5);
        Animal A2 = new Cat("hola",8);

        A1.makeNoise();
        A2.makeNoise();



    }
}
