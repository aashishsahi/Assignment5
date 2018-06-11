import java.util.Scanner;

public class Rectangle {
	
	double length, breadth;
	public void CalculateArea()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length: ");
		length = sc.nextDouble();
		System.out.print("Enter breadth: ");
		breadth = sc.nextDouble();
		sc.close();
		System.out.println("Area of rectangle is: " + (length*breadth));
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle r = new Rectangle();
		r.CalculateArea();
	}

}
