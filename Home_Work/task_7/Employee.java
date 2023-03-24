package Home_Work.task_7;

public class Employee {
    String name;
    String last_name;
    String department_name;
    double lasary;
    
    
    public Employee(String name, String last_name, String department_name, double lasary){
        this.name = name;
        this.last_name = last_name;
        this.department_name = department_name;
        this.lasary = lasary;

    }

 
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if ((obj == null) || getClass() != obj.getClass()) return false;

        Employee that = (Employee) obj;
        //сравниваю содержание поля 
        // if(!name.equals(that.name) || !last_name.equals(that.last_name)) return false;   
        // if(!name.equals(that.last_name)) return false;
        // сравниваются ссылки  
        // if (name != that.name) return false;
        // if (last_name != that.last_name) return false;

        return (name.equals(that.name) && last_name.equals(that.last_name));
    }


    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (last_name != null ? last_name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString(){
        return  ( "name : "+ name  +
        " last_name : " + last_name  +
        " department_name : " + department_name  +
        " lasary: " + lasary);

    }
    // @Override
    // public int hashCode() {
    //     int result = name == null ? 0 :name.hashCode() ;
    //     result = 31 * result + name.hashCode();
    //     result = 31 * result + last_name.hashCode();
    //     return result;
    // }




}

