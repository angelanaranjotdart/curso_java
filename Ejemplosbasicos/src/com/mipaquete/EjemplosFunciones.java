package com.mipaquete;

public class EjemplosFunciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("V3 - ProgramaCine");
		
		// Empezando
		
		int x;
		int y;
		x = 3;
		y= 5;
		
		int resultadoSuma = sumarNumeros(x, y);
		int resultadoResta = restarNumeros(x, y);
		
		System.out.println("Resultado = " + resultadoSuma);
		System.out.println("Resultado = " + resultadoResta);
		System.out.println("Resultado cuadrado = " + alCuadrado(6));
		System.out.println("Resultado cuadrado = " + alCuadrado(y));
		System.out.println("Res"
				+ "ultado cubo = " + alCubo(y));
		System.out.println("Resultado cubo = " + alCubo(3));
		
	}
	public static int  sumarNumeros(int valor_1, int valor_2) {
		return valor_1 + valor_2;
	}
	public static int  restarNumeros(int valor_1, int valor_2) {
		return valor_1 - valor_2;
	}
	public static int  alCuadrado(int v) {
		int resultado = v * v;
		return resultado;
	}
	public static double  alCubo(int parametro) {
		double resultado = Math.pow(parametro, 3);
		return resultado;
}
}
