import java.util.Scanner;

class Main
{
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		
		String sentence = sc.nextLine();
		
		int count = 0;
		
		for (int i = 0; i < sentence.length(); i++) {
			if (sentence.charAt(i) != ' ') {
				if (i == sentence.length()-1 || sentence.charAt(i+1) == ' ') {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
