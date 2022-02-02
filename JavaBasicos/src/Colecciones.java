import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
//import.java.util.*;

public class Colecciones {
	public static void main(String[] args) {
		//Las colecciones nos sirven para almacenar un conjunto de objetos
		//La diferencia de las colecciones y los objetos es que las colecciones son dinamicas,
		//pueden cambiar el número de objetos agregados.
		
		//Set tiene 3 implementaciones: HashSet, TreeSet, LinkedHashSet
			// no puede contener elementos repetidos
		
		//HashSet
			//Los elementos no mantienen un orden
			//Es la implementación más rápida
			//no almacena (muestra) elementos repetidos
		/*
		Set<String> frutas  =new HashSet<String>();
		frutas.add("sandia");
		frutas.add("mango");
		frutas.add("granada");
		frutas.add("piña");
		frutas.add("mamey");
		frutas.add("fresa");
		*/
		
		//foreach, puede recorrer una colección y en cada recorrido recupera el valor 
		//y lo pedemos almacenar en una variable
		//Sintaxis
		//for(tipoDeDatoElemento variable : elementoARecorrer)
		/*
		for(String fruta : frutas) {
			System.out.println(fruta);	
		}
		*/
		
		//TreeSet
			//Esta implementación ordena los elementos en función de sus valolres
			//Es la implementaión más lenta
			//Ordena alfabeticamente, las letras mayusculas van antes que las minisculas
		/*
		Set<String> frutas  =new TreeSet<String>();
		frutas.add("sandia");
		frutas.add("mango");
		frutas.add("granada");
		frutas.add("piña");
		frutas.add("mamey");
		frutas.add("fresa");
		
		for(String fruta : frutas) {
			System.out.println(fruta);	
		}
		*/
		
		//LinkedHashSet
			//Ordena los elementos en orden de inserción
			//Es mas costoso que hashSet
		//
		/*
		Set<String> frutas  =new LinkedHashSet<String>();
		frutas.add("sandia");
		frutas.add("mango");
		frutas.add("granada");
		frutas.add("piña");
		frutas.add("mamey");
		frutas.add("fresa");
		
		for(String fruta : frutas) {
			System.out.println(fruta);	
		}
		*/
		
		//Orden de velocidad 
			//1.HashSet
			//2.LinkedHashSet
			//3.TreeSet
		
		//List: 
			//Se permiten elementos duplicados
			//Podemos acceder a elementos especificos
			//Podemos buscar elementos	
		
		//ArrayList
		
		List<String> pokemones = new ArrayList<String>();
		pokemones.add("chicorita");
		pokemones.add("Eevee");
		pokemones.add("Psyduck");
		pokemones.add("Dragonite");
		pokemones.add("Charizard");
		pokemones.add("Gengar");
		pokemones.add("Flygon");
		pokemones.add("Gengar");
		
		//add si agregamos un indice y uun elemento, posicion el elemento en el índice y realiza
		//un desplazamiento, es decir no borra el elemento en la posición sino que los desplaza
		pokemones.add(2, "Pikachu"); //agrgamos a pikachu en la posición 2
		
		//remove remueve el elemento de la posición especificada
		pokemones.remove(5);
		
		//set remplaza el elemento en la posición especificada
		pokemones.set(0, "Flareon");
		
		for(String pokemon : pokemones) {
			System.out.println(pokemon);
		}
		
		System.out.println("***************");
		System.out.println(pokemones.get(4));
		//get devuelve el elemento que se encuentre en la posición que esten dentro de los ( )
		
		//indexOf, nos va a devolver la posición del elemento 
		//y si el elemento no se encuentra nos devuelve -1
		
		//System.out.println(pokemones.indexOf("Gengar"));//el primer elemento que coincide es del que devulve el índice
		//System.out.println(pokemones.lastIndexOf("Gengar"));//el ultimo elemento que coincide es del que devulve el índice
		System.out.println(pokemones.indexOf("Togepi"));//devuelve -1por que no se encuentra en la lista
		
		System.out.println("*************************");
		
		//LinkedList
			//Es una lista doblemente enlazada
			//Es más rápido para insertar y remover elementos
		List<String> digimones = new LinkedList<String>();
		digimones.add("Agumon");
		digimones.add("Patamosn");
		digimones.add("Angemon");
		digimones.add("Andromon");
		digimones.add("Greymon");
		
		String digimon = digimones.get(0);
			System.out.println(digimon);
		
		
		System.out.println("*************************");
		
		//Map: HasMap, 
			//Asocia claves a valores.
			//No puede contener claves duplicadas
			//Solo puedetener unvalor asociado
		
		//HasMap
			//Tiene mejor rendimiento pero no garantiza un orden a la hora de hacer interaciones
		
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		//usuarios.put(llave, "Valor");
		usuarios.put(1123, "Carlos Eduardo");
		usuarios.put(3242, "Raul");
		//usuarios.put(3242, "Pedro"); HashMap no acepta claves duplicadas
		usuarios.put(3243, "Ro");
		
		System.out.println(usuarios.get(1123));
		
		//ketSet: Nos permite recuperar el nombre de la clave
		System.out.println(usuarios.keySet()); //Muestra las llaves 
		//values: Nos permite recuperar el valor directamente
		System.out.println(usuarios.values());
		//syso + ctrl+espacio
		
		//TreeMap
			//es mas lento
			//ordena los valores
		Map<Integer, String> tamales =new TreeMap<Integer, String>();
		tamales.put( 5 ," Mole rojo" );
		tamales.put( 9 ," Mole verde" );
		tamales.put( 160 ," Gansitos" );
		tamales.put( 1 ," Cochinita" );
		/*		Map<Integer, String> tamales =new TreeMap<Integer, String>();
		tamales.put( "Oaxaqueña","Mole rojo" );
		tamales.put( "Torta","Mole verde" );
		tamales.put( "Dulces","Gansitos" );
		tamales.put( "Salados","Cochinita" );**/
		
		System.out.println("******************");
		System.out.println(tamales.keySet());
		System.out.println(tamales.values());
		System.out.println(tamales);
		
		tamales.entrySet().forEach (elemento ->{ //sunción lambdan
			//System.out.println(elemento.getKey().toString() + elemento.getValue().toString());
			//System.out.println(elemento);
			System.out.println(elemento.getKey());
			System.out.println(elemento.getValue());

		});
		
		//LinkedHashMap
		 
		Map<Integer, String> carros = new LinkedHashMap<Integer, String>();
		//gurda los elemntos segun el orden en el que ayan sido insertado
		carros.put(1, "volvo");
		carros.put(567, "Pointer");
		carros.put(8, "Mustang");
		
		System.out.println("*************************");
		System.out.println(carros.keySet());
		System.out.println(tamales.values());
		
		
		
		
		
		

		/*
		String miCadena = "Hola a todas, todos, todes";
		System.out.printl(miCadena.charAt(0);
		*/
	}
}
