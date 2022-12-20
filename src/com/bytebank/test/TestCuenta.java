package com.bytebank.test;

import com.bytebank.modelo.CuentaAhorros;

public class TestCuenta {
	public static void main(String[] args) {
		com.bytebank.modelo.CuentaCorriente cc = new com.bytebank.modelo.CuentaCorriente(1, 1);
		CuentaAhorros ca = new CuentaAhorros(2, 3);
		cc.deposita(2000);
		cc.transfiere(1000, ca);
		
		System.out.println(cc.getSaldo());
		System.out.println(ca.getSaldo());
	}
}