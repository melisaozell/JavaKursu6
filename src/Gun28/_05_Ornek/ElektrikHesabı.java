package Gun28._05_Ornek;

public class ElektrikHesabı {
    int toplamTuketim=0;
    double birimFiyat=20;
    double fatura;

    public void tuketimEkle(int tuketim){
        toplamTuketim=toplamTuketim+tuketim;
    }
    public void faturaYaz(){
        double tuketimTl=toplamTuketim*birimFiyat;
        System.out.println("****************");
        System.out.println("  Faturanız");
        System.out.println("*****************");
        System.out.println("Toplam Tüketim="+toplamTuketim);
        System.out.println("Toplam Tutar="+tuketimTl);
        System.out.println("*******************");
    }
}
