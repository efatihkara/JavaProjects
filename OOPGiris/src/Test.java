
public class Test {
    public static void main(String[] args) {
        Araba araba1=new Araba(); //referansımız
        
        araba1.renk="Kirmizi";
        araba1.kapilar=2;
        araba1.tekerlekler=4;
        araba1.motor="1.6 TDI";
        araba1.model="Polo";
        
        
        System.out.println(araba1.model+" - "+araba1.motor);
        
    }
    
}
