package com.bytebank.test;

public class TestWrappers {

		public static void main(String[] args) {
			
			Double numeroDoble = 33.0; //autoboxing
			Boolean verdadero = true; //autoboxing
			
			Double numeroDoble2 = Double.valueOf(33); //le agrega el decimal 0 para que compile 33.0
			System.out.println(numeroDoble2);
			
			String numeroString = "43"; //autoboxing 
			
			Double stringToDouble = Double.valueOf(numeroString);
			Integer IntegerToDouble = Integer.valueOf(numeroString);
			
			System.out.println(stringToDouble);
			System.out.println(IntegerToDouble);
			
			Number numero = Integer.valueOf(5);
			double numeroDoublePrim = numero.doubleValue(); //unboxing porque automaticamente saca d eun obj a un primitivo
			
			Boolean falso = Boolean.FALSE;
		}
	
}
