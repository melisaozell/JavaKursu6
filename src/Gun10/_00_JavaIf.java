package Gun10;

import java.util.Objects;
import java.util.Scanner;

public class _00_JavaIf
{
    public static void main(String[] args) {
    // Kullanıcının 2 kez gireceği şifresinin aynı olduğunu
        // AYNI veya DEĞİL şeklinde cevaplayınız.  (confirm new password)



        Scanner oku=new Scanner(System.in);
        System.out.print("şifre gir=");//merhaba bu 78.odada
        String sifre=oku.nextLine();
        System.out.print("sifreyi tekrar girin=");//merhaba bu 88. oda da olsun
        String sifre2=oku.nextLine();

        if (sifre.equals(sifre2))
            System.out.println("AYNI");
        if (!sifre.equals(sifre2))
            System.out.println("DEĞİL");

        //olması gereken string ifadelerde bu iş için yapılmış olan
        //icerik karşılaştırıcı olan EQUALS kullanılmalı
    }


}
