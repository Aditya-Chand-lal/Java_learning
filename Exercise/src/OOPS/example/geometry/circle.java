package OOPS.example.geometry;

public class circle {
    public float radius;
    public int diameter;

    public circle(float radius) {
        this.radius = radius;
        this.diameter = (int) (2 * radius);
    }
    public circle(int diameter) {
        this.radius = (float)(diameter/2);
        this.diameter = diameter;
    }



}

