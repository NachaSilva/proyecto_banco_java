package com.bytebank.modelo;

public class CuentaCorriente extends Cuenta {
	
	
	public CuentaCorriente(int agencia, int numero) {
		super(agencia, numero); //super accede a los metros de los atributos de la clase padre
	}
	
	@Override 
	//sobreescrito de la clase padre
	public void saca(double valor) throws SaldoInsuficienteException {
		double comision = 0.2;
		super.saca(valor + comision);
	}

	@Override
	public void deposita(double valor) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String toString() {
	    return "CuentaCorriente, " + super.toString();
	}
	
	
}