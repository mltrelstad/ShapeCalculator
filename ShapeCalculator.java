public class ShapeCalculator extends Shapes {

    @Override
    public double getAreaOfCircle() {
        double radius = 5.0;
        return Math.PI * radius * radius;
    }

    @Override
    public double getAreaOfTriangle() {
        double base = 4.0;
        double height = 3.0;
        return 0.5 * base * height;
    }

	@Override
	public double getAreaOfRectangle() {

		return 0;
	}

}
