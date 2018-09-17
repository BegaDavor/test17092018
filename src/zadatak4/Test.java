package zadatak4;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesite neku recenicu: ");
		String recenica = input.nextLine();
		
		ArrayList<String> niz = new ArrayList<>();
		
		Scanner scanner = new Scanner(recenica);
		
		
		while(scanner.hasNext()) {
			niz.add(scanner.next());
		}
		
		scanner.close();
		
		System.out.println("Pretposljednja rijec je: " + niz.get(niz.size() - 2));
		
		input.close();
	}

}
