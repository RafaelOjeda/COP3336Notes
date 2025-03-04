package util;

public class Circle extends TwoDShape {
	private double radius;
	public double getRadius() {
		return radius;
	}
	public Circle(String color, double radius) {
		super(color);
		if (radius < 0) {
			this.radius = 0;
		} else {
			this.radius = radius;
		}
	}
	public double getPerimeter() {
		return Math.PI * 2 * radius;
	}
	public double getArea() {
		return Math.PI * Math.pow(radius, 2.0);
	}

	@Override
	public String toString() {
		return "Circle of radius " + radius + " and color " + color;
	}
}
