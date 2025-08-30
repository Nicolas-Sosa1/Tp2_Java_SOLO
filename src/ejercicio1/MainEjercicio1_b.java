package ejercicio1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

public class MainEjercicio1_b {

	public static void main(String[] args) {
		
        ArrayList<Empleado> lista = new ArrayList<>(5);

        
        lista.add(new Empleado("20111222","Ana","Gómez",  LocalDate.of(1990,5,12),"Femenino","Belgrano 100","555-1001","ana@mail.com","Vendedora"));
        lista.add(new Empleado("23123456","Bruno","Pérez", LocalDate.of(1988,1,3),"Masculino","San Martín 500","555-1002","bruno@mail.com","Cajero"));
        lista.add(new Empleado("25456789","Carla","Luna",  LocalDate.of(1995,9,21),"Femenino","Sarmiento 250","555-1003","carla@mail.com","RRHH"));
        lista.add(new Empleado("27876543","Diego","Ruiz",  LocalDate.of(1992,3,15),"Masculino","Rivadavia 720","555-1004","diego@mail.com","Supervisor"));
        lista.add(new Empleado("30123456","Erika","Müller",LocalDate.of(1998,11,5),"Femenino","Mitre 80","555-1005","erika@mail.com","Compras"));

        
        Iterator<Empleado> it = lista.iterator();
        while (it.hasNext()) {
            System.out.println(it.next()); 
        }
    }
		

	}


