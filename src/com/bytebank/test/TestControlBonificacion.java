package com.bytebank.test;

// * Es que importe todo
import com.bytebank.modelo.Contador;
import com.bytebank.modelo.ControlBonificacion;
import com.bytebank.modelo.Funcionario;

public class TestControlBonificacion {
	public static void main(String[] args) {
		Funcionario diego = new Contador();
		diego.setSalario(2000);
		
		com.bytebank.modelo.Gerente jimena = new com.bytebank.modelo.Gerente();
		jimena.setSalario(10000);
		
		Contador alexis = new Contador();
		alexis.setSalario(5000);
		
		ControlBonificacion controlBonificacion = new ControlBonificacion();
		
		controlBonificacion.registrarSalario(diego);
		controlBonificacion.registrarSalario(jimena);
		controlBonificacion.registrarSalario(alexis);
	}
}