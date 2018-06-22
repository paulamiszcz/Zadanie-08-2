public class Ball extends Shape3D {
    private final double PI = 3.14;
    private double r;

    public Ball(double r){
        this.r =r;
    }
    public double getPI() {
        return PI;

    }


    public double getR() {
        return r;

    }


    public void setR(double r) {
        this.r = r;

    }

    @Override
    public String toString() {
        return "Ball{" +
                "PI=" + PI +
                ", r=" + r +
                '}';
    }
}
