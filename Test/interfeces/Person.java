package Test.interfeces;

import javax.swing.ToolTipManager;

public class Person implements NewInterface {
    String name;
    public Person (String name){
        this.name = name;
    }

    public void seyHello(){
        System.out.println("Hello");
    }
    
    
    // @Override
    // public String toString() {
        
    //     return name;
    // }

    
    public void showInfo() {
        System.out.println("Name is " + name);
    }
}
