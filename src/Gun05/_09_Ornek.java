package Gun05;

import java.util.Scanner;

public class _09_Ornek
{
    public static void main(String[] args) {
        // Kullanıcıdan ağırlığını(kg) double, boyunu(m) double olarak alınız.
        // ve bir satırda boyunuz ... ve kilonuz ... şeklinde yazrınız.
        // vucut kitle indexini de bularak yazdırınız   kg/ (boy*boy)

        Scanner oku=new Scanner(System.in);
        System.out.print("boyunuzu giriniz=");
        double boy= oku.nextDouble();
        System.out.print("kilonuzu giriniz=");
        double kilo= oku.nextDouble();

        double vki=kilo/(boy*boy);
        System.out.println("vki = " + vki);
        System.out.println("bitti");
    }


}
