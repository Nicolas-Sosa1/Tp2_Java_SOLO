TRABAJO PRÁCTICO N°2
EJERCICIO 1
A. Crear un paquete llamado ejercicio1. Copiar en él las clases Persona y
Empleado del TP N°1.

B. Crear una excepción llamada ExVerificarDNI que extienda de
RuntimeException.

C. En la clase Persona, crear un método estático llamado exVerificarDNI.
• Este método recibirá un String dni.
• Verificará que el DNI contenga exactamente 8 caracteres numéricos.
• En caso contrario, lanzará la excepción ExVerificarDNI.

D. Crear una clase llamada MainEjercicio1_a.
• Crear una Persona con el DNI "AA202020" y validar el DNI con
exVerificarDNI.

• Crear otra Persona con el DNI "20202020" y validar nuevamente.
• Utilizar try-catch:
o Si el DNI es válido → mostrar el mensaje: "Persona agregada
correctamente".
o Si el DNI es inválido → mostrar el mensaje: "Persona no
agregada por no verificar el DNI".

E. Crear una clase llamada MainEjercicio1_b.
• Crear 5 Empleado y guardarlos dentro de un ArrayList.
• Mostrar la información de cada empleado utilizando un Iterator.

F. Crear una clase llamada MainEjercicio1_c.
• Crear 5 Empleado y guardarlos dentro de un TreeSet.
• Mostrar la información utilizando un Iterator.
• Nota: Para que TreeSet funcione correctamente, la clase Empleado
debe implementar Comparable o proporcionar un Comparator.
G. Crear una clase llamada MainEjercicio1_d.
• Crear 5 Persona y guardarlas dentro de un HashSet.
• Mostrar la información utilizando un Iterator.
• Nota: Para que HashSet detecte duplicados, las clases Persona y
Empleado deben sobrescribir correctamente equals() y hashCode().

EJERCICIO 2
Crear un paquete llamado Ejercicio2, dentro de él realizar lo siguiente:
Se plantea desarrollar un programa Java que permita representar la siguiente
situación.
• Una instalación deportiva es un recinto delimitado donde se practican
deportes, en Java interesa disponer de un método int getTipoDeInstalacion().
• Un edificio es una construcción cubierta y en Java interesa disponer de
un método double getSuperficieEdificio().
• Un polideportivo es al mismo tiempo una instalación deportiva y un
edificio; en Java interesa conocer la superficie que tiene y el nombre que tiene.
• Un edificio de oficinas es un edificio; en Java interesa conocer el número
de oficinas que tiene.

1. Crear una clase llamada mainEjercicio2, con el método main. Dentro del
mismo crear un ArrayList que contenga tres polideportivos y dos edificios de
oficinas y utilizando un iterator, recorrer la colección y mostrar los atributos de
cada elemento. 
