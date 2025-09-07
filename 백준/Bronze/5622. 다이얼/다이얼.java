import java.util.Scanner;

class Main
{
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();
		
		int sec = 0;
		
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch == 'A' || ch == 'B' || ch == 'C') {
				sec += 3;
			}
			if (ch == 'D' || ch == 'E' || ch == 'F') {
				sec += 4;
			}
			if (ch == 'G' || ch == 'H' || ch == 'I') {
				sec += 5;
			}
			if (ch == 'J' || ch == 'K' || ch == 'L') {
				sec += 6;
			}
			if (ch == 'M' || ch == 'N' || ch == 'O') {
				sec += 7;
			}
			if (ch == 'P' || ch == 'Q' || ch == 'R' || ch == 'S') {
				sec += 8;
			}
			if (ch == 'T' || ch == 'U' || ch == 'V') {
				sec += 9;
			}
			if (ch == 'W' || ch == 'X' || ch == 'Y' || ch == 'Z') {
				sec += 10;
			}
		}
		System.out.println(sec);
	
	}
}
