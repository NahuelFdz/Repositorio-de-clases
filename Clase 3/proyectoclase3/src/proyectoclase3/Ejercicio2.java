package proyectoclase3;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		String frase = "botella";
		
		byte[] decodedBytes = frase.getBytes();
		
		frase = new String(decodedBytes);
		
		System.out.println(frase);
		
		for(int i = 0; i < decodedBytes.length; i++) {
			decodedBytes[i] = (byte) (decodedBytes[i] + 1);
		}
		
		frase = new String(decodedBytes);
		
		System.out.println(frase);
		
	}

}
