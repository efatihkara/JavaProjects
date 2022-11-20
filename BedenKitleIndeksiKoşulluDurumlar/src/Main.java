
import java.util.Scanner;
/*kullanıcıdan alınan boy ve kilo değerlerine göre beden kitle indeksi hepsalyin ve şu kurallara
göre
BKİ 18.5'un altındaysa ---->Zayif
BKİ 18.5'ile 25 arasındaysa ---->normal
BKİ 25 ile 30 arasındaysa ---->Fazla kilolu
BKİ 30'un üstündeyse ---->obez
*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Kilonuz: ");
        int kilo=scanner.nextInt();
        System.out.print("Boy (Ornek: 1,72): ");
        double boy=scanner.nextDouble();
        
        double bki=(kilo/(boy*boy));
        
        if (bki<18.5) {
            System.out.println("Zayif");
        }
        else if (bki>18.5&&bki<25) {
            System.out.println("Normal");
        }
        else if (bki>25 && bki<30) {
            System.out.println("Fazla Kilolu");
        }
        else    
        {
            System.out.println("Obez");
        }
        
    }
}
