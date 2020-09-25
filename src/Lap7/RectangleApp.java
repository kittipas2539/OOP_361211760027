package Lap7;

public class RectangleApp {

    public static void main(String[] args) {

        //create object of rectangle class
        Rectangle r1 = new Rectangle(); // create object as r1
        r1.setLength(10.0);
        r1.setWidth(5.0);
        //display attributes of object
        displayobjectAttribute(r1);
        //find area of rectangle
        findArea(r1);

        Rectangle r2 = new Rectangle(); // create object as r2
        r2.setLength(25.0);
        r2.setWidth(15.0);
        //display attributes of object
        displayobjectAttribute(r2);
        //find area of rectangle
        findArea(r2);

        Rectangle r3 = new Rectangle(15.0,22.0);
        displayobjectAttribute(r3);
        findArea(r3);











    }

    private static void findArea(Rectangle r) {
        System.out.println("Area of rectangle:"+r.findRectangleArea());
    }

    private static void displayobjectAttribute(Rectangle r) {
        System.out.println("length:"+r.getLength());
        System.out.println("width:"+r.getWidth());
    }

}
