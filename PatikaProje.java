import java.util.Scanner;

public class PatikaProje {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Yıl Giriniz : ");
		int year = input.nextInt();
		if (year % 4 == 0) {
			if (year % 100 == 0 && year % 400 != 0) System.out.println(year + " bir artık yıldır değildir !");
			else System.out.println(year + " bir artık yıldır !");
		}
		else System.out.println(year + " bir artık yıldır değildir !");
	}

}
