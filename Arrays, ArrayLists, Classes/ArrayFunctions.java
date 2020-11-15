import java.util.Scanner;
import java.util.Arrays;
public class ArrayFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int arr[]= new int[5];
		for(int i=0;i<5;i++)
			arr[i]=input.nextInt();
		
		//array copy
		int arr1[]=new int[arr.length];
		System.arraycopy(arr, 0, arr1, 0, arr.length);
		
		//equals
		if(Arrays.equals(arr,arr1))
			System.out.println("The arrays are equal");
		else
			System.out.println("The arrays are unequal");
		
		//sort
		Arrays.sort(arr);
		System.out.println("Sorted array ");
		for(int i=0;i<5;i++)
			System.out.print(arr[i] +" ");
		
		//binary search
		System.out.print("\nEnter n to find");
		int n=input.nextInt();
		int index = Arrays.binarySearch(arr, n);
		if(index >=0)
			System.out.println("The element is found at index "+ index);
		else
			System.out.print("Not found");
		input.close();
	}

}
