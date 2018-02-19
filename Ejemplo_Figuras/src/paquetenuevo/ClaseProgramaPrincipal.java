package paquetenuevo;

public class ClaseProgramaPrincipal {

		public static void main(String[] args) {
			Cuadrado miCuadrado_A = new Cuadrado(10);
			miCuadrado_A.lado = 10;
			
			Cuadrado miCuadrado_B = new Cuadrado("rojo");
			miCuadrado_B.color = "rojo";
			
			Cuadrado miCuadrado_C = new Cuadrado(5,"azul");
			
			Cuadrado miCuadrado_D = new Cuadrado("azul");
			// miCuadrado.lado = 5;
			
			System.out.println("Area: " + miCuadrado_A.area());
			System.out.println("Color: " + miCuadrado_A.color);
		}
			
		public static void main_array() {
			Triangulo [] triangulos;
			triangulos = new Triangulo[3];
			triangulos[0] = new Triangulo();
			triangulos[1] = new Triangulo();
			triangulos[2] = new Triangulo();
		
	}
		
public static void main_basico (){
		Triangulo trianguloAngela = new Triangulo();
		float[] tempLongitudes = {2, 3, 5};
		trianguloAngela.longitudes = tempLongitudes; 
		System.out.println("El perimetro es " + trianguloAngela.perimetro());
		trianguloAngela.base =5f;
		trianguloAngela.altura=8f;
		System.out.println(trianguloAngela.toString());
		System.out.println("El areas es" + trianguloAngela.area());
		
		Triangulo trianguloSergio = new Triangulo();
		float[] tempLongitudes1 = {2,3,5};
		trianguloSergio.longitudes = tempLongitudes1; 
		System.out.println("El perimetro es " + trianguloSergio.perimetro());
		trianguloSergio.base =10f;
		trianguloSergio.altura =12f;
		System.out.println(trianguloSergio.toString());
		System.out.println("El areas es" + trianguloSergio.area());
		
		Cuadrado cuadradoAngela = new Cuadrado();
		float[] templongitudes = tempLongitudes1; 
		System.out.println("El perimetro es " + cuadradoAngela.perimetro());
		cuadradoAngela.lado = 4f;
		cuadradoAngela.color = "Morado";
		System.out.println(cuadradoAngela.toString());
		System.out.println("El areas es" + cuadradoAngela.area());
		
	}
}
