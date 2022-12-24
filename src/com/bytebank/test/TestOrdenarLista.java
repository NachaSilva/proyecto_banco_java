package com.bytebank.test;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaAhorros;
import com.bytebank.modelo.CuentaCorriente;

public class TestOrdenarLista {
	
	public static void main(String[] args) {
		
		Cuenta cc1 = new CuentaCorriente(22, 33);
		cc1.deposita(333.0);

		Cuenta cc2 = new CuentaAhorros(22, 44);
		cc2.deposita(444.0);

		Cuenta cc3 = new CuentaCorriente(22, 11);
		cc3.deposita(111.0);

		Cuenta cc4 = new CuentaAhorros(22, 22);
		cc4.deposita(222.0);

		List<Cuenta> lista = new ArrayList<>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);
		
		System.out.println("Antes de Ordenar");
		for(Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}
		
		
		//Ordenar las cuentas
		//   Cualquier clase hija de Cuenta
		// cualquier cosa que extienda de cuenta
		
		Comparator<Cuenta> comparator = new OrdenadorPorNumeroCuenta();
		lista.sort(comparator);
		
		System.out.println("Despues de Ordenar");
		for(Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}
		
		Comparator<Cuenta> ordenadorPorNombreTitular = new OrdenadorPorNombreTitular();
		lista.sort(comparator);
		
		System.out.println("Despues de nombre titular");
		for(Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}
	}
}

class OrdenadorPorNumeroCuenta implements Comparator<Cuenta> {

	@Override
	public int compare(Cuenta o1, Cuenta o2) {
		//forma basica
		//if (o1.getNumero() == o2.getNumero()) {
		//	return 0;
		//} else if(o1.getNumero() > o2.getNumero()) {
		//	return 1;
		//} else
		//return -1;
		
		//Forma Intermedia
		//return 01.getNumero() - 02.getNumero();
		
		//Forma avanzada usando wrapper
		return Integer.compare(o1.getNumero(), o2.getNumero());
	}
	
}

class OrdenadorPorNombreTitular implements Comparator<Cuenta> {

	@Override
	public int compare(Cuenta o1, Cuenta o2) {
		return o1.getTitular().getNombre().compareTo(o2.getTitular().getNombre());
		
	}
	
	//Collections.sort(List, OrdenadorPorNombreTitular);
	
}

