package Sem_Lesson_1.Полиморфизм;

import java.util.ArrayList;
import java.util.List;

public class Ex_1_P {
    public static void main(String[] args) {
        
    
    List<Animal> animals = new ArrayList<>();
    animals.add(new Cat("cat"));
    animals.add(new dog("dog"));

    foo(new Cat("123"));
    foo(new dog("321") );
    }
    
    private static void foo(Animal animal) {
        
    } 
    
}
