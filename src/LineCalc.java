public class LineCalc {
    public double lineLenght(Line2D line){
        double result = (line.getX2() - line.getX1()) + (line.getY2() - line.getY2());
        return result;
    }
}
