
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
       int i=10;
        while (i<100) 
        {            
            System.out.println("i= "+i); 
            i+=3;
        }
        System.out.print("*******************");
        System.out.println("");
        //while ile faktöriyel bulma
        Scanner okuma=new  Scanner(System.in);
        System.out.print("Bir sayi giriniz; ");
        int sayi=okuma.nextInt();
        int fakt=1;
        while(sayi>0)
        {
            fakt*=sayi;
            sayi--;
            
        }
        System.out.println("Faktoriyel= "+fakt);
        
        System.out.print("*******************");
        System.out.println("");
        
        //sonsuz döngü
        
        int k=0;
        while(k<10)
        {
            System.out.println("k = "+k);
           // k--; yapıldığı durumda ve herhangi bir azaltma olmadığı durumdada sonsuz döngü olacaktır.
        }
        
    }
    
}
