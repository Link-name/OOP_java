package Home_Work.task_7;

public class main {
    public static void main(String[] args) {
        Employee employee = new Employee("Max", "Fedorov", "OOO", 20000.50);
        Employee employee1 = new Employee("Max", "Invin", "CPP", 20000.50);
        Employee employee2 = new Employee("Dima", "Fedorov", "CPP", 20000.50);
        Employee employee4 = new Employee("Max", "Fedorov", "CPP", 20000.50);
        Employee employee5 = new Employee("Nikita", "Fedorov", "CPP", 20000.50);
        Employee employee6 = new Employee("Max", "Fedorov", "CPP", 20000.50);

        System.out.println(employee.toString());
        System.out.println(employee1.toString());
        System.out.println(employee4.equals(employee1));
        System.out.println(employee.hashCode());
        System.out.println(employee1.hashCode());
        

        System.out.println(employee2.equals(employee));
        System.out.println(employee.hashCode());
        System.out.println(employee2.hashCode());
        System.out.println(employee.equals(employee4));
        System.out.println(employee.hashCode());
        System.out.println(employee4.hashCode());


        System.out.println(employee.toString()+"\n" + 
                        employee2.toString()+
                        "\n"+ "Результат сравнения: " + employee.equals(employee2) + "\n");

        System.out.println(employee.toString()+"\n"+
                        employee6.toString() + "\n"+
                        "Результат сравнения: "+ employee.equals(employee6) + "\n");
    }


}
