package Gun06;

import java.util.Scanner;

public class _08_Ornek
{
    public static void main(String[] args) {
     // Girilen bir ad soyadı örneğin "Ismet Temur" I.T.  şeklinde yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("isim-soyisim giriniz");
        String adSoyad=oku.nextLine();

        char ilkharf=adSoyad.charAt(0);// I

        int boslukindex=adSoyad.indexOf(" ");
        char soyadilkharf=adSoyad.charAt(boslukindex+1);

        System.out.println(ilkharf+"."+soyadilkharf+".");

    }


}
