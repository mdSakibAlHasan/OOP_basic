package abstraction;

public class Circle implements Shape{
    private double radius;

    public Circle(double r){           //constuctor
        radius = r;
    }

    @Override
    public double areaCalculate() {
        double area = 3.1416*radius*radius;
        return area;
    }


    public void areaCalculate(double r){
        return;
    }


//    @Override
//    public void printDetails(String message){
//        System.out.println("Circle method call"+message);
//    }

    public static void main(String[] args) {
        Circle circle = new Circle(2);
        System.out.println("Area is"+circle.areaCalculate());
        //circle.printDetails("sakib");

        Square square = new Square(2);
        System.out.println("Area of square is "+square.areaCalculate());
    }
}


