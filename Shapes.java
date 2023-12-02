public abstract class Shapes {
	
	
    public abstract double getAreaOfCircle();
    public abstract double getAreaOfTriangle();
    public abstract double getAreaOfRectangle();


    public double getAreaOfRectangle(double length, double width) {
        return length * width;
    }
}