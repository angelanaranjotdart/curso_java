public class ProgramaCine
{
	public static void main(String[] argumentos) {
		// Asignamos variables
		String titulo = "Torrente 8";	// Titulo en variabe de texto
		boolean VarSiIrAlCine = false; 	// Resultado para saber si ir al cine en bool
		int precioEntrada = 9;
		int NuestroCapital = 40;		// El dinero que tenemos
		
		
		//Instrucciones de salida por consola
		System.out.println ( "PROGRAMA CINE" );
		
		// Imprimimos el titulo
		System.out.println ( "Titulo: " + titulo + "." );
		
		//Lógica del dinero
		System.out.println ( "Precio: " + precioEntrada );
		if (NuestroCapital > precioEntrada) 
			VarSiIrAlCine = true;
			else 
			VarSiIrAlCine = false;
		
			if ( VarSiIrAlCine == true ) {
				System.out.println ("SI Podriamos ir al cine");
				NuestroCapital = NuestroCapital - precioEntrada;
			} else {
				System.out.println ("NO Podriamos ir al cine");
		}
	}
}