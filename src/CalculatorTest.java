public class CalculatorTest {
    public static void main(String[] args) {

        ShapeCalc calc = new ShapeCalc();
        LineCalc lc = new LineCalc();

        Shape[] shapes = new Shape[5];

        shapes[0] = new Line2D(15, 20, 6, 18);
        shapes[1] = new Circle(2);
        shapes[2] = new Rectangle(4, 5);
        shapes[3] = new Ball(5);
        shapes[4] = new Cube(2);

        Line2D specificLine = (Line2D)shapes[0];
        double result1 = calc.lineLenght(specificLine);
        System.out.println("Długość odcinka = " + result1);

        Circle specificCircle = (Circle)shapes[1];
        double result2 = calc.circleArea(specificCircle);
        System.out.println("Pole okręgu = " + result2);

        Rectangle specificRectangle = (Rectangle)shapes[2];
        double result3 = calc.rectangleArea(specificRectangle);
        System.out.println("Pole prostokąta = " + result3);

        Ball specificBall = (Ball)shapes[3];
        double result4 = calc.volumeBall(specificBall);
        System.out.println("Pojemność kuli = " + result4);

        Cube specificCube = (Cube)shapes[4];
        double result5 = calc.volumeCube(specificCube);
        System.out.println("Pojemność graniastosłupa = " + result5);


    }
}
