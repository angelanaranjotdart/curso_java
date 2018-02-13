package com.un.paquete;

public class EjemplosArrayA {

	 public static void main(String[]args) {
		 
	 int[] arrayEnteros = new int[10];
	
	//Bucle for (inicializacion; condicion; iteracion)
	 for (int i = 0; i < arrayEnteros.length; i++) { // i = i + i 
	 arrayEnteros[i] = i * i;
	 System.out.println("array(" + i + ")= " + arrayEnteros[i]);
   }
	 float[] decimales = new float[3];
   for(int j= 0; j < decimales.length; j++) {
	   decimales[j] = j / 3;
	   System.out.println("El tercio de " + j + " es " + decimales[j]);
   }
   int otroArray[] = {5, 10, 15, 20, 25,};
   for (int elementos : otroArray) {
	   System.out.println("Elemento = " + elementos);
   }
   int otroArray1[] = {1,};
   for (int lunes : otroArray1) {
	   System.out.println("lunes = " + lunes);
   }
   int otroArray2[] = {2,};
   for (int martes : otroArray2) {
	   System.out.println("martes = " + martes);
  }
   int otroArray3[] = {3,};
   for (int miercoles : otroArray3) {
	   System.out.println("miercoles = " + miercoles);
}
   String[] dias = {"lunes","martes","miercoles","jueves","viernes"};
   for (String dia :dias) {
	   System.out.println(dia);
     }
   int numDia = dias.length - 1;
   while ( numDia <dias.length) {
	   System.out.println(dias [ numDia] );
	   numDia = numDia + 1;
   }
 
   
   }
 }
	 
