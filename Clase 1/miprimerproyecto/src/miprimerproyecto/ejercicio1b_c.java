package miprimerproyecto;

public class ejercicio1b_c {

	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 14;
		boolean aux = true; 
		
		while(num1 <= num2){
			
			if(num1%2 == 0){
				aux = true;
			}
			else{
				aux = false;
			}
			
			if(aux==false){
				System.out.println(num1);
			}
			
			num1++;
			
		} // while
	}

}
