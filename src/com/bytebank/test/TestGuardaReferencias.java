package com.bytebank.test;

import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaCorriente;
import com.bytebank.modelo.GuardaCuentas;
import com.bytebank.modelo.GuardaReferencias;

public class TestGuardaReferencias {

	public static void main(String[] args) {
		
		GuardaReferencias GuardaReferencias = new GuardaReferencias();
		Cuenta cc = new CuentaCorriente(11, 22);
		GuardaReferencias.adicionar(cc);
		Cuenta cc2 = new CuentaCorriente(22,44);
		GuardaReferencias.adicionar(cc2);
		
		GuardaReferencias.obtener(01);
		System.out.println(GuardaReferencias.obtener(0));
		System.out.println(GuardaReferencias.obtener(1));
		
		
	}
}
