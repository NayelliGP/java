package arreglos;

public class Arreglos {
	public static void main(String[] args) {
		//solo un tipo de dato
		//especificar el tamaño o la cantidad de elementos que va a contener
		
		//1 manera
		int numeros[];// creamos la variable
		numeros = new int[4];//creando el arreglo
		
		//2da manera
		String[] nombres = new String[4];//vasado en 0. [0, 1, 2, 3]
		
		//3ra manera
		//array literal
		String[]nombreFrutas = new String[] {"Manzana", "Platano", "Uva", "Pera"};
		
		numeros[0] = 10;
		numeros[1] = 8;
		numeros[2] = 100;
		numeros[3] = 200;
		//numeros[4]= 200; //no se puede modificar una vez ya iniciados
		
		nombres[0] = "Juan";
		nombres[1] = "Pedro";
		nombres[2] = "Antonio";
		nombres[3] = "Felipe";
		
		System.out.println(numeros[0]);//imprime solo este arreglo
		System.out.println(numeros[1]);
		System.out.println(numeros);//imprime el espacio de memoria en donde esta
		System.out.println("--------------------------------- ");
		
		for(int i=0; i< numeros.length; i++) {//en arrays es una propiedad 
			System.out.println("Elementos de números " + numeros[i]);//[0], [1], ...
			System.out.println("Elementos de nombres " + nombres[i]);
			System.out.println("Elementos de frutas " + nombreFrutas[i]);
			System.out.println("--------------------------------- ");
		}
		
	}
}
