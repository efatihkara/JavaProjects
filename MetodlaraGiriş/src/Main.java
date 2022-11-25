
import java.util.Scanner;


public class Main 
{
    public static void greeting ()
    
    {
        System.out.println("Merhaba nasilsiniz.. ");
        System.out.println("*************");
        
    }
    
    public static void fact()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int sayi=scanner.nextInt();
        int faktoriyel=1,sayi2;
        sayi2=sayi;
        while (sayi>0) 
        {
        faktoriyel*=sayi;
        
        sayi-=1;
        
        
        }
        System.out.println(sayi2+" ! "+"Faktoriyel: "+faktoriyel);
    }
    
    public static void main(String[] args) 
    {
   
        fact();
     //   greeting();
        
    }
    
}
