package Lap7;

public class Rectangle {
    //class attributes
    private double length;
    private double width;
    //constructor
    public Rectangle(){
    }
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double newlength) {
        length = newlength;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double newwidth){
        width = newwidth;
    }
    public double findRectangleArea(){
        return length * width; //area
    }

}//class