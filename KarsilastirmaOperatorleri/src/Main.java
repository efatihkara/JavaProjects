
public class Main {
    public static void main(String[] args) {
        /*
        Karşılaştırma operatörleri
        == --> Eşit mi ?
        != --> Eşit Değil mi ?
        > -->  Büyük mü ?
        >= --> Büyük veya Eşit mi ?
        < -->  Küçük mü ?
        <= --> Eşit mi ?
        
        temel mantık olarak  arka planda boolean olarak çalışır
        */
        System.out.println(3==4);//3==3 ise --> true 3==4 ise --> false
        System.out.println(3!=4);//3!=4 ise --> true 3!=3 ise --> false     
        System.out.println(2>3); // 2>1 ise --> true 2>3  ise --> false 
        System.out.println(2>=1);// 2>=1 ise --> true 2>=3  ise --> false
        System.out.println(2<3);//  2<3 ise --> true 2<1  ise --> false
        System.out.println(2<=3);// 2<=3 ise --> true 2<=1  ise --> false
        
        // sadece sayı karşılaştırmasında değil metinleride karşılaştırabiliriz
        
        System.out.println("---- Metin Karsilastirma ----");
        
        System.out.println("Mehmet"== "Mehmet");//sadece eşitlik veya eşit değilmi kullanabiliriz bu durumda
        
    }
    
}
