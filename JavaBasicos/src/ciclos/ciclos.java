package ciclos;

public class ciclos {
	public static void main(String[] args) {
		//while
		/*
		int control = 0;
		
		while(control< 10) {
			System.out.println("Control = " + control);
			control++;
		}*/
		
		// do while
		/*
		int control = 3;
		
		do {
			//codigo a ejecutar
			System.out.println("Control =" + control);
			//modificador de la variablecontrol
			control++;
		}while(control < 3);
		*/
		
		//for
		/*
		for(int i=0; i < 3; i++) {
			System.out.println("Control =" + i);
			
		}*/
		//brack & continue
		/*
		for (int i=0; i < 10; i++) {
			if(i % 2 == 0) {//solo se muestra cuando el valor de i sea numero par
				System.out.println("Control _=" + i);
				break;//termina el ciclo
				//solo deje que sse ejecute una vez  lo que está antes 
			}
			System.out.println("Control =" + i);
		}
		*/
		
		for (int i=0; i < 10; i++) {
			if(i % 2 == 0) {//solo se ejecuta cuando el valor de i sea numero par
				
				continue;//permite saltar una ejecución del ciclo
				//deja que continúe el ciclo
			}
			System.out.println("Control =" + i);
		}
		for (int i=0; i < 3; i++) {
			System.out.println("Control2 =" + i);
			continue;
			
		}
		
		
		
		
		}
	}
	
