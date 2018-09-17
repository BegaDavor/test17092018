package zadatak2;

public class Laptop extends Racunar{
	
	//atributi
	
	private int trajanjeBaterije;
	
	//konstruktori
	
	public Laptop(double kolicinaRAMa, double kapacitetHD, double brzinaProcesora, double dijagonalaMonitora, double nabavnaCijena, int trajanjeBaterije) {
		super(kolicinaRAMa, kapacitetHD, brzinaProcesora, dijagonalaMonitora, nabavnaCijena);
		this.trajanjeBaterije = trajanjeBaterije;
	}
	
	// getters and setters
	
	public int getTrajanjeBaterije() {
		return trajanjeBaterije;
	}
	
	public void setTrajanjeBaterije(int trajanjeBaterije) {
		this.trajanjeBaterije = trajanjeBaterije;
	}
	
	// metode
	
	@Override
	public double izracunajCijenu() {
		double cijena = getNabavnaCijena() + getNabavnaCijena()*0.15;
		return cijena;
	}
	

}
