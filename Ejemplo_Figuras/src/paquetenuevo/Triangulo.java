package paquetenuevo;

public class Triangulo {
	public float[] longitudes;
	public float base;
	public float altura;
	public String color;
		
	//primero el tri�ngulo
	public float perimetro() {
		return longitudes[0] + longitudes[1] +longitudes[2];
	}
	public float area() {
		return (base * altura) / 2f;
	}
	public void dibujar() {
		System.out.println("Dibujando " + toString());
	}
	public String toString() {
	return " Triangulo " + base + " x " + altura + " - Color:" + color ;
	}
}
	
	
	
	

