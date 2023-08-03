package Gun28._05_Ornek;

public class EnerjiSA {
    public static void main(String[] args) {


        Musteri mus1 = new Musteri("İsmet");
        mus1.elektrikHesabı.tuketimEkle(50);
        mus1.elektrikHesabı.tuketimEkle(60);
        mus1.elektrikHesabı.tuketimEkle(70);

        System.out.println("toplamTuketim = " + mus1.elektrikHesabı.toplamTuketim);

        mus1.elektrikHesabı.faturaYaz();
    }

}
