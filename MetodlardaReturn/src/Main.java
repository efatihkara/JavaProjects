
public class Main {

    public static int toplam(int a, int b, int c) {
        //System.out.println(a+b+c);

        return (a + b + c);
    }

    public static int ikiilecarp(int a) {
        return a * 2;
    }

    public static int ikiiletopla(int a) {
        return a + 2;
    }

    public static int dortilecarp(int a) {

        return a * 4;// return son çağrılan fonksiyondur return ardında hiç bir kod çalışmayacaktır.
    }

    public static void main(String[] args) {
        System.out.println("Sonuc: " + toplam(1, 2, 3));
        System.out.println("*******************");

        System.out.println("Sonuc: " + dortilecarp(ikiiletopla(ikiilecarp(8))));

    }

}
