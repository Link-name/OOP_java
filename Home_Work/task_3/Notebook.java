package Home_Work.task_3;



public class Notebook   {
    private double price;
    private int ram;



    public Notebook(double price,int rum){
        this.price = price;
        this.ram = ram;

    }


    public double getPrise(){
        return price;
    }


    public int getRan(){
        return ram;
    }


    @Override
    public String toString() {
        return "Notebook(price=" + price + ", ram=" + ram + ")";
    }


    // @Override
    // public int compareTo(Notebook other) {
    //     return Double.compare(this.price, other.price);
    // }


}


