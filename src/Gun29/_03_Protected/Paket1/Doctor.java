package Gun29._03_Protected.Paket1;

public class Doctor {
     public String hastaneAd;   //diğer paketlerden erişim izni verildi;
     String adi;                 // default
     protected String bolumu;   //default aynı
     private String SicilNo;    //private sadece class ın içinden erişilebilir

     Doctor() { //sadece kendi paketindekiler erişebilir
    }

    public Doctor(String adi) { //tüm paketlerdekiler erişebilir
        this.adi = adi;
    }
}
