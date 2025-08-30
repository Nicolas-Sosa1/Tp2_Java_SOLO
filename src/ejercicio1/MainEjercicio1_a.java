package ejercicio1;

import java.time.LocalDate;

public class MainEjercicio1_a {

	public static void main(String[] args) {
		
		Persona p1 = new Persona("AA202020", "Carlos", "Martínez", LocalDate.of(1992, 3, 15), "Masculino", "San Martín 500", "555-9012", "carlos@mail.com");
	
		 // Validación p1
        try {
            Persona.exVerificarDNI(p1.getDni());
            System.out.println("Persona agregada correctamente");
        } catch (ExVerificarDNI e) {
            System.out.println("Persona no agregada por no verificar el DNI");
        }
        
        
        Persona p2 = new Persona("20202020", "Ana", "Gómez", LocalDate.of(1995, 7, 22), "Femenino", "Belgrano 100", "555-1234", "ana@mail.com");

        // Validación p2
        try {
            Persona.exVerificarDNI(p2.getDni());
            System.out.println("Persona agregada correctamente");
        } catch (ExVerificarDNI e) {
            System.out.println("Persona no agregada por no verificar el DNI");
        }

	}

}
