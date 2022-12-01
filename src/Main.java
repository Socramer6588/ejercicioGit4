import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Empleado p = new Empleado("Pepe Pérez", 31, new Date(90, Calendar.FEBRUARY, 1));
        System.out.println(p);


        p.nombre = "Manolo"; // Cambio de nombre. No se debe permitir
        p.fechaContratacion = new Date(99, Calendar.FEBRUARY, 1); // Cambio de fecha. No se debe permitir
    }
}