package Gun10;

import java.util.Scanner;

public class _06_IfElse
{
    public static void main(String[] args) {
        // Girilen yeni bir password un kurallara uygunluğunu kontrol ediniz.
        // kurallar :
        // 1) en az 8 karakter olmalı
        // 2) içinde pass kelimesi olmamalı
        // 3) en fazla 12 karakter olmalı.

        Scanner oku=new Scanner(System.in);
        System.out.print("sifre giriniz =");
        String cumle=oku.nextLine();

        if(cumle.length()>=8 && !cumle.toLowerCase().contains("pass") && cumle.length()<=12)
            System.out.println("Uygun");
        else
            System.out.println("değil");
    }


}
