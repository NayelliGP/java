import java.util.Scanner;

public class EstructudaDeControlIf {
	public static void main (String []args) {
		//Estructura de control de flujo
		//Nos sirve para la toma de decisiones
		
		//Estryturas de control de flujo nos sirven para
		//cambiar el flujo de nuestros programa
		//evualando una condición y apartir de la evolucón
		//se realiza una acción u otra
		/*
		if(condicion) {
			codigo
		}else {
			codigo
		}
		*/
		
		System.out.println("Introduce tu edad: ");
		Scanner sc = new Scanner(System.in);
		int edad = sc.nextInt();
		
		if(edad >= 18) {
			System.out.println("Eres mayor de edad");
		}else {
			System.out.println("Eres menor de edad");
		}
		
	
		
		
		
		
		
		
		}

}
