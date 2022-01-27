package operadores;

import java.util.Scanner;

public class Operadores {
	public static void main (String[] args) {
		//Operadores aritmeticos 
		//+, -, /, *, %
		
		int a = 10;
		int b = 20;
		double c = 10.5;
		
		int suma = a + b;
		System.out.println(suma);
		
		//concatenación
		String str1 = "El resultado de la suma es: ";
		System.out.println(str1 + suma);
		
		//Resta
		System.out.println("El resultado de la resta es: " + (a - b));
		
		//División
		int division = a / b;
		System.out.println("El resultado de la división es: " + division);
		
		
		//double division2 = (double) a / b;
		double division2 = c / b;
		//por lo menos uno de los datos debe ser de tipo doble para que nos represente
		//los decimales correctmente
		// 10.0 / 20 = 0.5
		System.out.println("El resultado de la división es: " + division2);
		
		//multiplicación
		double multiplicacion = c * a;
		System.out.println("El resultado de la multiplicación es: " + multiplicacion);
		
		//modulo
		int modulo = a % b;
		System.out.println("El resultado del módulo es: " + modulo);
		
		/* 
		 * Operador de asignación
		 * =
		 */
		int d = 5, e; //inicializar las variables vacias
		e = 6;
		System.out.println(d + " - " + e);
		
		//Operadores de declaración compuesta
		// +=, -=, *=, /=, %=
		//una operación simple
		
		int f = 0, g = 5;
		
		f += 5;
		//f = f + 5
		
		System.out.println(f);
		
		//Operadores relacionales
		/*  <, >, <=, >=
		 * == igualdad
		 * != diferencia
		 * Resultado un valor de tipo boolean/boleano (treue, false)
		 */
		
		int h = 15, i = 25;
		String j = "Hola";
		
		System.out.println(h > i); //false
		System.out.println(i != h);
		//System.out.println(h != j); //son valores didtintos y no se pueden comparar
		
		//operador unario
		/* ++, --
		 * preasignación -- ++k se le asigna un valor antes de unirse
		 * postasignación -- k++ primero lee el valor y despues le suma
		 */
		
		int k = 0 , l = 0;
		k++;
		System.out.println(k); //0
		System.out.println(--l); 
		
		//Precedencia de operadores-- Jerarquia de los operadores
		
		int operacion = (4 + 5) * 6 / 3;//14
		//5*6 = 30
		//30/3 =10
		//4+10 =14
		System.out.println(operacion);
		
		int x = 0, y = 0;
		int operacion2 = ++x + y--;
		// x=1, y=0;
		System.out.println(operacion2);
		
		//operador ternario -- operador elvis
		// es un if..else abreviado
		//solo nos perite tomar una decisión
		
		//int edad = 18, volor1 = 0,valor2 = 1 ;
		int edad = 18;
		int valor = (edad<=18)? 2:1;
	
		//int resultado = (edad <= 18) ?  volor1 : valor2;
		//String resultado = (edad <= 18) ?  "uno" : "dos";
		//int resultado = (edad <= 18) ?  (volor1 = 2 ): (valor2 =3);
		
		//los parentesis son opcionales
		//System.out.println(resultado);
		
		//operadores lógicos
		//And - &&
		// or - ||
		
		System.out.println(true && true);//true
		System.out.println(true && false);//false
		System.out.println(true || true);//true
		System.out.println(true && !false);//true
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Escribe un número: ");
		int num = sc.nextInt();
		System.out.println(num);
		
		
		
	}

}
