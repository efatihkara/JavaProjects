
import java.util.HashSet;


public class Test {
    public static void main(String[] args) {
        Account account1= new Account();
        
       /* account1.setHesapNo("197355");
        account1.setBakiye(1500.45);
        account1.setEmail("djfatih046");
        account1.setIsim("Fatih");
        account1.setTelefonNo("05352374646");
        */
        
       Account account2=new Account("12312",2050.5,"Fatih","efatihkara","197355");
       
        account2.paraYatir(250);
        account2.paraCek(3500);
        
      //  account1.göster();
    }
}
