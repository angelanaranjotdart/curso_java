package com.mipaquete;

public class Ejemplobooleanos {

	public static void funcionPrincipal() {
		System.out.println("Ejemplos booleanos.");
		
		int a = 3;
		int b = 3;
		operadoresComparacion(a, b);
		
	}
	public static void operadoresComparacion(int a, int b) {
	
	if (a == b)
			System.out.println("son iguales");
		if (a > b)
			System.out.println(a + "mayor que" + b);
		if (a < b)
			System.out.println(a + " es menor que " + b);
		if (a != b)
			System.out.println("distinto de negación");
		if (a <= b)
			System.out.println(a + " es menor o igual que " + b);
		if (a >= b)
			System.out.println(a + " es mayor o igual que " + b);
}
}

