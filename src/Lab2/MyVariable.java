package Lab2;

public class MyVariable {

    public static void main(String[] args) {

    //Data type
    //1. integer จำนวนเต็ม
    //2. floating จำนวนจริง
    //3. character ตัวอักขระ 1 ตัว
    //4. Stiring ข้อความ
    //5. boolean ค่าความจริง

    //1. integer เช่น 10 20 30 100 -15 -47
    int x; // ประกาศตัวแปรชื่อ x
    x = 10;
    System.out.println("x ="+x);
    int y = 20; // ประกาศตัวแปรชื่อ y และมีค่าเท่ากับ 20
    System.out.println("y ="+y);
    System.out.println("x+y"+(x+y));
    int z = x+y; // ประกาศตัวแปรชื่อ z มีค่าเท่ากับ x+y
    System.out.println("z ="+z);

    //2. float and double เช่น 11.11 24.54 12.12
    float a = 10.00f;
    double b = -45.85;

    //3. character เช่น a A # @ h j
    char c = 'c'; // ใช้สัญลักษณ์ '_' เพื่อระบุชนิดของข้อมูล
    System.out.println(c);
    //4. String เช่น "Hello RUTS"
    // String เป็นคลาสในภาษา Java ดังนั้นตัวแปร

        String s = "RUTS : kittipas"; // ประกาศ object ชื่อ s เก็บข้อความ "RUTS"
        System.out.println(s);
        System.out.println(s.length());
        System.out.println(s.toUpperCase()); // แปลงเป็นพิมพ์ใหญ่
        System.out.println(s.toLowerCase()); // แปลงเป็นพิมพ์เล็ก
        // concatenation string คือ การต่อข้อความ


        String msg = "chanapan";
        String conn = s+ msg; // เครื่องหมาย + เป็นการต่อข้อความสำหรับตัวแปร String
        String conn2 = s.concat(msg); // concat () ใช้ต่อข้อความเช่นเดียวกับ +

        //5. boolean เก็บค่าได้ 2 ค่า คือ true(1) และ false(0)
        boolean bb = true;
        boolean bb2 = false;
        System.out.println(bb+" "+bb2);



    }//main


}//class

