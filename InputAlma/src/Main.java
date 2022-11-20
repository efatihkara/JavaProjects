
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
                /*integer input alma */
        Scanner scanner =new Scanner(System.in);
        
        System.out.println("Lutfen Yasinizi girin: ");
        
        int yas=scanner.nextInt();
    
        System.out.println("Yasiniz: "+yas);
               /* Double input alma*/
        
       System.out.println("Lutfen Sayi Giriniz: ");
        
        double sayi=scanner.nextDouble();  
    
        System.out.println("Sayi: "+sayi);
                /* String İnput Alma */
         Scanner scanner1= new Scanner(System.in);
         System.out.println("Lutfen bir yazi giriniz: ");
         String  yazi = scanner1.nextLine();
         
           System.out.println("Yaziniz: "+yazi);  
           
           
           //koşullu scanner
           
           
           Scanner scanner2 =new Scanner(System.in);
            System.out.println("Lutfen Sayi Giriniz: "); 
           if (scanner2.hasNextInt()) {
            int sayi2=scanner.nextInt();
              
            System.out.println("Sayi: "+sayi2);
        }
           else
           {
               System.out.println("Lutfen bir sayi giriniz...!");
           }
        
    }
    
}
