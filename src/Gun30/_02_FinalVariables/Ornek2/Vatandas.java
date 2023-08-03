package Gun30._02_FinalVariables.Ornek2;

public class Vatandas {
    private  int tcNo;
    String isim;
    String adres;


    private static int TcNoSayac=1;

    public Vatandas(String isim,String adres){
        this.isim=isim;
        this.adres=adres;
        this.tcNo=TcNoSayac++;
    }

    @Override
    public String toString() {
        return "Vatandas{" +
                "tcNo=" + tcNo +
                ", isim='" + isim + '\'' +
                ", adres='" + adres + '\'' +
                '}';
    }
}
