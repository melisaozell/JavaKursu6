package _OnemliSorular_;

public class soru4
{
    public static void main(String[] args) {
        //0 dan 100 e kadar olan çift sayıların toplamını bulunuz.
        //toplam 50 yi geçince , mesaj yazınız (50 geçildi şeklinde)

        int toplam = 0; //başlangıc=0 sonu=100 artış 2
        boolean sinir_asildi = false;

        for (int i = 0; i <= 100; i = i + 2) {
            toplam = toplam + i;
            System.out.println("i="+i);

            if (toplam > 50 && sinir_asildi == false) {
                System.out.println("50 yi geçti");
                sinir_asildi = true;

            }

        }
        System.out.println("toplam = " + toplam);
    }


}
