
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner=new  Scanner(System.in);
        
        int yas=scanner.nextInt();
        scanner.nextLine();// alınan yas değerini sıfırlayıp isim değerini kullanmamızı sağlıyacaktır.
        //dummy taktiği denir buna
        String isim=scanner.nextLine();
        System.out.println("Yas  : "+yas);
        System.out.println("Isim: "+isim);
        
        Scanner scanner1=new Scanner(System.in);
        int yas1=scanner1.nextInt();
        int yas2=scanner1.nextInt();
        int yas3=scanner1.nextInt();
        
        System.out.println("yas1: " + yas1 + " yas2: " + yas2 + " yas3: "+yas3);
    }
    
}
