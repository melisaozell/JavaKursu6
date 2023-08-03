package Gun30._03_Soru;
import java.util.Scanner;

public class SoruMain {
    public static void main(String[] args) {
        int gun=0;
        int saat=0;
        int dak=0;

        Scanner oku=new Scanner(System.in);
        System.out.print("gun=");gun= oku.nextInt();
        System.out.print("saat=");saat= oku.nextInt();
        System.out.print("dakika=");dak= oku.nextInt();

        int toplamSaniye=
                gun
                *Sabitler.birGundekiSaatSayisi
                *Sabitler.birSaattekiDakikaSayisi
                *Sabitler.birDakikadakiSaniyeSayisi
                +
                saat
                *Sabitler.birGundekiSaatSayisi
                *Sabitler.birSaattekiDakikaSayisi
                +
                dak
                *Sabitler.birDakikadakiSaniyeSayisi;

        System.out.println("toplamSaniye = " + toplamSaniye);

        //2.yöntem
        System.out.println(toplamSaniye=+Sabitler.hesapla(gun,saat,dak));
    }
}
