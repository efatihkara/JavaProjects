
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        /*
        for (baslatma ; kosul ; artırma veya azaltma islemleri)
        {
        Döngü koşulu doğru olduğu sürece burası çalışacak
        }
        */
   
    
    int i;// döngü dışında değişken
    
        for ( i = 0; i < 5; i++) 
        {
            System.out.println("i = "+ i );
        }
    
        System.out.print("**********************\n");
       
        for (int j = 0; j < 10; j++)//döngü içinde oluşan değişken
        {
            System.out.println("j = "+ j);
        }
        System.out.print("**********************\n");
        for (int j = 10; j > 0; j--)
        {
            System.out.println("j = "+ j);
        }
        
        int a=0;
        int b=10;
        System.out.print("**********************\n");
        for(;a<10&&b>0;a++,b--)
        {
            System.out.println("a = "+a+" * "+" b = "+b);
            
        }
        System.out.print("**********************\n");
        for (int j = 2; j < 100; j*=2) 
        {
            System.out.println("j= "+j);    
        }
        
        //kullanıcıdan alınan sayının faktöreyelini hesaplama
        
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("Bir sayi giriniz: ");
        
        int fakt=1;
        
        int sayi=scanner.nextInt();
        
        for (int k = 1; k <= sayi; k++) 
        {
           fakt*=k;
           System.out.println("Faktoriyel= "+fakt+ " k = "+ k );
        }
        System.out.println("Faktoriyel= "+fakt);
        
        
        
        
        
        
        
        
        
        
    
    }
    
}
