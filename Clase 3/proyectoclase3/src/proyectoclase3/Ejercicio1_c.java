package proyectoclase3;

public class Ejercicio1_c {

	public static void main(String[] args) {
		
		int numeros[] = {3,8,2,10};
		int numX = 5;
		int resultado = 0;
		
		for (int i=0; i<numeros.length; i++){
			int aux = numeros[i];
			if (aux > numX){
				resultado = resultado + aux;
			}
		} //for
		System.out.println("El resultado de la suma de los numeros mayores a "+ numX + " es: "+ resultado);
	}
}
