package metodos;

public class Metodos {
	//Métodos es una función
	
	//atributos de la clase 
	int a, b;
	
	
	//Metdos void
	
	public void sumar() {
		int resultado = a + b;
		System.out.println("el resultado de sumar " + a + "más " + b +"es " + resultado);
	}
	
	//métodos con retorno de valores
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
	//Método estático
	//estatico, void(no regresa datos), usa argumentos
	public static void imprimirNombre(String nombre) {
		System.out.println("Mi nombre es: "+ nombre);
	}
	
}