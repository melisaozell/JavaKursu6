package Gun12;

import java.util.Scanner;

public class _04_IfElseIf
{
    public static void main(String[] args) {
        // Girilen 2 tam sayıyı kullanıcıdan aldıktan sonra,
        // Toplama için T, Çıkarma için Ç, çarpma için P, bölme için B
        // harflerini yine kullanıcıdan alarak isteğe uygun olan
        // işlemi yaptırıp sonucu yazdırınız.

        Scanner oku=new Scanner(System.in);
        Scanner okuStr=new Scanner(System.in);
        System.out.print("sayıyı girin=");
        int sayi1= oku.nextInt();
        System.out.print("2.sayıyı girin=");
        int sayi2= oku.nextInt();
        System.out.print("Toplama için T=");
        System.out.print("çıkartma için Ç=");
        System.out.print("çarpma için P=");
        System.out.print("Bölme için B=");
        System.out.println("Seçiminiz");
        String secim=okuStr.next();//T,Ç,P,B

        if(secim.equalsIgnoreCase("T"))
            System.out.println("toplam="+(sayi1+sayi2));
        else
            if (secim.equalsIgnoreCase("Ç"))
                System.out.println("çıkartma="+(sayi1-sayi2));
            else
                if(secim.equalsIgnoreCase("P"))
                    System.out.println("çarpma="+(sayi1*sayi2));
                else
                    if(secim.equalsIgnoreCase("B"))
                        System.out.println("bölme="+(sayi1/sayi2));
                    else
                        System.out.println("hatalı girdiniz");
    }


}
