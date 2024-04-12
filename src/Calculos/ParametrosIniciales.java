package Calculos;

public class ParametrosIniciales {
	
	private String nombreProyecto; 
	private double areaProyecto; 		//Ha zona atendida*
	private int poblacion;				//No. personas zona atendida*
	private double densPoblacional;		//densidad hab/Ha*
	private int numViv;					//No. viviendas*
	private double densHabitacional;	//Viv/Ha*
	private double densidad;			//hab/Viv.
	private int alturaProy;				//m.s.n.m.
	private double dotacion;			//L/Hab*dia
	private double coefRectorno = 0.85;	//Factor de retorno 0.85
	private double coefConErrad = 0.20;		//Coeficiente de conexiones erradas 0.2 L/s*Ha
	private double coefInfiltra = 0.10;		//Coeficiente de infiltracion		0.1 L/s*Ha
	private double contribIndustrial = 1.50;	//1.50 L/s*Ha
	private double contribComercial = 0.50;	//0.50 L/s*Ha
	private double contribInstitucional = 0.50;//0.50 L/s*Ha
	
	//constructor por defecto
	public ParametrosIniciales () {
		
	}
	
	//Metodos
	public double calculoDensPobl (int poblacion, double area) {
		return Math.round((poblacion/area)*100.0)/100.0;
	}
	
	public double calculoDensHab (int numViv, double area) {
		return Math.round((numViv/area)*100.0)/100.0;
	}
	
	public double calculoDensidad (int poblacion, int viviendas) {
		return Math.round(((double) poblacion/(double) viviendas)*100.0)/100.0;
	}
	
	public void asignarDotacion (int altura) {
		if (altura < 1000) {
			this.dotacion = 140.0;
		} else if (altura > 2000) {
			this.dotacion = 120.0;
		}else {
			this.dotacion = 130.0;
		}
	}
	
	
	//getters and setters
	public String getNombreProyecto() {
		return nombreProyecto;
	}
	public void setNombreProyecto(String nombreProyecto) {
		this.nombreProyecto = nombreProyecto;
	}
	public double getAreaProyecto() {
		return areaProyecto;
	}
	public void setAreaProyecto(double areaProyecto) {
		this.areaProyecto = areaProyecto;
	}
	public int getPoblacion() {
		return poblacion;
	}
	public void setPoblacion(int poblacion) {
		this.poblacion = poblacion;
	}
	public double getDensPoblacional() {
		return densPoblacional;
	}
	public void setDensPoblacional(double densPoblacional) {
		this.densPoblacional = densPoblacional;
	}
	public int getNumViv() {
		return numViv;
	}
	public void setNumViv(int numViv) {
		this.numViv = numViv;
	}
	public double getDensHabitacional() {
		return densHabitacional;
	}
	public void setDensHabitacional(double densHabitacional) {
		this.densHabitacional = densHabitacional;
	}
	public double getDensidad() {
		return densidad;
	}
	public void setDensidad(double densidad) {
		this.densidad = densidad;
	}
	public int getAlturaProy() {
		return alturaProy;
	}
	public void setAlturaProy(int alturaProy) {
		this.alturaProy = alturaProy;
	}
	public double getDotacion() {
		return dotacion;
	}
	public void setDotacion(int dotacion) {
		this.dotacion = dotacion;
	}
	public double getCoefRectorno() {
		return coefRectorno;
	}
	public void setCoefRectorno(double coefRectorno) {
		this.coefRectorno = coefRectorno;
	}
	public double getCoefConErrad() {
		return coefConErrad;
	}
	public void setCoefConErrad(double coefConErrad) {
		this.coefConErrad = coefConErrad;
	}
	public double getCoefInfiltra() {
		return coefInfiltra;
	}
	public void setCoefInfiltra(double coefInfiltra) {
		this.coefInfiltra = coefInfiltra;
	}
	public double getContribIndustrial() {
		return contribIndustrial;
	}
	public void setContribIndustrial(double contribIndustrial) {
		this.contribIndustrial = contribIndustrial;
	}
	public double getContribComercial() {
		return contribComercial;
	}
	public void setContribComercial(double contribComercial) {
		this.contribComercial = contribComercial;
	}
	public double getContribInstitucional() {
		return contribInstitucional;
	}
	public void setContribInstitucional(double contribInstitucional) {
		this.contribInstitucional = contribInstitucional;
	}
	
		
}
