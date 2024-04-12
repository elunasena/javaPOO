package Calculos;

public class Nodo {

	private double xEste;
	private double yNorte;
	private double cotaTer;
	//private double diamPozo; //depende de la tubería de mayor diametro
	
	
	//constructor
	public Nodo (double xEste, double yNorte, double cotaT) {
		
		this.yNorte = yNorte;
		this.xEste = xEste;
		this.cotaTer = cotaT;
		
	}

	public double getxEste() {
		return xEste;
	}

	public void setxEste(double xEste) {
		this.xEste = xEste;
	}

	public double getyNorte() {
		return yNorte;
	}

	public void setyNorte(double yNorte) {
		this.yNorte = yNorte;
	}

	public double getCota() {
		return cotaTer;
	}

	public void setCota(double cota) {
		this.cotaTer = cota;
	}
	
	
	
}
