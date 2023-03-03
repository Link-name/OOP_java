package Sem_Lesson_1.Полиморфизм;



public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Animal(String name){
        // this.name = name;
        this(name,10); //вызов конструктора прямо в конструкторе.
    }
    

    // @Override
    // public String toString() {
        
    //     return name;
    // }
    
    
    @Override
    public String toString() {  
        // вывод если перевызываем конструктов через конструктор
        return "Animal{"+
                "name='"+ name + '\'' +
                ", age = " + age + 
                '}';

    }
}
