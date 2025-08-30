package ejercicio2;

public class EdificioDeOficinas implements IEdificio{
	
	private final double superficie;
	private final int numeroDeOficinas;

	public EdificioDeOficinas(double superficie, int numeroDeOficinas) {
		this.superficie = superficie;
		this.numeroDeOficinas = numeroDeOficinas;
	}

	@Override public double getSuperficieEdificio() { return superficie; }
	public int getNumeroDeOficinas() { return numeroDeOficinas; }

	@Override
	public String toString() {
		return "EdificioDeOficinas{superficie=" + superficie + ", oficinas=" + numeroDeOficinas + "}";
	}

}
