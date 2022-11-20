
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        
        Scanner scanner=new Scanner(System.in);
        System.out.print("Lutfen yasinizi girin: ");
        int yas= scanner.nextInt();
        
        if (yas<18) {
            
            System.out.println("Buraya giris yapamazsiniz...");
        }
        System.out.print("Lutfen bir sayi giriniz: ");
        int sayi= scanner.nextInt();
        
        if (sayi<0) {
            
            System.out.println("---Negatif---");
        }
        else{
            System.out.println("---Pozitif---");
        }
        
        
        
    }
    
}
