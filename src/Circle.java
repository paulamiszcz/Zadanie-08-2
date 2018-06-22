public class Circle extends GeometricShape {
    private double r;
    private final double PI = 3.14;

    public Circle(double r){
        this.r = r;
    }
    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getPI() {
        return PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                ", PI=" + PI +
                '}';
    }
}
