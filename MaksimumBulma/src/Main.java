
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //kullanıcıdan alınan 3 sayının en büyük olanını bulma
        Scanner scanner=new Scanner(System.in);
        
        System.out.print("Birinci Sayi: ");
        int a=scanner.nextInt();
        System.out.print("Ikinci Sayi: ");
        int b=scanner.nextInt();
        System.out.print("Ucuncu sayi Sayi: ");
        int c=scanner.nextInt();
        
        int maks=-1;
        
        if (a>=b&&a>=c) {
            maks=a;
            
        }
        else if (b>=a&&b>=c) 
        {
            maks=b;
            
        }
        else
        {
            maks=c;
        }
        System.out.println("En buyuk sayi: "+maks);
    }
}
