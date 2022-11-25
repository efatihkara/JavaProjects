
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
           
        Scanner scanner =new Scanner(System.in);
        int bakiye=1000;
        String islemler="1.Islem: Bakiye Ogrenme\n"
                        +"2.Islem: Para Cekme\n"
                        +"3.Islem: Para Yatirma\n"
                        +"Cikis icin x'e basin";
        
        
        System.out.println("*********************");
        System.out.println(islemler);
        System.out.println("*********************");
    
    
        while (true) {            
            System.out.print("Islemi seciniz: ");
            String islem=scanner.nextLine();
            
            if (islem.equals("x")) {
                
                System.out.println("programdan cikis yapiliyor...");
                
                break;
                
            }
            else if (islem.equals("1")) {
                
                System.out.println("Guncel bakiyeniz: "+bakiye+" TL");
            }
            else if (islem.equals("2")) {
                System.out.print("Cekmek istediginiz tutar: ");
                int miktar=scanner.nextInt();
                scanner.nextLine();
                if (bakiye-miktar<0) {
                    
                    System.out.println("Yeterli bakiyeniz yok. Bakiyeniz: "+bakiye+" TL");
                    
                }
                else
                {
                    bakiye-=miktar;
                    System.out.println("Yeni bakiyeniz: "+bakiye+" TL");
                }
                
                
            }
            else if (islem.equals("3")) {
                System.out.print("Yatirmak istediginiz tutar: ");
                int tutar=scanner.nextInt();
                scanner.nextLine();
                
                bakiye+=tutar;
                System.out.println("Paraniz yatirildi yeni bakiyeniz: "+bakiye+" TL");
            }
          else {
                System.out.println("Gecersiz islem... ");
                
            }
            
        }
    
    }
    
}
