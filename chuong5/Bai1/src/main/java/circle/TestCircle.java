package circle;

import java.util.ArrayList;
import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle circle = new Circle();
        circle.nhap();
        System.out.println("dien tich la: " + circle.getArea());
        System.out.println("thong tin cua hinh tron la: " + circle.toString());
        
        System.out.println("nhap so luong phan tu");
        CircleCollection al = new CircleCollection();
        int n = sc.nextInt();
        for(int i=0 ; i<n ; i++){
            Circle c = new Circle(Math.random());
            al.addCircle(c);
        }
   
        System.out.println("thong tin danh sach\n" + al.toString());
        System.out.println("dien tich lon nhat " + al.findMaxArea());
        System.out.println("thong tin hinh tron co dien tich nho nhat");
        double min = al.findMinArea();

        for(int i=0 ; i<n ; i++){
            if(al.getCircle(i).getArea() == min) 
                System.out.println(al.getCircle(i).toString());
        }
    }
}
