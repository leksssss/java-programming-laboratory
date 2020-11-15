import java.util.Scanner;
public class Account {
	private String name;
	private double balance;
	private int acc_no;
	
	static double interest_rate = 0.04;
	
	public Account() {
		
	}
	
	public Account(String n, int accno) {
		name = n;
		balance =100;
		acc_no = accno;
	}
	public Account(String n,double bal, int accno) {
		name =n;
		balance=bal;
		acc_no=accno;
	}
	 public String getName() {
		 return name;
	 }
	 public double getBal() {
		// balance = balance * interest_rate;
		 return balance;
	 }
	 
	 public int getAccount() {
		 return acc_no;
	 }
	 
	 public static double getInterestRate(){
		// System.out.println("Interest rate : "+getInterestRate());
		 return interest_rate;
	 }
	 public static void fillArray(Account a[]) {
			Scanner input = new Scanner(System.in);
			for(int i=0; i<a.length; i++) {
				System.out.println("Enter name of account holder");
				String name=input.next();
				System.out.println("Enter balance;");
				double balance = input.nextDouble();
				System.out.println("Enter account number ");
				int accno = input.nextInt();
				a[i]= new Account(name,balance,accno);
			}
			input.close();
		}
		public static double totalInterest(Account a[], int n) {
			double totalInterest=0.0;
			for(Account x: a) {
				System.out.println(x.getName()+ " - " + x.getBal() + " - " + x.getAccount());
				totalInterest += (x.getBal() * interest_rate);
			}
			return totalInterest;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of objects you want to create :");
		int n=input.nextInt();
		Account []account = new Account[n];
		fillArray(account);
		double totalInterestRate = totalInterest(account,n);
		System.out.print("The Rate of Interest is : 4% ");
		System.out.println("The total interest to be paid :" + totalInterestRate);
		input.close();
		
	}

}
