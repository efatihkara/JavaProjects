
import java.util.Scanner;

public class Main {

    public static int cikarma(int a, int b) {
        return (a - b);
    }

    public static double bölme(int a, int b) {
        return ((double) a / b);
    }

    public static int toplama(int a, int b) {
        return a + b;
    }

    public static int toplama(int a, int b, int c) {
        return (a + b + c);
    }

    public static int carpma(int a, int b) {
        return a * b;
    }

    public static int carpma(int a, int b, int c) {
        return a * b * c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("**************************");
        String islemler = "1.Toplama  islemi\n"
                + "2.Cikarma  islemi\n"
                + "3.Carpma   islemi\n"
                + "4.Bolme    islemi\n"
                + "Cikis icin f'ye basin";
        System.out.println("**************************");
        System.out.println(islemler);
        System.out.println("**************************");

        while (true) {
            System.out.println("Islemi seciniz: ");
            String islem = scanner.nextLine();

            if (islem.equals("f")) {
                System.out.println("Sistemden cikiliyor..!");
                break;
            } else if (islem.equals("1")) {
                System.out.print("Kac deger toplayacaksiniz? (2 veya 3): ");
                int kacsayi = scanner.nextInt();

                if (kacsayi == 2) {
                    System.out.print("a: ");
                    int a = scanner.nextInt();
                    System.out.print("b: ");
                    int b = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Sayilarin toplamlari: " +"["+ toplama(a, b)+"]");
                } else if (kacsayi == 3) {
                    System.out.print("a: ");
                    int a = scanner.nextInt();
                    System.out.print("b: ");
                    int b = scanner.nextInt();
                    System.out.print("c: ");
                    int c = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Sayilarin toplamlari: " +"["+ toplama(a, b, c)+"]");
                } else {
                    System.out.println("Bunun icin uygun metod bulunmuyor");
                    break;
                }

            } else if (islem.equals("2")) {
                System.out.print("a: ");
                int a = scanner.nextInt();
                System.out.print("b: ");
                int b = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Sayilarin Farki: " +"["+ cikarma(a, b)+"]");
            } else if (islem.equals("3")) {
                System.out.print("Kac deger carpacaksiniz? (2 veya 3): ");
                int kacsayi = scanner.nextInt();

                if (kacsayi == 2) {
                    System.out.print("a: ");
                    int a = scanner.nextInt();
                    System.out.print("b: ");
                    int b = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Sayilarin Carpimi: " +"["+ carpma(a, b)+"]");
                } else if (kacsayi == 3) {
                    System.out.print("a: ");
                    int a = scanner.nextInt();
                    System.out.print("b: ");
                    int b = scanner.nextInt();
                    System.out.print("c: ");
                    int c = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Sayilarin Carpimi: " +"["+ carpma(a, b, c)+"]");
                } else {
                    System.out.println("Bunun icin uygun metod bulunmuyor");
                    break;
                }

            } else if (islem.equals("4")) {

                System.out.print("a: ");
                int a = scanner.nextInt();
                System.out.print("b: ");
                int b = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Sayilarin Bolumu: " +"["+ bölme(a, b)+"]");
            }
            else{
                System.out.println("Gecersiz islem...");
            }

        }

    }

}
