package Sem_Lesson_1.Инкапсуляция;

public class mi_class {
    private String User;

    public void rename(String newUsername ){
        if(newUsername != null && !newUsername.isBlank()) // не пусто возвращает try если из пробелов false
        User = newUsername.trim();
    }

   @Override    
   public String toString(){
    return User;

   }
}
