
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author leandro
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        
        // Instante atual
        Date today1 = new Date();
        Date today2 = new Date(System.currentTimeMillis());
        Date today3 = new Date(0L);
        Date today4 = new Date(1000L * 60L * 60L * 5L);
        
        Date date1 = sdf1.parse("25/06/2018");
        Date date2 = sdf2.parse("25/06/2018 15:42:07");
        
        System.out.println("today1: " + sdf2.format(today1));
        System.out.println("today2: " + sdf2.format(today2));
        System.out.println("today3: " + sdf2.format(today3));
        System.out.println("today4: " + sdf2.format(today4));
        System.out.println("date1: " + sdf2.format(date1));
        System.out.println("date2: " + sdf2.format(date2));
        
        // ISO 8601 date
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
        
        Date isoDate = Date.from(Instant.parse("2020-04-01T19:00:00Z"));
        System.out.println("isoDate: " + sdf3.format(isoDate));

    }
    
}
