package zadatak5;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<String> niz = new ArrayList<>();
		
		String rijec;
		
		do {
			System.out.println("Unesite rijec: ");
			rijec = input.next();
			
			if (rijec.equals("kraj") == false)
				niz.add(rijec);
			
		}while (rijec.equals("kraj") == false);
		
		for (int i = 0; i < niz.size(); i++) {
			System.out.print(niz.get(i) + " ");
		}
		
		
				
		
	}

}
