package arreglos;

public class ManipularArreglo {
	public static void main(String[] args) {
		/*
		Crea una clase llamara ManipularArreglo
		crea un array con los siguientes números enteros:

		1, 6, 45, 53, 80, 102, 145, 326, 450, 892
		Crea un programa que use un ciclo que tome los números de arreglo y devuelva la suma total, 
		la suma de los números pares y la suma de los números impares.
		*/
		
		int []numeros = new int[] {1, 6, 45, 53, 80, 102, 145, 326, 450, 892};
		int sumaPar = 0, sumaImpar = 0, sumaTotal = 0;
		
		 for (int i =0; i < numeros.length; i ++) {
			 sumaTotal = sumaTotal + numeros[i];
			 
			 if(numeros[i] % 2 == 0) {
				 sumaPar = sumaPar + numeros[i];
			 }else {
				 sumaImpar = sumaImpar + numeros[i];
			 }
			 
		 }
		 System.out.println("Suma total: " + sumaTotal);
		 System.out.println("Suma pares: " + sumaPar);
		 System.out.println("Suma impares: " + sumaImpar); 
		 
	}

}

