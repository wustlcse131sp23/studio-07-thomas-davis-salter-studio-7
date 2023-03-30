package studio7;

public class Rectangle {

private double length;
private double width;

public Rectangle (double l, double w) {
	length = l;
	width = w;
	
}
public double getArea() {
	return length*width;
}

public double getPerimeter() {
	return (2*length)+(2*width);
}

public boolean isSmaller(Rectangle r) {
	double area2 = r.getArea();
	double area1 = this.getArea();
	if (area2 < area1 || area2 == area1) {
		return false;
	}
	else {
		return true;
	}
}

public boolean ifSquare() {
	if (length == width) {
		return true;
	}
	else {
		return false;
	}
}

public static void main(String[] args) {
	Rectangle r1 = new Rectangle (2, 6);
	Rectangle r2 = new Rectangle (3, 5);
	System.out.println(r1.getArea());
	System.out.println(r1.isSmaller(r2));
	
}

}


