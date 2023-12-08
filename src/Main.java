import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        CreaUnaFecha creaUnaFecha = new CreaUnaFecha(2020, 11, 15 );


        creaUnaFecha.revisarFechaIntroducida();
        System.out.println(creaUnaFecha);
        creaUnaFecha.addOneDayToFecha();
        System.out.println(creaUnaFecha);






    }
}