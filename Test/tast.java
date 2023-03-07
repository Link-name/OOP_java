package Test;

import Home_Work.task_2.game.Cat;
import Sem_Lesson_1.Наследование.Animal;

public class tast {
    public static void main(String[] args) {
        Alimal animal = new Alimal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        of(animal);
        of(dog);
        of(cat);

    }

    public static void of(Alimal animal){
        animal.info();

    }
    
}
