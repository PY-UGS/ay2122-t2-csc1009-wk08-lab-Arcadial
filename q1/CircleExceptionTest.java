package lab8.q1;

import java.util.Scanner;

public class CircleExceptionTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		CircleWithException circle = null;

		while (circle == null) {
			try {
				System.out.println("Input radius of circle: ");
				circle = new CircleWithException(scanner.nextDouble());
				
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

		System.out.println("Area of circle is: " + circle.getArea());
		scanner.close();
	}

}
