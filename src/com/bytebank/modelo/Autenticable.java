package src.com.bytebank.modelo;

//todo es abstract
public interface Autenticable {
	
	public void setClave(String clave);
	
	public boolean iniciarSesion(String clave);

	
}