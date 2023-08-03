package Gun07;

import java.util.Scanner;

public class _07_Ornek
{
    public static void main(String[] args) {
        //tek sefer de girilen bir ad soyadda , adını ve soyadını ayırarak
        //ayrı ayrı yazdırınız.(sadece ad ve soyad)

        Scanner oku=new Scanner(System.in);
        System.out.print("adınızı ve soyadınızı girin=");
        String adSoyad=oku.nextLine(); // İsmet Temur

        // 0-boşluğun indexine kadar desem:adı
        //boşluğun indexi+1 den sonuna kadar desem :soyadı verir
        
        int boslukindex=adSoyad.indexOf(" ");
        String ad=adSoyad.substring(0,boslukindex);
        String soyad=adSoyad.substring(boslukindex+1);

        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);

    }



}
