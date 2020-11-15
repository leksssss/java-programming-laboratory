import java.util.Arrays;
import java.util.Scanner;

public class PartitionElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter no. of elemetns : ");
		int n = input.nextInt();
		System.out.println("Enter the values : ");
		int []arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = input.nextInt();
		}
		int []ans = partition(arr);
		System.out.print("Partitioned array : "+ Arrays.toString(ans));
		input.close();
	}

	public static int[] partition(int []a) {
		int pivot = a[0];
		int i = -1;
		for(int j=0; j<a.length; j++) {
			if(a[j]<pivot) {
				i++;
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		return a;
	}
}
