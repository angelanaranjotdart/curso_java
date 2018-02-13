import java.util.concurrent.SynchronousQueue;

/* Programa cine:
 * Pelicula interesante, dinero, horario, lugar, compañía, transporte
 */
import java.util.Scanner;

public class ProgramaCineV3 {
	public static void main(String[] args) {
		
		// Creación de VARIABLES
		
		boolean SiIrAlCine = false;
		boolean SiTenemosCapital = false;
		boolean SiHayPase = false;
		double precioEntrada = 7.50;
		int horaUsuario = 0;
		int horaCine_1 = 21;
		int horaCine_2 = 23;
		
		//Petición de DATOS
		
		System.out.println("Introduzca su capital");
		
		Scanner sc = new Scanner (System.in); 
		String nombre = sc.nextLine();
		System.out.println("El nombre es" + nombre );
		double capital = sc.nextDouble();
		
		System.out.println("Introduzca la hora que puedes ir");
	
		SiIrAlCine = siTenemosCapital (precioEntrada, capital);
		SiIrAlCine = SiHayPase (horaUsuario, horaCine_1);
		
		
		SiTenemosDinero = siTenemosCapital (precioEntrada, capital);
		SiHayDisponible = SiHayPase (horaUsuario, horaCine_1);
		SiIrAlCine = SiTenemosCapital || SiTenemosCapital;
				
		if (SiIrAlCine)
			System.out.println("Podemos ir al cine");
		 else 
			System.out.println("No Podemos ir al cine");
		sc.close();
	}
	
	static boolean siTenemosCapital (double precio, double capital) {
					
		if (capital < precio) 
			return false;
	 else 
			return true;
	}
	static boolean SiHayPase() {
		return true;
	}
}

	