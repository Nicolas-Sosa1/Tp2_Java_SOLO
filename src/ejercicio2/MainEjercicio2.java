package ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;


public class MainEjercicio2 {

	public static void main(String[] args) {
		
        ArrayList<IEdificio> lista = new ArrayList<>(5);

        // 3 Polideportivos (nombre, superficie, tipo[1=Techado,2=Aire libre])
        lista.add(new Polideportivo("Poli San Martín", 1200.0, 1));
        lista.add(new Polideportivo("Poli Central",     950.5,  2));
        lista.add(new Polideportivo("Poli Norte",      2000.0,  1));

        // 2 Edificios de oficinas (superficie, cantidad de oficinas)
        lista.add(new EdificioDeOficinas(800.0,  20));
        lista.add(new EdificioDeOficinas(1500.0, 45));

        // Mostrar con Iterator
        System.out.println("Elementos en la colección:");
        Iterator<IEdificio> it = lista.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
		
	}

}
