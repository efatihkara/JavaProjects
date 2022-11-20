
public class Main {
    
    public static void main(String[] args) {
        String a="Fatih";
        System.out.println(a+" Kara Geldi la");
        
        
        String b="dedi";
        String c="naber";
        String toplam=a+ b+ c;
        System.out.println("Sonuc:  "+toplam);
        
        String x=" Merhaba "+" Java "+" Ders "+" Kodlari ";
        System.out.println(x);
        
        String y="Merhaba\tJava\tDers\tKodlari";// 4 birim boşluk için \t kullanıyoruz
        System.out.println(y);
        
        String z="Merhaba\nJava\nDers\nKodlari";// alt satıra geçiş için \n kullanıyoruz
        System.out.println(z);
        
    }
}
