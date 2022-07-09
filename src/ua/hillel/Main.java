package ua.hillel;

public class Main {

    public static void main(String[] args) {
        Circle myCircle = new Circle(5.2, "white");
        System.out.println("Circle length: " + myCircle.length + "\n" +
                "Circle area: " + myCircle.area + "\n" +
                "Circle color: " + myCircle.color);
    }
}
