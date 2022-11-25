
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        
        System.out.println("Bankamiza hosgeldiniz. Faiz Orani %6");
        
        int anapara,vade;
        
        System.out.print("Yatirmak istediginiz tutar: ");
        anapara=scanner.nextInt();
        System.out.println("Paranizi kac yil vadeli yatirmak istiyorsunuz ?");
        vade=scanner.nextInt();
        
        
        double toplampara=anapara;
        
        double faizOrani=0.06;
        
        for (int i = 1; i <=vade; i++) 
        {
        toplampara=(toplampara*faizOrani)+toplampara; 
        
            System.out.println(i+".yilin sonunda toplam para : "+(int)toplampara+" TL" );
        
        }
        
        
        
    }
    
}
