
public class Main {
    public static void main(String[] args) {
        /*
        && --> and Operatörü  --> bütün sonuçlar true ise genel sonuç true, en az bir tanesi false ise genel sonuç false.
        
        || --> or  Operatörü  --> Sonuçlardan en az birisi bile true ise genel sonuç true, hepsi false ise genel sonuç false.
        
        !  --> not Operatörü  -->
        */
        System.out.println(3==3&&2<3&&"Fatih"=="Fatih"); //and  hepsi true olduğu için genel sonuç true olur 
    
        System.out.println(3==3 || 2<3 ||"Fatih"=="Fatih"); //or 
        
        System.out.println(!(3<4));//not parantez içi karşılaştırmada çıkan true değerini false değerine dönüştürdk
    
        System.out.println(!(3<4&& "Fatih"=="Fatih")||3.4>2.1); 
        /*içerdeki parantez true ve dış parantezde true 
        lakin not operatörü olduğu için genel sonuç false olur*/
    
    }
}
