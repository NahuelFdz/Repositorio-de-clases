package proyectoclase3;

import java.util.Arrays;
import java.util.Collections;

public class Ejercicio1_b_mio {

	public static void main(String[] args) {
		
		int numeros[] = {-2,23,0};
		boolean ascendente = true; //false
		
		if(ascendente) {
			
			Arrays.sort(numeros); //Ordenamos de menor a mayor
			
		}else {

			Arrays.sort(numeros, Collections.reverseOrder()); //Ordenar de mayor a menor
			
		}
		for(int elemento : numeros) {
			System.out.println(elemento);
		}
	}
	
}
