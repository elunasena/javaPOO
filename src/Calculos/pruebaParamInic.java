package Calculos;

public class pruebaParamInic {
	
	public static void main(String[] args) {
		
		ParametrosIniciales p1 = new ParametrosIniciales();
		
		System.out.println("Creación del objeto p1\nUbicación:\t" + p1 + "\nde tipo:\t" + p1.getClass().getName() + "\n");
		
		//Asignación del nombre del proyecto
		p1.setNombreProyecto("Proyecto prueba No. 1\n");
		System.out.println(p1.getNombreProyecto());
		
		//Asignación del área del municipio
		p1.setAreaProyecto(33.03);
		System.out.println("Area pobl. de estudio:\t" + p1.getAreaProyecto() + " Ha.");
		
		//Asignación de población
		p1.setPoblacion(11737);
		System.out.println("Población de estudio:\t" + p1.getPoblacion() + " hab.");
		
		//Asignación y calculo de la densidad poblacional
		p1.setDensPoblacional(p1.calculoDensPobl(p1.getPoblacion(), p1.getAreaProyecto()));
		System.out.printf("Densidad poblacional:\t%.4f hab/Ha.", p1.getDensPoblacional()); //Salida con formato printf
		
		//Asignación del número de viviendas
		p1.setNumViv(3589);
		System.out.printf("\nNúmero de viviendas:\t%d Viv.", p1.getNumViv());
		
		//Asignación y cálculo de la densidad habitacional
		p1.setDensHabitacional(p1.calculoDensHab(p1.getNumViv(), p1.getAreaProyecto()));
		System.out.printf("\nDensidad habitacional:\t%.4f Viv/Ha.",p1.getDensHabitacional());
		
		//Asignación y cálculo de la densidad 
		p1.setDensidad	(p1.calculoDensidad(p1.getPoblacion(), p1.getNumViv()));
		System.out.printf("\nDensidad:\t\t\t\t%.4f hab/Viv.", p1.getDensidad());
		
		//Asignación de altura del lugar de interés
		p1.setAlturaProy(1500);
		p1.asignarDotacion(p1.getAlturaProy());
		System.out.printf("\nAltura del proyecto:\t%d m.s.n.m.\t\tRes.0330/2017", p1.getAlturaProy());
		System.out.printf("\nDotación:\t\t\t\t%.4f L/Hab*dia\tRes.0330/2017", p1.getDotacion());
		
		//CoefRetor, ConexErr e Infeltracion inicializadas...
		System.out.printf("\nCoeficiente de retorno:\t%.4f\t\t\tRes.0330/2017", p1.getCoefRectorno());
		System.out.printf("\nCoef. conex. erradas:\t%.4f L/s*Ha.\t\tRes.0330/2017", p1.getCoefConErrad());
		System.out.printf("\nCoef. infiltración:\t\t%.4f L/s*Ha.\t\tRes.0330/2017", p1.getCoefInfiltra());
		
		//Distribucion Industrial, comercial e institucional
		System.out.printf("\nContrib. industrial:\t%.4f L/s*Ha.\t\tNorma EPM", p1.getContribIndustrial());
		System.out.printf("\nContrib. comercial:\t\t%.4f L/s*Ha.\t\tNorma EPM", p1.getContribComercial());
		System.out.printf("\nContrib. institucional:\t%.4f L/s*Ha. \t\tNorma EPM",p1.getContribInstitucional());
		
		/*
		int centinela = 0;
		do
		{
		
		...
		
			
		} while (centinela == 0);
		*/
		
		
	}
}
