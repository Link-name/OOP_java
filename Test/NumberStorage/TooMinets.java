package Test.NumberStorage;

import java.lang.ProcessBuilder.Redirect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TooMinets {
    public static void main(String[] args) {
    NumberStireg <Double> itegerNumberStireg = new NumberStireg<>();

    itegerNumberStireg.add(12.2);
    itegerNumberStireg.add(14.2);
    itegerNumberStireg.add(12.5);
    System.out.println(itegerNumberStireg.sum());
        

        List <Long> intt = new ArrayList<>();
        Comparator <Object> comparator = null; 
        Collections.sort(intt, comparator);

       
    }
    public static <T> void migrate(List <T> sourse , List <T> target ){ //из приводится к типу target
        // sourse -> target
    }
 

    public static <T extends Number> T foo(T number ){return number;} // приводит к типу number

   
    
}
