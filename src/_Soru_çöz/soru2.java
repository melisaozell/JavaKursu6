package _Soru_çöz;
import java.util.Scanner;

public class soru2
{
    public static void main(String[] args) {
      /*  "OrtaKelime" isminden bir method oluşturun.
        Bu method String'i parametre olarak almalı.
        Cümle veya dizelerde ortada bulunan kelimeleri bulmalı.
                Ortadaki kelimeyi return yapınız.
                Örnek: Ben Java'yı seviyorum.
        print : Java'yı
        Örnek2:
        Java'yı kolayca öğreniyorum.
        print: kolayca */

        Scanner oku=new Scanner(System.in);
        System.out.print("cümle giriniz");
        String cumle=oku.nextLine();

        System.out.println(OrtaKelime(cumle));



    }
    public static String OrtaKelime(String cumle){

        String[]kelimeler=cumle.split(" ");
        int kelimeSayisi= kelimeler.length;
        int OrtaKelimeIndex=kelimeSayisi/2;
        return kelimeler[OrtaKelimeIndex];




    }



}
