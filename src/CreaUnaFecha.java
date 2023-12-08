import java.util.Calendar;
import java.util.GregorianCalendar;

public class CreaUnaFecha {
    private Calendar fecha;
    private int year;
    private int month;
    private int day;



    public CreaUnaFecha() {
        fecha = new GregorianCalendar();
    }

    public CreaUnaFecha(Calendar fecha) {
        this.fecha = fecha;
    }
    public CreaUnaFecha(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;

        fecha = new GregorianCalendar(year, month, day);
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public void revisarFechaIntroducida(){
        if(month==fecha.get(Calendar.MONTH)&& day==fecha.get(Calendar.DAY_OF_MONTH)){
            System.out.println("La fecha es correcta");
            System.out.println("Recuerda que este metodo solo funciona si no has hecho ninguna modificacion");
        }else if(day!=fecha.get(Calendar.DAY_OF_MONTH)){
            System.out.println("Si introduces un numero que no existe en el presente mes, por ejemplo 31 y el mes no tiene 31 el programa va a continuar con el siguiente mes");
            System.out.println("Recuerda que este metodo solo funciona si no has hecho ninguna modificacion");


        }else{
            System.out.println("Recuerda que los meses en esta clase los meses van de 0 a 11");
            System.out.println("Recuerda que este metodo solo funciona si no has hecho ninguna modificacion");
        }

    }

    public  void addOneDayToFecha(){
        fecha.set(5, fecha.get(Calendar.DAY_OF_MONTH)+1);


    }

    @Override
    public String toString() {
        return "año "  + fecha.get(Calendar.YEAR) + ", mes " + (fecha.get(Calendar.MONTH)+1 )+ ", dia " + fecha.get(Calendar.DAY_OF_MONTH);
    }
}
