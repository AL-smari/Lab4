// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        Circle c1 = new Circle(4);
        System.out.println("the area: "+c1.calculateArea());
        System.out.println("the circumference: "+c1.calculateCircumference());
        System.out.println("the radius is :"+c1.getRadius());
        //setRadius test
        c1.setRadius(7);
        System.out.println("-------------------------------------");
        System.out.println("the area: "+c1.calculateArea());
        System.out.println("the circumference: "+c1.calculateCircumference());
        System.out.println("the radius is :"+c1.getRadius());

        System.out.println("-------------------------------------");

        Rectangle r1 = new Rectangle(5,6);
        System.out.println("the area: "+r1.calculateArea());
        System.out.println("the circumference: "+r1.calculateCircumference());
        System.out.println("the width: "+r1.getWidth()+"\nthe height: "+r1.getHeight());
        //setWidth and setHeight test
        System.out.println("-------------------------------------");
        r1.setWidth(8);
        r1.setHeight(3);
        System.out.println("the area: "+r1.calculateArea());
        System.out.println("the circumference: "+r1.calculateCircumference());
        System.out.println("the width: "+r1.getWidth()+"\nthe height: "+r1.getHeight());

        System.out.println("-------------------------------------");

        Triangle t1 = new Triangle(7,9);
        System.out.println("the area: "+t1.calculateArea());
        System.out.println("the circumference: "+t1.calculateCircumference());
        System.out.println("the base: "+t1.getBase()+"\nthe height: "+t1.getHeight());
        //setBase and setHeight test
        System.out.println("-------------------------------------");
        t1.setBase(12);
        t1.setHeight(14);
        System.out.println("the area: "+t1.calculateArea());
        System.out.println("the circumference: "+t1.calculateCircumference());
        System.out.println("the base: "+t1.getBase()+"\nthe height: "+t1.getHeight());







    }
}