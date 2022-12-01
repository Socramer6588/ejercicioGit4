import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        //Empleado p = new Empleado("Pepe Pérez", 31, new Date(90, Calendar.FEBRUARY, 1));
        //p.edad = -31; // Arreglado: error de compilación. edad no es accesible

        Empleado p = Empleado.crearEmpleado("Pepe Pérez", 31, new Date(90, Calendar.FEBRUARY, 1));
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

        /* Aunque la variable fechaContratación es inmutable (final), su tipo (Date) es mutable, de modo que
        todavía podría modificarse así: */
        p.getFechaContratacion().setYear(10);

        /* Además, Date es una clase de la primera versión de Java que solo almacena dos dígitos para años, de modo
        que al ponerle el año 10 pensando en 2010, nos encontraremos que no sabemos si se refiere a 1910. */
        System.out.println("Nueva fecha de contratación: " + p.getFechaContratacion().getYear());

    }
}