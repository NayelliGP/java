package metodos;

public class Metodos {
	//M�todos es una funci�n
	
	//atributos de la clase 
	int a, b;
	
	
	//Metdos void
	
	public void sumar() {
		int resultado = a + b;
		System.out.println("el resultado de sumar " + a + "m�s " + b +"es " + resultado);
	}
	
	//m�todos con retorno de valores
	public int sumaConRetorno() {
		//int resultado = a + b;
		//return resultado ;
		return a + b;
	}
	
	//argumentos
	//Suma(argumentos);
	
	public double multiplicarConArgumentos(int arg1, double arg2) {
			int c = arg1;
			double d = arg2;
			return c * d ;
		}
	//M�todo est�tico
	//estatico, void(no regresa datos), usa argumentos
	public static void imprimirNombre(String nombre) {
		System.out.println("Mi nombre es: "+ nombre);
	}
	
}