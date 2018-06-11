import java.util.Scanner;
public class Waveform {

	public static void main(String[] args) {
		
		int arr[] = new int[10];
		int temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elements of array: ");
		for(int i=0;i<10;i++)
		{
			arr[i] = sc.nextInt();
		}
		sc.close();
		for (int i=1; i<10; i++)
        {
            int key = arr[i];
            int j = i-1;
            while (j>=0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
		for(int i=0;i<10;i++)
		{
			if(i%2==1)
			{
				temp = arr[i];
				arr[i] = arr[i-1];
				arr[i-1] = temp;
			}
		}
		System.out.print("Waveform: ");
		for(int i=0;i<10;i++)
		{
			System.out.print(arr[i] + " ");
		}
				

	}

}
