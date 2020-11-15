import java.util.Scanner;
import java.util.Arrays;

public class EmployeeHours {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of employees");
		int n = input.nextInt();
		int [][]hours = new int[n][7];
		for(int i=0; i<n; i++) {
			for(int j=0; j<7; j++) {
				hours[i][j]=input.nextInt();
			}
		}
		int [][]res = new int[n][2];
		for(int i=0; i<n; i++) {
			int sum=0;
			for(int j=0; j<7; j++) {
				sum += hours[i][j];
			}
			res[i][0] = i;
			res[i][1] = sum;
		}
		Arrays.sort(res, new java.util.Comparator<int []>(){
			public int compare(int[] a, int[] b) {
				return b[1] - a[1];
			}
		});
		for(int i=0; i<n; i++) {
			System.out.println("Employee "+res[i][0]+" - "+res[i][1]);
		}
		input.close();
	}

}
