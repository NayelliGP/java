import java.util.Scanner;

public class EjercicioTriangulo {
	public static void main (String[] args) {
		/*
		 * Pedirle 3 �ngulos a un usuario y decirle si es un triangulo v�lido
		 */
		Scanner sc = new Scanner(System.in);
		int lado1, lado2, lado3;
		
		System.out.println("Introduce el primer �ngulo del triangulo:");
		lado1 = sc.nextInt();
		System.out.println("Introduce el segundo �ngulo del triangulo:");
		lado2 = sc.nextInt();
		System.out.println("Introduce el tercer �ngulo del triangulo:");
		lado3 = sc.nextInt();
		
		int suma = lado1 + lado2 + lado3;
		
		if(suma == 180){
			System.out.println("Es un triangulo ya que los �ngulos suman 180 ");
		}else {
			System.out.println("No es  un triangulo ya quelos �ngulos no suman 180");
		}
		
                    
                    
		
	}

}
