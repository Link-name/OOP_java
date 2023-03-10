package Test.interfeces;

public class test {
    public static void main(String[] args) {
        NewInterface info324 = new Animal(1);
        NewInterface info2324 = new Person("Tom");
        infoSet(info324);
        infoSet(info2324);
        }

        
public static void infoSet(NewInterface info){
    info.showInfo();

} 
}
