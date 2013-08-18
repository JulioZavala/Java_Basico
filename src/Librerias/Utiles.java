
package Librerias;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;


public class Utiles {
    
    public static Date stringToDate(String fecha){
        
        DateFormat dateFormat = DateFormat.getDateInstance();
        Date date = null;
        
        try {
            date = dateFormat.parse(fecha);
        } catch (ParseException e) {
            System.out.println("ERROR: Formato de fecha incorrecta");
        }
        
        return date;
               
        
        
    }
    
    
    
}
