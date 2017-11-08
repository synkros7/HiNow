package examples.HiNow;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Hello world!
 *
 */
public class App 
{
	public static String dameLaHora() {
		Calendar calendario = new GregorianCalendar();
        int  hora, minutos, segundos;
        
        String ahora;
        
        hora     = calendario.get(Calendar.HOUR_OF_DAY);
        minutos  = calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND);
        
        ahora = hora + ":" + minutos + ":" + segundos + " (hh:mm:ss)";
        return ahora;
	}

	public static void main( String[] args )
    {
        System.out.println( "Hi everyone!" );
        
        System.out.println("       Son las "+ dameLaHora() + ".... Bye bye.");
    }
}
