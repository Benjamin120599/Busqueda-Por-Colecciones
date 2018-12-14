import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 	Framework Collecciones Java
 * 
 * 	INTERFACES
 * 		Set		NO permite duplicadas
 * 		List	SI permite duplicadas
 * 		Map		NO permite duplicados de CLAVES (Pares CLAVE-VALOR)
 * 
 * 		Implementaciones
 * 			Set -> HashSet, LinkedHashSet, y Treeset
 * 			List -> ArrayList y LinkedList
 * 			Map -> HashMap, LinkedHashMap y TreeMap
 * 
 * 	CLASES
 * 		Vector
 * 		Queue
 * 		Dequeue
 * 		Stack
 *
 */

class Colecciones {
	
	public void Prueba() {
		
		ArrayList<Integer> numeros = new ArrayList<>();
		
		numeros.add(10);
		numeros.add(4);
		numeros.add(-9);
		numeros.add(32);
		numeros.add(-1);
		
		System.out.println(numeros.toString());
		Collections.sort(numeros);
		System.out.println(numeros.toString());
		
		ArrayList<String> nombres = new ArrayList<>();
		
		nombres.add("Luke");
		nombres.add("Leia");
		nombres.add("Anakyn");
		nombres.add("Obi Wan Kenobi");
		
		ArrayList<String> copiaNombres = (ArrayList<String>) nombres.clone();
		
		System.out.println(nombres.toString());
		Collections.sort(nombres);
		System.out.println(nombres.toString());
		
		System.out.println("======== Ordenamiento en orden Inverso ========");
		System.out.println(copiaNombres.toString());
		Collections.sort(copiaNombres, Collections.reverseOrder());
		System.out.println(copiaNombres.toString());
		
		
		System.out.println("================================================");
		
		class Alumno implements Comparable<Alumno> {
			String numControl;
			Integer edad;
			
			public Alumno(String numControl, int edad) {
				this.numControl = numControl;
				this.edad = edad;
			}

			@Override
			public String toString() {
				return "Alumno [numControl=" + numControl + ", edad=" + edad + ", getClass()=" + getClass()
						+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
			}

			/*
			@Override
			public int compareTo(Alumno o) {
				// TODO Auto-generated method stub
				return numControl.compareTo(o.numControl);
			}
			*/
			
			public int compareTo(Alumno o) {
				return edad.compareTo(o.edad);
			}
			
		}
		
		Alumno a1 = new Alumno("17", 20);
		Alumno a2 = new Alumno("1", 1);
		Alumno a3 = new Alumno("7", 56);
		Alumno a4 = new Alumno("878", 30);
		Alumno a5 = new Alumno("3", 7);
		
		ArrayList<Alumno> alumnos = new ArrayList<>();
		alumnos.add(a1);
		alumnos.add(a2);
		alumnos.add(a3);
		alumnos.add(a4);
		alumnos.add(a5);
		
		System.out.println(alumnos.toString());
		Collections.sort(alumnos);
		System.out.println(alumnos.toString());
		
		
		System.out.println(Collections.binarySearch(numeros, -1));
		System.out.println(Collections.binarySearch(alumnos, a3));
		
		
		//TAREA: Aplicar Binary Search en coleccion alumnos
	}
	
	
}


public class Prueba {

	public static void main(String[] args) {
			
		Scanner entrada = new Scanner(System.in);
		int opcion = 0;
	
		do {
			
			System.out.println("               M E N Ú");
			System.out.println();
			System.out.println("1) Búsqueda Por Colecciones.");
			System.out.println("0) Salir.");
			System.out.println();
			System.out.println("Elija una opción: ");
			opcion = entrada.nextInt();
			
			switch(opcion) {
				case 1:
					Colecciones col = new Colecciones();
					col.Prueba();
					break;
					
				case 0:
					System.out.println("Saliendo...");
					break;
			}
			
		}while(opcion != 0);

	}

}
