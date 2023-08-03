package Gun13;

import java.util.Scanner;

public class _01_Switch
{
    public static void main(String[] args) {

        //daha önce çözdüğünüz hesap makinesi sorusunu
        //switch ile çözünüz
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

        switch (secim.toUpperCase()){ //sadece 1 eşitlik durumu için çalışır
            case "T":System.out.println("toplam="+(sayi1+sayi2)); break;
            case "Ç":System.out.println("çıkartma="+(sayi1-sayi2)); break;
            case "P":System.out.println("çarpma="+(sayi1*sayi2)); break;
            case "B":System.out.println("bölme="+((double)sayi1/sayi2)); break;
            default: System.out.println("hatalı giriş");


        }

    }




}
