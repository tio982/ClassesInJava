public class Circle {
    private double radius;
    private final double PI = 3.14;

    public Circle() {
        this.radius = 0.0;

    }

    public Circle(double radius) {
        this.radius = radius;

    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public double getCircumference(){
        return 2*PI*this.radius;

    }
}
