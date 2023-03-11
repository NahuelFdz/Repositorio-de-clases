package proyectoclase3;

public class Ejercicio1 {
	
	public static void main(String[] args) {
		//Dado un String y una letra, que cuente la cantidad de apariciones 
		// de la letra en el String;
		
		String palabra = "otorrinolaringologia";
		int cantLetra = 0;
		char letraBuscada = 'o';
		
		for(int i=0; i < palabra.length(); i++){
			char letras = palabra.charAt(i);
			
			if(letras == letraBuscada){
				cantLetra++;
			}
		} //for
		
		System.out.println("Esta letra se repite: " + cantLetra + " veces");
	}

}
