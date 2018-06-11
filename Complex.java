import java.util.Scanner;
public class Complex {
	
	double real, imag;
	public void Display()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter real part: ");
		real = sc.nextDouble();
		System.out.print("Enter imaginary part: ");
		imag = sc.nextDouble();
		sc.close();
		if(imag>=0)
		{
			System.out.println("Complex number is: " + real + "+" + imag + "i");
		}
		else if(imag<0)
		{
			System.out.println("Complex number is: " + real + imag + "i");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Complex c = new Complex();
		c.Display();

	}

}
