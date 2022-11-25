
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        
        Scanner scanner =new Scanner(System.in);
        
        int giris_hakki=3;
       
       String sys_users_name="efatihkara";
       String sys_users_pw="197355";
       
       
       
        System.out.println("*******************************");
        System.out.println("Kullanici girisine hosgeldiniz");
        System.out.println("*******************************");
        
        while (true) {
            System.out.print("Kullanici Adi: ");
            String kullaniciadi=scanner.nextLine();
            System.out.print("Kullanici Sifre: ");
            String kullanicipw=scanner.nextLine();
            
            if (kullaniciadi.equals(sys_users_name)&&kullanicipw.equals(sys_users_pw)) 
            {
                System.out.println("Hosgeldiniz: "+kullaniciadi);
                break;
            }
            else if (kullaniciadi.equals(sys_users_name)&&!kullanicipw.equals(sys_users_pw)) 
            {
                System.out.println("Parolaniz Yanlis...!");
                giris_hakki-=1;
                System.out.println("Kalan Hakkiniz: "+"[ "+giris_hakki+" ]");
            }
            else if (!kullaniciadi.equals(sys_users_name)&&kullanicipw.equals(sys_users_pw)) 
            {
                System.out.println("Kullanici Adiniz Yanlis...!");
                giris_hakki-=1;
                System.out.println("Kalan Hakkiniz: "+"[ "+giris_hakki+" ]");
            }
            else{
                System.out.println("Kullanici Adiniz Ve Parolaniz Yanlis.. ");
                giris_hakki-=1;
                System.out.println("Kalan Hakkiniz: "+"[ "+giris_hakki+" ]");
            }
            
            if (giris_hakki==0) 
            {
                System.out.println("Giris hakkiniz bitti");
                break;
            }
            
            
        }
        
    }
    
}
