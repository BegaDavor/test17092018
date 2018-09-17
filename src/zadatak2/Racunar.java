package zadatak2;

public class Racunar {
	
	// atributi
	
	private double kolicinaRAMa;
	private double kapacitetHD;
	private double brzinaProcesora;
	private double dijagonalaMonitora;
	private double nabavnaCijena;
	
	// kontruktori
	
	public Racunar(double kolicinaRAMa, double kapacitetHD, double brzinaProcesora, double dijagonalaMonitora, double nabavnaCijena) {
		this.kolicinaRAMa = kolicinaRAMa;
		this.kapacitetHD = kapacitetHD;
		this.brzinaProcesora = brzinaProcesora;
		this.dijagonalaMonitora = dijagonalaMonitora;
		this.nabavnaCijena = nabavnaCijena;
	}
	
	// getters and setters
	
	public double getKolicinaRAMa() {
		return kolicinaRAMa;
	}
	
	public double getKapacitetHD() {
		return kapacitetHD;
	}
	
	public double getBrzinaProcesora() {
		return brzinaProcesora;
	}
	
	public double getDijagonalaMonitora() {
		return dijagonalaMonitora;
	}
	
	public double getNabavnaCijena() {
		return nabavnaCijena;
	}
	
	public void setKolicinaRAMa(double kolicinaRAMa) {
		this.kolicinaRAMa = kolicinaRAMa;
	}
	
	public void setKapacitetHD(double kapacitetHD) {
		this.kapacitetHD = kapacitetHD;
	}
	
	public void setBrzinaProcesora(double brzinaProcesora) {
		this.brzinaProcesora = brzinaProcesora;
	}
	
	public void setDijagonalaMonitora(double dijagonalaMonitora) {
		this.dijagonalaMonitora = dijagonalaMonitora;
	}
	
	public void setNabavnaCijena(double nabavnaCijena) {
		this.nabavnaCijena = nabavnaCijena;
	}
	
	// metode
	
	public double izracunajCijenu() {
		double cijena = getNabavnaCijena() + getNabavnaCijena()*0.1;
		return cijena;
	}

}
