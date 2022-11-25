
public class Main 
{
    /* public static void toplama(String a,String b)
     {
         System.out.println(a+" -- "+b);
     }
     public static void toplama(int a,int b)
     {
         System.out.println("toplamlari: "+(a+b));
     }
    public static void toplama(int a,int b,int c)
    {
        System.out.println("toplam: "+ (a+b+c));
    }
    
    */
    
    public static void skorhesapla(String isim,int puan)
    {
        System.out.println(isim+" adli oyuncunun "+puan+" puani var");
        System.out.println("*******************");
    }
    public static void skorhesapla(int puan)
    {
        System.out.println("Isimsiz oyuncunun "+puan+" puani var");
        System.out.println("*******************");
    }
    public static void skorhesapla(String isim)
    {
        System.out.println(isim+" adli oyuncunun puani bulunmamakta..! ");
        System.out.println("*******************");
    }
    public static void main(String[] args) 
    
    {
        /*toplama(5, 3,6);
          toplama(2, 5);
        toplama("fatih", "kara");
        */
        skorhesapla("Fatih",1500);
                skorhesapla(1500);
                        skorhesapla("Fatih");
    }
    
}
