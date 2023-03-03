package Sem_Lesson_1.Наследование;
public class Ex_sem_1 {
    public static void main(String[] args) {
        Animal animal1 = new Animal("animal name");
        Animal animal2 = new Animal("animal name", 45 );
        
        Cat cat = new Cat("cat name");
        dog dog = new dog("dog name");
        System.out.println(cat);
        System.out.println(dog);
        System.out.println(animal1);
        System.out.println(animal2);
    }
   
}
