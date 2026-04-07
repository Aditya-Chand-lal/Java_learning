package OOPS.example.utils;

import OOPS.example.geometry.Rectangle;
import OOPS.example.geometry.circle;

public class Calculator {
    public static void main(String[] args) {
        circle c1 = new circle(6);
        Rectangle R1 = new Rectangle(10,5);

        float areaCir = (float) (Math.PI * c1.radius * c1.radius);
        double areaRect = R1.breadth * R1.length;

        System.out.printf("Area of circle is    : %f\nArea of Rectangle is : %f",areaCir,areaRect );

    }
}
