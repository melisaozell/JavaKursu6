package Gun28._04_Ornek;

public class Banka {
    String ad;
    int kurulusYili;
    int subeSayisi;

    public Banka()
    {

    }
    public Banka(String ad,int subeSayisi,int kurulusYili)
    {
        this.ad=ad;
        this.subeSayisi=subeSayisi;
        this.kurulusYili=kurulusYili;
    }

    @Override
    public String toString() {
        return "Banka{" +
                "ad='" + ad + '\'' +
                ", subeSayisi=" + subeSayisi +
                ", kurulusYili=" + kurulusYili +
                '}';
    }

    public Banka(String ad, int kurulusYili)
    {

        this.ad=ad;
        this.kurulusYili=kurulusYili;
    }


}
