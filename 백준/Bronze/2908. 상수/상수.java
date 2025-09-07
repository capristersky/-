import java.util.Scanner;

class Main
{
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		
		String num1 = sc.next();
		String num2 = sc.next();
		
		String reversed1 = new StringBuilder(num1).reverse().toString();
		String reversed2 = new StringBuilder(num2).reverse().toString();
		
		int reversedNum1 = Integer.parseInt(reversed1);
		int reversedNum2 = Integer.parseInt(reversed2);
		
		System.out.println(Math.max(reversedNum1, reversedNum2));
		
	}
}
