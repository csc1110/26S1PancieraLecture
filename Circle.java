public class Circle {
    private int radius;
    private int diameter;
    private double area;

    public Circle(int radius) {
        this.radius = radius;
        this.diameter = radius * 2;
        this.area = Math.PI * Math.pow(radius,2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", area=" + area +
                '}';
    }
}
