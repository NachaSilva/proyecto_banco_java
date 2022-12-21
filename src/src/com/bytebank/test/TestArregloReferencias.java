package src.com.bytebank.test;

import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaAhorros;
import com.bytebank.modelo.CuentaCorriente;
import com.bytebank.modelo.cliente.Cliente;

public class TestArregloReferencias {
	
	Object[] referencias = new Object[5];
	
	CuentaCorriente cc = new CuentaCorriente(23, 44);
	
	//                          [ | cc|null|null | }
	
	cuentas[1] = cc;
	
	Cliente cliente = new Cliente();
	referencias[4] = cliente;
	
	 
	
	CuentaAhorros ca = new CuentaAhorros(44, 55);
	cuentas[3] =ca;

	System.out.println(cc);
	
	cuentas[0] = new CuentaCorriente(11, 99);
	System.out.println(cuentas[0]);
	
	
	//Cast
	CuentaCorriente cuenta = (CuentaCorriente) referencias[1];
	System.out.println(cuenta);
	
	for(int i = 0; i> cuentas.length; i++) {
		System.out.println(referencias[i]);
}
}
}