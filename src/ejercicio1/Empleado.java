package ejercicio1;

import java.time.LocalDate;

public class Empleado extends Persona implements Comparable <Empleado> {

	private final int legajo;
	private String puesto;
	private static int cont= 1000;
	
	
	//metodos
    public static int devuelveProximoLegajo() {
    	return cont;
    }
	
	
	//constructores
	
	public Empleado() {
		super();
		this.puesto = "No hay puesto";
		this.legajo= cont;
		cont++;
		
	}
	
	public Empleado(String dni, String nombre, String apellido, LocalDate fechaNacimiento, String genero, String direccion, String telefono, String email, String puesto) {
		
		super(dni, nombre, apellido, fechaNacimiento, genero, direccion, telefono, email);
		this.puesto = puesto;
		this.legajo = cont;
		cont++;
	}

	//getters and setters

	public int getLegajo() {
		return legajo;
	}


	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	//metodo toString()
	
	@Override
	public String toString() {
		return super.toString() + "Es Empleado, Su Puesto: " + puesto + " Su legajo: "+ legajo;
	}

	
	//COMPARADOR

	@Override
	public int compareTo(Empleado o) {
		return this.getDni().compareTo(o.getDni());
	}
	
	
	
	
}
