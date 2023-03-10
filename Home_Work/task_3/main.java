package Home_Work.task_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Notebook>notebook = new ArrayList<>();
        notebook.add(new Notebook(300.50, 8));
        notebook.add(new Notebook(500.60, 12));
        notebook.add(new Notebook(699.0, 16));
        notebook.add(new Notebook(800.50, 24));
        notebook.add(new Notebook(999.9, 32));
        
        for (Notebook notebook2 : notebook) {
            System.out.println("Prise = "+notebook2.getPrise() + "  Run = "+ notebook2.getRan());
           

        }


         // Сортировать по цене
         Collections.sort(notebook, Comparator.comparingDouble(Notebook::getPrise));
         System.out.println("Sorted by price: " + notebook);
 
         // Сортировать по памяти
         Collections.sort(notebook, Comparator.comparingInt(Notebook::getRan));
         System.out.println("Sorted by memory: " + notebook);
 
         // Сортировка по памяти, а затем по цене
         Collections.sort(notebook, Comparator.comparingInt(Notebook::getRan)
                 .thenComparingDouble(Notebook::getPrise));
         System.out.println("Sorted by memory and then by price: " + notebook);
     }
 }

    

