package ciclos;

import java.util.Scanner;

public class DeletreaNombre {
	public static void main(String[] args) {
		/*
		 * Escribe un programa que pida al usuario ingresar su nombre y que entonces imprima 
		   cada una de las letras de su nombre.
			Ejemplo: "Juan"
			"J"
			"u"
			"a"
			"n"
			Como pista pueden investigar c�mo se usan los siguientes m�todos de String:
			length()
			charAt(i)
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa tu nombre:" );
		String nombre = sc.nextLine();
		
		for (int i = 0; i <nombre.length(); i++) {
			System.out.println(nombre.charAt(i));
		}
		
		
		
	}
}

