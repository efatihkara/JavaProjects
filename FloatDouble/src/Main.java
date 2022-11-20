
public class Main {
    public static void main(String[] args) {
        double a=5.25;
        double b= 4.0;
        double c=4d;
        double d= 4.23d;
        
        System.out.println(a);
        
        System.out.println(b);
        
        System.out.println(c);
        
        System.out.println(d);
        // 
        
        int e=22/7;
        float g=22f/7f;
        double h=22d/7d;
        
        System.out.println(e);
        // double aşağıda float değerinden basamak olarak fazla gösterecektir
        System.out.println(g);
        System.out.println(h); 
        //otomatik dönüştürme işlemi int-->float-->double
        
        int x=5;
        double y=x;
        System.out.println(y);// int-->float otomatik dönüştürmesi yapmıştır.
        
    }
    
}
