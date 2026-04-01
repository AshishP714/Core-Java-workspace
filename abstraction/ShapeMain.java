package com.abstraction;

public class ShapeMain {

	public static void main(String[] args) {
		Circle c1 = new Circle(4.0);
		double area = c1.area();
		System.out.println("area of circle is " + area);
		double per = c1.perimeter();
		System.out.println("perimeter " + per);

		Rectangle r1 = new Rectangle(3, 4);
		double are = r1.area();
		System.out.println("area of rectangle is " + are);
		double perimeter = r1.perimeter();
		System.out.println("perimeter " + perimeter);

	}

}
