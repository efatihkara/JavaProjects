
public class Main {
    public static boolean asalmi(int sayi){
        
        for (int i = 2; i < sayi; i++) 
        {
            if(sayi%i==0) // sayi 4 olarak girildiğinde for döngüsünde 2 den 4 de kadar olan sayıların bölümü yapılıyor ve asal olup olmadığını kontrol ediyoruz
            {
                return false;
            }
        }
    return true;
    }
    
    public static void main(String[] args) 
    
    {
        
        for (int i = 2; i < 1000; i++) {
            if(asalmi(i))
            {
                System.out.println(i);
            }
            
        }
        
    }

}
