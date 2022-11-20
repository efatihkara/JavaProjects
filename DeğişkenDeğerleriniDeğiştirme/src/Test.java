
import java.util.Scanner;


public class Test {
    public static void main(String[] args) {
        //kullanıcıdan Aldığınız iki sayının değerlerini değiştirin.
        
        Scanner scanner = new Scanner(System.in);
        int first_number;
        int second_number;
        
        System.out.print("Birinci Sayi: ");
        first_number=scanner.nextInt();
        
        System.out.print("Ikinci  Sayi: ");
        second_number=scanner.nextInt();
        
        
        int gecici=first_number;
        first_number=second_number;
        second_number=gecici;
        
        System.out.println("son hali -ilk sayi: "+ first_number +" son hali -ikinci sayi: "+ second_number );
        
    }
    
}
