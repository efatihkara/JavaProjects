
public class Account {
    
    private String hesapNo;
    private double bakiye=1000;
    private String isim;
    private String email;
    private String telefonNo;
    
    public Account(){
       /* this.hesapNo="Bilgi yok";
        this.bakiye=0.0;
        this.isim="Bilgi yok";
        this.email="Bilgi yok";
        this.telefonNo="Bilgi yok";
      */
       
       this("Bilgi yok", 0.0,"Bilgi yok","Bilgi yok", "Bilgi yok"); //yukarıdaki tek tek yazımın daha kolay hali
    }
    public Account(String isim,String email,String telefonNo){
        
        this("Bilgi yok",0.0,isim,email,telefonNo);
    }
    
    public Account(String hesapNo,double bakiye,String isim,String email,String telefonNo){
        this.hesapNo=hesapNo;
        this.bakiye=bakiye;
        this.isim=isim;
        this.email=email;
        this.telefonNo=telefonNo;
        
    }
    
    public void göster(){
        System.out.println("Hesap Sahibi: "+this.getIsim());
        System.out.println("Hesap No: "+this.getHesapNo());
        System.out.println("Telefon No: "+this.getTelefonNo());
        System.out.println("Mail Adresiniz: "+this.getEmail());
        System.out.println("Hesap Bakiyeniz: "+this.getBakiye());
    }
    
public void paraYatir(double miktar)
{
    bakiye+=miktar;
    System.out.println("Yeni bakiye: "+bakiye);
    
}

public void paraCek(double miktar){
    
    if(miktar>1500){
        System.out.println("Bir gunde 1500 tlden fazla para cekemezsiniz...");
    }
    if(bakiye-miktar<0){
        System.out.println("Yeterli bakiye yok. Bakiyeniz= "+bakiye);
    }
    else{
        bakiye-=miktar;
        System.out.println("Yeni Bakiye: "+bakiye);
    }
}


    /**
     * @return the hesapNo
     */
    public String getHesapNo() {
        return hesapNo;
    }

    /**
     * @param hesapNo the hesapNo to set
     */
    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }

    /**
     * @return the bakiye
     */
    public double getBakiye() {
        return bakiye;
    }

    /**
     * @param bakiye the bakiye to set
     */
    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    /**
     * @return the isim
     */
    public String getIsim() {
        return isim;
    }

    /**
     * @param isim the isim to set
     */
    public void setIsim(String isim) {
        this.isim = isim;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the telefonNo
     */
    public String getTelefonNo() {
        return telefonNo;
    }

    /**
     * @param telefonNo the telefonNo to set
     */
    public void setTelefonNo(String telefonNo) {
        this.telefonNo = telefonNo;
    }
    
    
    
}
