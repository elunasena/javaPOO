package Calculos;

public class Tramo {
	
	//Referencia directamente al objeto cliente 
	//Se instancia un cliente de manera inmediata
	private Nodo n1 = new Nodo(0, 0, 0);
	private Nodo n2 = new Nodo(0, 0, 0);
	
	private String name;
	private byte arranque;
	private double areaAR;
	//private double areaAL;
	private double diamInt;
	private String material;
	private double rugosidad;
	private double diamExt;	
	private double caudal;
	private double cotaBatea;
	private double cotaClave;
	private double profundidadClave;
	private double velocidad;
	private double pendTerreno;
	private double pendTuberia;
	private double qDiseno;
	private double qTuboLleno;
	private double qQ;
	private double longEntreEjes;
	private double fuerzaTract;
	private String tipoFlujo;
	
	//Variable de la clase, noo de la instancia.
	//variable en común de todas las instancias
	//Contador que suma haciendo uso del constructor con parámetros
	private static int total = 0;
	
	//Constructor
	//	POR DEFINIR
	
	//Métodos
	
		public void calcularPendTerreno(Nodo n1 , Nodo n2) {
			System.out.println("Hizo uso de: calcularPendTerreno();");
			double pend = Math.sqrt(Math.pow(n1.getCota(),2)+Math.pow(n2.getCota(), 2));
			setPendTerreno(pend);
			//return pend;
		}	
	
	//Getters and setters
		
	public void setArrnque(byte arranque) {
		this.arranque = arranque;
	}
	
	public byte getArranque() {
		return this.arranque;
	}	
		
	public Nodo getN1() {
		return n1;
	}

	public void setN1(Nodo n1) {
		this.n1 = n1;
	}

	public Nodo getN2() {
		return n2;
	}

	public void setN2(Nodo n2) {
		this.n2 = n2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAreaAR() {
		return areaAR;
	}

	public void setAreaAR(double areaAR) {
		this.areaAR = areaAR;
	}

	public double getDiamInt() {
		return diamInt;
	}

	public void setDiamInt(double diamInt) {
		this.diamInt = diamInt;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public double getRugosidad() {
		return rugosidad;
	}

	public void setRugosidad(double rugosidad) {
		this.rugosidad = rugosidad;
	}

	public double getDiamExt() {
		return diamExt;
	}

	public void setDiamExt(double diamExt) {
		this.diamExt = diamExt;
	}

	public double getCaudal() {
		return caudal;
	}

	public void setCaudal(double caudal) {
		this.caudal = caudal;
	}

	public double getCotaBatea() {
		return cotaBatea;
	}

	public void setCotaBatea(double cotaBatea) {
		this.cotaBatea = cotaBatea;
	}

	public double getCotaClave() {
		return cotaClave;
	}

	public void setCotaClave(double cotaClave) {
		this.cotaClave = cotaClave;
	}

	public double getProfundidadClave() {
		return profundidadClave;
	}

	public void setProfundidadClave(double profundidadClave) {
		this.profundidadClave = profundidadClave;
	}

	public double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}

	public double getPendTerreno() {
		return pendTerreno;
	}

	public void setPendTerreno(double pendTerreno) {
		this.pendTerreno = pendTerreno;
	}

	public double getPendTuberia() {
		return pendTuberia;
	}

	public void setPendTuberia(double pendTuberia) {
		this.pendTuberia = pendTuberia;
	}

	public double getqDiseno() {
		return qDiseno;
	}

	public void setqDiseno(double qDiseno) {
		this.qDiseno = qDiseno;
	}

	public double getqTuboLleno() {
		return qTuboLleno;
	}

	public void setqTuboLleno(double qTuboLleno) {
		this.qTuboLleno = qTuboLleno;
	}

	public double getqQ() {
		return qQ;
	}

	public void setqQ(double qQ) {
		this.qQ = qQ;
	}

	public double getLongEntreEjes() {
		return longEntreEjes;
	}

	public void setLongEntreEjes(double longEntreEjes) {
		this.longEntreEjes = longEntreEjes;
	}

	public double getFuerzaTract() {
		return fuerzaTract;
	}

	public void setFuerzaTract(double fuerzaTract) {
		this.fuerzaTract = fuerzaTract;
	}

	public String getTipoFlujo() {
		return tipoFlujo;
	}

	public void setTipoFlujo(String tipoFlujo) {
		this.tipoFlujo = tipoFlujo;
	}
	
		
	
	
	
}
