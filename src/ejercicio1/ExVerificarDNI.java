package ejercicio1;

public class ExVerificarDNI extends RuntimeException {
	
	public ExVerificarDNI() {
		
	}

	@Override
	public String getMessage() {
		
		return "Falta tener 8 caracteres y que sean valores numericos";
	}
	
	

}
