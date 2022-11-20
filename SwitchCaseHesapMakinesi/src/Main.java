
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
       //Switch Case Kullanarak 4 işlem yapan bir hesap makinesi çalışması
        Scanner scanner =new Scanner(System.in);
        System.out.println("**************************");
        String islemler ="1.Toplama  islemi\n"
                        +"2.Cikarma  islemi\n"
                        +"3.Carpma   islemi\n"          
                        +"4.Bolme    islemi";            
        System.out.println(islemler);
        System.out.println("**************************");
       
        System.out.print("Islemi seciniz: ");
        String islem=scanner.nextLine();
        int a;
        int b;
        switch (islem) {
            case "1":
                System.out.print("Birinci Sayi: ");
                 a=scanner.nextInt();
                System.out.print("Ikinci  Sayi: ");
                 b=scanner.nextInt();
                 System.out.println("**************************");
                System.out.println("Toplam: "+"["+(a+b)+"]");
                System.out.println("**************************");
                break;
            case "2":
                System.out.print("Birinci Sayi: ");
                 a=scanner.nextInt();
                System.out.print("Ikinci  Sayi: ");
                 b=scanner.nextInt();
                 System.out.println("**************************");
                System.out.println("Fark: "+"["+(a-b)+"]");
                System.out.println("**************************");
                break;
            case "3":
                System.out.print("Birinci Sayi: ");
                 a=scanner.nextInt();
                System.out.print("Ikinci  Sayi: ");
                 b=scanner.nextInt();
                 System.out.println("**************************");
                System.out.println("Carpim: "+"["+(a*b)+"]");
                System.out.println("**************************");
                break;
            case "4":
                System.out.print("Birinci Sayi: ");
                 a=scanner.nextInt();
                System.out.print("Ikinci  Sayi: ");
                 b=scanner.nextInt();
                 System.out.println("**************************");
                System.out.println("Bolum: "+"["+((double)a/b)+"]");
                System.out.println("**************************");
                break;
               default:
                   System.out.println("Gecersiz secim...");
                   break;
        }
    }
    
}
