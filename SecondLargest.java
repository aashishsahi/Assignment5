import java.util.Scanner;
public class SecondLargest {

	public static void main(String[] args) {
		
		
		int arr[] = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elements of array: ");
		arr[0] = sc.nextInt();
		int max = arr[0], max1 = arr[0];
		for(int i=1;i<10;i++)
		{
			arr[i] = sc.nextInt();
			if(arr[i]>max)
			{
				max1 = max;
				max = arr[i];
			}
		}
		sc.close();
		if(max==max1)
			System.out.println("No 2nd max element");
		else
			System.out.println("Second largest element is: " + max1);

	}

}
