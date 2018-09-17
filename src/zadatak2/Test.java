package zadatak2;

public class Test {
	
	public static void main(String[] args) {
		
		Racunar racunar = new Racunar(8, 500, 3.1, 17, 200);
		
		Laptop laptop = new Laptop(8, 1000, 3.1, 15, 250, 6);
		
		System.out.println("Konfiguracija racunara: ");
		System.out.println("RAM: " + racunar.getKolicinaRAMa() + " GB");
		System.out.println("HD: " + racunar.getKapacitetHD() + " GB" );
		System.out.println("Procesor: " + racunar.getBrzinaProcesora() + " GHz");
		System.out.println("Monitor: " + racunar.getDijagonalaMonitora() + " inchs");
		System.out.println("Cijena: " + racunar.izracunajCijenu());
		System.out.println();
		
		System.out.println("Konfiguracija laptopa: ");
		System.out.println("RAM: " + laptop.getKolicinaRAMa() + " GB");
		System.out.println("HD: " + laptop.getKapacitetHD() + " GB" );
		System.out.println("Procesor: " + laptop.getBrzinaProcesora() + " GHz");
		System.out.println("Monitor: " + laptop.getDijagonalaMonitora() + " inchs");
		System.out.println("Trajanje baterije: " + laptop.getTrajanjeBaterije() + " h");
		System.out.println("Cijena: " + laptop.izracunajCijenu());
		
		
	}

}
