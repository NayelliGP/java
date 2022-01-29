import java.util.Scanner;

public class EjercicioDescuentoCompra {
	public static void main (String[] args) {
		//solicitar el total de una compra por consola.
		// si la cuenta es de menos de 1000
				// sila cuenta es de 1000 - 4999 10%
				// si la cuenta es de 5000 a 9999 20%
				// si la copra es de 10000 o más 30%
		Scanner sc = new Scanner(System.in);
		
		double compra = 0, descuento = 0, total = 0;
		System.out.println("Descuento");
		System.out.println("De cuanto fue tu compra:");
		compra= sc.nextDouble();
		//System.out.println("La venta es de: "+ venta);
		
		if(compra>=1000 || compra>5000 ){
			System.out.println("Tu descuento es de el 10%");
			descuento=(double) (compra*0.10);
			total = compra - descuento;
			System.out.println("Tu total a pagar es de:" + total);
		}else if(compra>=5000 || compra>10000 ){
			System.out.println("Tu descuento es de el 20%");
			descuento=(double) (compra*0.20);
			total = compra - descuento;
			System.out.println("Tu total a pagar es de:" + total);
		}else if(compra>=10000 ){
			System.out.println("Tu descuento es de el 30%");
			descuento=(double) (compra*0.30);
			total = compra - descuento;
			System.out.println("Tu total a pagar es de:" + total);
		}else {
			System.out.println("No tienes descuento");
		}
			
			
			
			
	}

}
