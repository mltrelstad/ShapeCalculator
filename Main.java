
public class Main {
	
	
	public static void main(String[] args) {
        ShapeCalculator calculator = new ShapeCalculator();


        double circleArea = calculator.getAreaOfCircle();

        System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
        System.out.println("Welcome to a shape calculator!");
        System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~\n");
       
        System.out.println("Area of the circle: " + circleArea);


        double triangleArea = calculator.getAreaOfTriangle();
        System.out.println("Area of the triangle: " + triangleArea);


        double length = 6.0;
        double width = 4.0;
        double rectangleArea = calculator.getAreaOfRectangle(length, width);
        System.out.println("Area of the rectangle: " + rectangleArea);
    }
}