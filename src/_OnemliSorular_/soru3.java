package _OnemliSorular_;

import java.util.Scanner;

public class soru3
{
    public static void main(String[] args) {
        // 6- Bir sayı bulmaca oyunu yapılmak isteniyor
        // bilgisayar 10-20 arasında bir sayı tutsun, kullanıcı bu sayıyı bulmaya çalışssın,
        //Kullanıcının bu sayıyı bulmak için 3 hakkı olsun. 3 hakkın sonunda da bilemez ise,
        //bilemediniz yazıp tutulan sayıyı bildirsin.
        //Eğer bilirse tebrikler yazsın.

        //bilgisayarın tuttuğu sayıyı oluştur

        Scanner oku = new Scanner(System.in);
        int tutulanSayi = (int) (Math.random() * (20 - 10)) + 10;
        System.out.println("tutulanSayi = " + tutulanSayi);

        int sayac = 1;

        do {
            System.out.print("tahminizi girin=");
            int sayi = oku.nextInt();
            if (sayi == tutulanSayi) {
                System.out.println("tebrikler bildiniz");
                break;
            } else if (sayac != 3) {
                System.out.println("tekrar deneyiniz");
            } else {
                System.out.println("bilemediniz,tutulan sayi="+tutulanSayi);
            }
            sayac++;
        } while (sayac <= 3) ;
    }


}
