import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		int time = 45;

		int alarmH = h;
		int alarmM = 0;
	
		
		if (m < time) {
			alarmM = 60 - (time - m);
			alarmH = (h + 23) % 24;
		} else {
			alarmM = m - time;
			alarmH = h;
		}
		
		
		System.out.println(alarmH + " " + alarmM);
	}
}