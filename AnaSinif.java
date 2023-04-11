import java.util.Random;
import java.util.Scanner;

public class AnaSinif {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Gişe uygulamasına hoş geldiniz.");
		System.out.print("Lütfen TCKN giriniz : ");
		
		String tckn = scanner.nextLine();
		
		TCKN tcNesne = new TCKN();
		
		tcNesne.setTckn(tckn);
		
	
	}

}
