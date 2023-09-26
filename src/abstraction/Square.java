package abstraction;

public class Square implements Shape, Drawing{
    private double length;
    public Square(double length){
        this.length = length;
    }
    @Override
    public double areaCalculate() {
        double area = length*length;
        return area;
    }

    @Override
    public void draw() {

    }
}
