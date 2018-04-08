import java.util.Scanner;

public class DayOfTheWeek {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter year: (e.g., 2008): ");
		int year = input.nextInt();

		System.out.print("Enter month: 1-12: ");
		int month = input.nextInt();

		System.out.print("Enter the day of the month: 1-31: ");
		int day = input.nextInt();

		if (month == 1) {
			month = 13;
			year--;
		} else if (month == 2) {
			month = 14;
			year--;
		}

		int a = (int) (26 * (month + 1) / 10);
		int k = year % 100;
		int j = Math.abs(year / 100);
		int h = (day + a + k + (int) (k / 4) + (int) (j / 4) + 5 * j) % 7;

		String dayOfWeek = null;

		switch (h) {
		case 0:
			dayOfWeek = "Saturday";
			break;
		case 1:
			dayOfWeek = "Sunday";
			break;
		case 2:
			dayOfWeek = "Monday";
			break;
		case 3:
			dayOfWeek = "Tuesday";
			break;
		case 4:
			dayOfWeek = "Wednesday";
			break;
		case 5:
			dayOfWeek = "Thursday";
			break;
		case 6:
			dayOfWeek = "Friday";
		}
		System.out.print("Day of the week is " + dayOfWeek);

		input.close();
	}
}