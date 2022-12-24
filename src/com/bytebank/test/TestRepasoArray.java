package com.bytebank.test;

import java.util.ArrayList;
import java.util.List;

public class TestRepasoArray {

	public static void main(String[] args) {
		
		int[] numeros = new int[10];
		
		int numero = 40;
		
		//Wrapper
		
		//Integer numeroObjeto = new Integer(40);		deprecado
		Integer numeroObjeto = Integer.valueOf(40);
		
		
		List lista = new ArrayList();
		
		List<Integer> lista1 = new ArrayList<Integer>();
		//primitivo != object
		lista1.add(numero); //autoboxing, detecta que e sun entero primitivo
		lista1.add (Integer.valueOf(40));
		lista1.add(numeroObjeto);
		
		//unboxing: valor primitivo de un obj, guarda el valor numerico del objeto
		//int ValorPrimitivo = numeroObjeto;
		int ValorPrimitivo = numeroObjeto.intValue();
		
		numeroObjeto.byteValue();	
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Integer.SIZE); //da el tamaño en bytes
		System.out.println(Integer.BYTES); //soporta 4
		
		
	}
}
