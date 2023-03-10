package miprimerproyecto;

public class Ejercicio2 {
	//Determinar si una persona pertenece al segmento de ingresos altos
	
	public static void main(String[] args) { 
		float ingresos = 200000;
		int autos = 2;
		int inmuebles = 2;
		boolean embarcacion = false;
		boolean aeronave = false;
		boolean activos = false;
		
		if((ingresos >= 489083) || (autos >= 3) || (inmuebles >= 3) || (embarcacion == true) || (aeronave == true) || (activos == true)){
			System.out.println("Pertenece al segmento de ingresos altos.");
		} else{
			System.out.println("No pertenece al segmento de ingresos altos.");
		}
		

	}

}
