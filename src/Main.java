import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Empleado p = new Empleado("Pepe Pérez", new Date(90, Calendar.FEBRUARY, 1));
        System.out.println("Empleado: " + p.nombre + " (nacido en 19" + p.birthDate.getYear() + ")");
    }
}