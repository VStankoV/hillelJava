package L05_OOP.homeWork;

public class Circle {
    int radius;

    public Circle( int radius) {
        this.radius = radius;
    }

    public static double calcArea (Circle c){
        return Math.PI * c.radius * c.radius;
    }

}
