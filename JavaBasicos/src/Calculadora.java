import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		/*
		   * Pedir al usuario 2 números por consola y preguntarle que desea realizar
		   * 1) Suma
		   * 2) Resta
		   * 3) División
		   * 4) Multiplicación
		   * 
		   * y despues imprimir el resultado
		   */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Operación");
		double num1 = 0, num2 = 0, operacion = 0;

		System.out.println("Ingresa el primer número");
		num1 = sc.nextDouble();
		System.out.println("Ingresa el segundo número");
		num2 = sc.nextDouble();
		
		sc.nextLine();
		System.out.println("¿Qué operación deseas hacer?");
		String operaciones =sc.nextLine();
		
		
		switch(operaciones.toLowerCase()) {
		 case "suma":
			  operacion = num1 + num2;
			  System.out.println("Suma es igual a: " + operacion);
			  break;
		 case "resta":
			  operacion = num1 - num2;
			  System.out.println("Resta es igual a: " + operacion);
			  break;
		 case "division":
			  operacion = num1 / num2;
			  System.out.println("Divición es igual a: " + operacion);
			  break;
		 case "multiplicacion":
			  operacion = num1 * num2;
			  System.out.println("Multiplicación es igual a: " + operacion);
			  break;
		 default:
			System.out.println("Esta operación no es valida");
		
		
		}
		
		
		
	}

}
