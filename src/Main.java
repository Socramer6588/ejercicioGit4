
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        //Empleado p = new Empleado("Pepe Pérez", 31, new Date(90, Calendar.FEBRUARY, 1));
        //p.edad = -31; // Arreglado: error de compilación. edad no es accesible

        Empleado p = Empleado.crearEmpleado("Pepe Pérez", 31, LocalDate.of(2020, 1, 8));
        System.out.println(p);

        //p.nombre = "Manolo";
        //p.fechaContratacion = new Date(99, Calendar.FEBRUARY, 1);

        /*
        Ya no se puede pasar una edad negativa: lanzaría una excepción en tiempo de ejecución.

        Empleado p2 = Empleado.crearEmpleado("Pepe Pérez", -31, new Date(90, Calendar.FEBRUARY, 1));
        System.out.println(p2);
         */


        System.out.println("Si quiero mostrar solo el nombre: " + p.getNombre());
        System.out.println("Si quiero mostrar solo la edad: " + p.getEdad());

        /* Para el manejo de fechas, se debe utilizar LocalDate en lugar de Date.
        LocalDate es inmutable y almacena años completos, además de otras muchas mejoras.  */
        System.out.println("Año de contratación: " + p.getFechaContratacion().getYear());

    }
}