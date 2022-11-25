
public class Main {
    public static void toplama(int a,int b,int c)
    {
        int deneme=10;
        System.out.println("toplama sonuc: "+(a+b+c));
    }
    public static void main(String[] args) 
    {
        
        toplama(10, 20, 30); // buradaki metoda içerisindeki değişkenlerde lokaldir a,b,c buradada çağrılabilir kullanılamaz.
        //System.out.println(deneme); kısmında metod içerisindeki denemede kullanılamaz çünkü lokal bir değişkendir.
        
        int d = 5;
        String yazdir = "merhaba";
        
        for (int i = 0; i < 10; i++) 
        {
            System.out.println(i); // i sadece döngüye özel lokal bir değişkendir.
            
            if (d > 1) 
            {
                
                int f;// f sadece bu döngü içerisine özel bir lokal değişkendir.
                //lakin burada [i] kullanılabilir
                i+=1;
            }
             // f burada kullanılamaz
        }
            //i'yi burada kullanamayız // f buradada kullanılamaz
    }
}
