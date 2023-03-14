package Test.NumberStorage;

import java.util.ArrayList;
import java.util.List;

public class NumberStireg<T extends Number> {
   private List<T> numbers = new ArrayList<>();
   public void add(T number){
    numbers.add(number);
   }
    

   public int sum(){
    int sum = 0;
    for (T t : numbers) {
        sum+=t.intValue();
    } 
    return sum;
   }

   public static <T extends Number> T foo(T number){
    return number;


   }

   
}
