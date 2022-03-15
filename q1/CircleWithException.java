package lab8.q1;

public class CircleWithException {

	private double radius;
	private double diameter;
	private double area;

	public CircleWithException(double radius) throws Exception {
		setRadius(radius);
		
		double area = Math.PI * Math.pow(radius, 2);
		if (area > 1000)
			throw new Exception("Area of circle is more than 1000");
		
		this.area = area;
		this.diameter = radius * 2;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		if (radius <= 0)
			throw new IllegalArgumentException("Radius is not greater than 0");
		this.radius = radius;
	}

	public double getDiameter() {
		return diameter;
	}

	public double getArea() {
		return area;
	}

}
