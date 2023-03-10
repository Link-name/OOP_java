package Test.Polimorfizm;

import Home_Work.task_2.game.StandardParticipant;

public class test {
    public static void main(String[] args) {
        // Animal animal = new Dog();// Расматриваем собаку как животное и имеем методы животного
        // animal.eat();
        // // animal.dark(); нет методов собачьих
        // Dog dog = new Dog(); // Расматриваем собаку как собаку и методы имеются и собки и родительские
        // dog.eat();
        // dog.dark();
        
        Dog dog = new Dog();

        Cat cat = new Cat();
        Animal animal = new Dog();
        Animal animal2 = new Animal();
        
        newTest(cat);
        newTest(dog);
        newTest(animal);
        newTest(animal2);

        
    }


    public static void newTest(Animal a){
        a.eat();

    } 
}
