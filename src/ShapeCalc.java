public class ShapeCalc extends LineCalc implements Calc2D, Calc3D {

    public ShapeCalc() {
    }

    @Override
    public double lineLenght(Line2D line){
        return super.lineLenght(line);
    }

    @Override
    public double circleArea(Circle circle){
        return circle.getPI() * (circle.getR()*circle.getR());
    }

    @Override
    public double rectangleArea(Rectangle rectangle){
        return rectangle.getA() * rectangle.getB();
    }
    @Override
    public double volumeBall(Ball ball){
        return 4*ball.getPI()*(ball.getR()*ball.getR());
    }
    @Override
    public double volumeCube(Cube cube){
        return cube.getA() * cube.getA() * cube.getA();
    }

}
