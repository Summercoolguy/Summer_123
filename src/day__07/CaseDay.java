package day__07;

import java.nio.file.spi.FileSystemProvider;

public class CaseDay {
	public static void main(String args[]) {

		int day = 3;
		switch (day) {

		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Thuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thuesday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Invalid number of the day");
			break;

		}

	}

}
