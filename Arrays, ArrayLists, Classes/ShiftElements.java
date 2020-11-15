import java.util.Scanner;
import java.util.Arrays;
public class ShiftElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number of elements :");
		int len = input.nextInt();
		System.out.println("Enter values :");
		int []numbers= new int[len];
		for(int i=0;i<len;i++)
			numbers[i]=input.nextInt();
		int []shiftedArray = shift(numbers);
		System.out.println("Shifted array is :"+ Arrays.toString(shiftedArray));
		input.close();
	}
	public static int[] shift(int numbers[]) {
		int temp=numbers[numbers.length-1];
		for(int j=numbers.length-1;j>0;j--) {
			numbers[j]=numbers[j-1];
		}
		numbers[0]=temp;
		return numbers;
	}
}
