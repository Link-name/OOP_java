package Home_Work.task_4.hw;

import java.util.ArrayList;
import java.util.List;

public class Box <T extends Fruit> {

    private List<T> fruits = new ArrayList<T>();    
 
    public void add(T fruit) {
        fruits.add(fruit);   
    }

    public double getWeight() {
        double mass = 0;
        for (T t : fruits) {
            mass+= t.getWeight();
            
        }
        return mass;

    }

    public void moveTo(Box<? super T> anotherBox) {
        for (T t : fruits) {
            anotherBox.add(t);
        }
        fruits.clear();

        fruits = new ArrayList<T>();
    /*В Java синтаксис Box<? super T> anotherBox определяет общий тип, параметризованный T,
     где Box - имя класса.
     Ключевое слово super указывает на то, что параметр типа T должен быть суперклассом типа,
    используемого в классе Box.
    Этот синтаксис известен как нижний ограниченный подстановочный знак, что означает,
    что переменная anotherBox может содержать объект Box,
    тип которого либо совпадает с T, либо является суперклассом T.
    Например, если T - Number, то anotherBox может содержать Box<Number>,
    Box<Object> или любой другой класс, который является суперклассом Number.

    Другими словами, использование <? super T> позволяет вам присвоить объект Box<T> переменной Box<? super T>.
    Это полезно, когда вы хотите добавить элементы к объекту Box, .
    потому что вы можете добавить любой объект типа T или его подкласса без нарушения безопасности типов.
    Однако вы не можете получить элементы из объекта Box без их приведения, потому что вы не знаете точный тип объектов в объекте Box.. */    
    }
}