package Test.interfeces;

public class Animal implements NewInterface {
    public int id;

public Animal(int id){
    this.id = id;

} 

    public void sleep(){
        System.out.println("Animal sleep");

    }

    public void showInfo(){
        System.out.println("Id is " + id);
    }    
    
}
