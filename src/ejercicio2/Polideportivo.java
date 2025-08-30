package ejercicio2;

public class Polideportivo implements IInstalacionDeportiva, IEdificio{
	
	private final String nombre;
	private final double superficie;
	private final int tipoDeInstalacion;

	public Polideportivo(String nombre, double superficie, int tipoDeInstalacion) {
		this.nombre = nombre;
		this.superficie = superficie;
		this.tipoDeInstalacion = tipoDeInstalacion;
	}

	@Override public int getTipoDeInstalacion() { return tipoDeInstalacion; }
	@Override public double getSuperficieEdificio() { return superficie; }

	@Override
	public String toString() {
		String tipoTxt = (tipoDeInstalacion == 1 ? "Techado" : "Aire libre");
		return "Polideportivo{nombre=" + nombre + ", superficie=" + superficie + ", tipo=" + tipoTxt + "}";
	}
	

}
