package com.bytebank.test;

public class TestMain {
	public static void main(String[] args) {
		
		for (int i = 0; i< args.length; i++) {
			//System.out.println(args status[i]);
		}
		
		int edad = 20;
		int edad2 = 15;
		int edad3 = 67;
		
		//Quiero agruparlas en una sola referencia
		
		//indices        0 1 2 3 4
		//              [ | | | | ]
		int[] edades = new int[5];
		edades[2] = 30; 
		
		System.out.println(edades[2]);
		System.out.println(edades[0]); //siempre inicializan con 0
		
		//Un array es un conjunto de datos en una misma estructura de datos

		//Para acceder a el tengo que indicarle el indice que quiero guardar un valor
		//Indice es la posicion en la cual está la sección de una caja (siempre parte en 0.
		
		
		//System.out.println(edades[5]);
		
		int tamanoArray = edades.length;
		System.out.println(tamanoArray);
		
		for(int i = 0; i < tamanoArray; i++) {
			System.out.println(edades[i]);
		}
		
	}
}
