package Gun10;

import java.util.Scanner;

public class _04_IfElse
{
    public static void main(String[] args) {
     // Girilen sayı pozitif ve tek ise , ekrana uygun sayı girildi
        // degilse uygun sayı girilmedi şeklinde yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.print("sayı girin=");
        int sayi= oku.nextInt();

        int kalan=sayi%2;

        if (sayi>0 && kalan==1)
            System.out.println("UYGUN");
        else
            System.out.println("UYGUN SAYI GİRİLEMEDİ");
    }

}
