package Test.testAdept;

public class tesrtAd {
    public static void main(String[] args) {
        AmericaSocket socet = new SimplAmericaSocket();
        Radio radio = new Radio();
        evroSocket evroSocket = new socketAdept(socet); 
        
        radio.ListeMisic(evroSocket);

    }
}  

 interface evroSocket {
    void getPower();
}

interface AmericaSocket {
    void getPower();
        

}


class socketAdept implements evroSocket{
    AmericaSocket americaSocket;
    public socketAdept( AmericaSocket americaSocket){
        this.americaSocket = americaSocket;
    }
    @Override
    public void getPower() {
        
        
    }

}

class SimplAmericaSocket implements AmericaSocket  {

 @Override
public void getPower() {
    System.out.println("Подключить радио");
     
 }
    
}

 class Radio{
    public void ListeMisic(evroSocket socket){
        socket.getPower();

    } 

}




