package paquetenuevo;

public class Cuadrado extends Figura {
	public float lado;
	public String color;
	
	public Cuadrado () {
		this.altura = 1.0f;
		this.base = altura;
		this.color = "transparente";
	}
		public Cuadrado (float lado) {
			this.altura = lado;
			this.base = altura;
			this.color = "transparente";
	}	

		public Cuadrado (float lado, String color) {
			this.lado = lado;
			this.color = color;
	}	
		public Cuadrado (String color) {
			this.lado = 1f;
			this.color = color;
	}	
		
		public float perimetro() {
			return lado * 4;
	}
		public float area() {
			return (lado * lado);
	}
		public String toString() {
		return " Cuadrado " + lado + " - Color:" + color ;
	}
}
