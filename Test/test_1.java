package Test;

import java.security.Principal;

public class test_1 {
    public static void main(String[] args) {
        Mains Mynamev = new Mains("макс");
        System.out.println(Mynamev);
        
    }  
}

class Mains {
    int age ;
    String nume;

    public void nume(String mynume){
        nume = mynume;
        System.out.println(nume);
    }

    public Mains(){
        System.out.println("ХЕЕЕЕЕЕЕ");
    }

    public Mains(String nume){
        this.nume = nume;
    }

    @Override
    public String toString() {
        
        return nume;
    }
}