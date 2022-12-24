package com.bytebank.modelo;

public class GuardaReferencias {
	//Crear un objeto para guardar muchas Cuentas
	//Permitir agregar cuentas con un metodo
	//guardaCuentas.adiciona(cuenta);
	//obtener, remover,etc
	
	Object[] referencia = new Object[10];
	int indice = 0;
	
	
	//                     [ x|  |   |   |    |   | ...]
	public void adicionar(Object cc) {
		referencia[indice] = cc;
		indice ++; 
		
	}
	
	public Object obtener(int indice) {
		return referencia[indice];
	}
}
