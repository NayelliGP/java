package ciclos;
import java.util.HashSet;
import java.util.Set;

public class Colecciones {
	public static void main(String[] args) {
		//Las colecciones nos sirven para almacenar un conjunto de objetos
		//La diferencia de las colecciones y los objetos es que las colecciones son dinamicas,
		//pueden cambiar el n?mero de objetos agregados.
		
		//Set tiene 3 implementaciones: HashSet, TreeSet, LinkeHasSet
			// no puede contener elementos repetidos
		
		//HashSet
			//Los elementos no mantienen un orden
			//Es la implementaci?n m?s r?pida
		/*
		Set<String> frutas  =new HashSet<String>();
		frutas.add("sandia");
		frutas.add("mango");
		frutas.add("granada");
		frutas.add("pi?a");
		frutas.add("mamey");
		frutas.add("fresa");
		*/
		
		//foreach, puede recorrer una colecci?n y en cada recorrido recupera el valor 
		//y lo pedemos almacenar en una variable
		//Sintaxis
		//for(tipoDeDatoElemento variable : elementoARecorrer)
		/*
		for(String fruta : frutas) {
			System.out.println(fruta);	
		}
		*/
		
		//TreeSet
		Set<String> frutas  =new HashSet<String>();
		frutas.add("sandia");
		frutas.add("mango");
		frutas.add("granada");
		frutas.add("pi?a");
		frutas.add("mamey");
		frutas.add("fresa");
		
		for(String fruta : frutas) {
			System.out.println(fruta);	
		}
		
		//LinkeHasSet
		
		
		
		
	}
}
