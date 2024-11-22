package circle;

import java.util.Scanner;

public class Circle {
    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }
    public void nhap(){
        System.out.println("nhap thong tin hinh tron");
        Scanner sc = new Scanner(System.in);
        System.out.printf("nhap ban kinh: "); radius = sc.nextDouble();
    }
    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + ", Area="+ getArea() + '}';
    }
}
