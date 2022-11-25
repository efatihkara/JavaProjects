
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        /*
        1634 dört basamaklı sayının koşulu sağlaması için her sayının basamak değeri kadar kuvveti alınıp toplamına eşit olması gerektir
        1634=1^4+6^4+3^4+4^4 (buradaki 4 basamak sayısı)
        */
        
        Scanner scanner=new Scanner(System.in);
        System.out.print("Sayiyi Giriniz: ");
        int sayi=scanner.nextInt();
        System.out.print("Basamak Sayisi: ");
        int basamak_sayisi =scanner.nextInt();
        int gecici_sayi=sayi;
        int toplam=0;
        
        do {
            int basamak_degeri=gecici_sayi%10;
            gecici_sayi/=10;
            
            toplam+=Math.pow(basamak_degeri, basamak_sayisi);
            
        } while (gecici_sayi>0);
        
        if (sayi==toplam) {
            System.out.println("bu sayi bir armstrong sayisidir..");
            
        }
        else
        {
            System.out.println("armstrong bir sayi degildir..");
        }
    }
    
}
