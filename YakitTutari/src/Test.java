
import java.util.Scanner;


public class Test {
    /*bir aracın kilometre başı ne kadar yaktığını ve 
    kaç kilometre yol yaptığı bilgilerini alın ve sürücünün toplam ne kadar ödeme yaptığunı hesaplayın */
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Aracini kilometrede kac kurus yakiyor? (Ornek : 0,32 ): ");
        double kurus =scanner.nextDouble();
        System.out.print("Aracinizla kac km gittiniz ?: ");
        int km=scanner.nextInt();
        
        System.out.println("Toplam odemeniz gereken tutar:"+(kurus*km)+" tl dir..." );
    }
}
