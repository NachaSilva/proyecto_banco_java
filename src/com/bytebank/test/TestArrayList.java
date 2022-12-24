package com.bytebank.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaCorriente;
import com.bytebank.modelo.cliente.Cliente;

public class TestArrayList {
	public static void main(String[] args) {
		
		
		//forzando a que solo acepte un tipo de objete, eso se hace con <>
		
		//obligatorio <contenido>   <no obligatorio>
		List<Cuenta> lista = new ArrayList<Cuenta>();
		//List<Cuenta> lista = new LinkedList<Cuenta>();
		//List<Cuenta> lista = new Vector<Cuenta>();
		
		//Referencia            //Objeto se guardan en la memoria HEAP
		Cuenta cc = new CuentaCorriente(11, 22);
		Cuenta cc2 = new CuentaCorriente(13, 42);
		Cuenta cc3 = new CuentaCorriente(11, 22);
		
		//[cc, cc2] son refeencias a los objetos de cuenta corriente
		
		lista.add(cc);
		lista.add(cc2);
		
		//Cliente cliente = new Cliente();
		//lista.add(cliente);
		
		Cuenta obtenerCuenta = lista.get(0);
		System.out.println(obtenerCuenta);
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		//por cada cuenta en la lista, imprime .. 
		for (Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}
		
		boolean contiene = lista.contains(cc3);
		
		//Comparando por referencia
		if(lista.contains(cc3)) {
			System.out.println("Si, es igual con equals");
		}
		
		//comparando por valores
		if(cc.esIgual(cc3)) {
			System.out.println("si, son iguales");
		}
		
	}
}
