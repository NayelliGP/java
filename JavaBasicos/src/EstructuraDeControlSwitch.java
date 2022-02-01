import java.util.Scanner;

public class EstructuraDeControlSwitch {
	//estructuras de control nos sirven para controlar el flujo de
	//comprtaiento de un programa. Para la toma de decisiones.
	
	/*
	 * Switch(conddición_a_evaluar){
	 case "valor":
	 	//codigo a ejecutar
	 	//breack;
	 	...
	 case "n":
	 	//codigo a ejecutar
	 	//breack:
	 default:
	 	//codigo a ejecutar
	 }
	 
	 */
	public static void main(String[] args) {
		//Solicitar al usuario un día de la seman y mostrar un mensaje
		
		System.out.println("Introduce un día de la seman y recibe un bonito mensaje. :-)");
		Scanner sc = new Scanner(System.in);
		String dia =sc.nextLine();
		
		switch(dia.toLowerCase()) {
		  case "lunes":
			  System.out.println("Ya mero es viernes, toma un cafe");
			  break;
		  case "martes":
			  System.out.println("Martes, ya casi...");
			  break;
		  case "miercoles":
		  	  System.out.println("Miercoles, pero a que costo");
			  break;
		  case "jueves":
		  	  System.out.println("Juebebes de sed peligrosa");
			  break;
		  case "viernes":
		  	  System.out.println("viernes de fista");
			  break;
		  case "sabado":
//		  	  System.out.println("Sabado");
//			  break;
		  case "domingo":
		  	  System.out.println("Basta de trabajación");
			  break;
		  default:
			  System.out.println("Dia desconocido");
		}
	}
	

}
