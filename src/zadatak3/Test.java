package zadatak3;

public class Test {
	
	public static void main(String[] args) {
		
		int[] niz = {2, 4, 1, 5, 3};
		
		MyArray array = new MyArray(niz);
		
		System.out.println("Najmanji: " + array.getSmallestElement());
		System.out.println("Najveci: " + array.getLargestElement());
		System.out.println("Suma: " + array.sumAllElements());
		System.out.print("Elementi: ");
		array.printAllElements();
	}

}
