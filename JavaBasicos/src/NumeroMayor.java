import java.util.Scanner;

public class NumeroMayor {
	public static void main (String[] args) {
		
		/*
		 * Pedir 3 n�meros al usuario y mostrar un mensaje con el  n�mero mayor
		 */
		
		
		Scanner sc = new Scanner(System.in);
		int numero1, numero2, numero3;
		
		System.out.println("N�mero Mayor");
		System.out.println("Introduce el primer n�mero: ");
		numero1 = sc.nextInt();
		System.out.println("Introduce el segundo n�mero: ");
		numero2 = sc.nextInt();
		System.out.println("Introduce el tercer n�mero: ");
		numero3 = sc.nextInt();
		// arreglar
		if(numero1 > numero2) {
			if (numero1 > numero3) {
				System.out.println("El numero 1 es mayor con el valor de: " + numero1);
			}else{
				System.out.println("El numero 3 es mayor con el valor de: " + numero3);
			}
		}else if(numero2 > numero3) {
			System.out.println("El numero 2 es mayor con el valor de: " + numero2);
		}else if(numero1 == numero2) {
			System.out.println("El numero 1 y 2 son iguales");
		}else if(numero2 == numero3) {
			System.out.println("El numero 2 y 3 son iguales");
		}else if (numero1 == numero3) {
			System.out.println("El numero 1 y 3 son iguales");
			
		}
		else {
			System.out.println("El numero 3 es mayor con el valor de: " + numero3);
		}
		/*
		 * 1 4 4
		4 1 4
		4 4 1
		5 4 4
		4 5 4
		4 4 5
		 */
	
		
	}

}
