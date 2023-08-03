package Gun12;

import java.util.Scanner;

public class _02_JavaRandom
{
    public static void main(String[] args) {
        //Girilen bir sayıya kadar random sayı üreterek tahmin etmeye çalışınız
        //kullanıcı bilirse tebrikler yazdırınız
        //5 girersem 5e kadar sayı üretsin ben tahmin etmeye çalışayım

        Scanner oku=new Scanner(System.in);
        System.out.print("üretilecek sayı sınırı=");
        int sinir= oku.nextInt();

        int tutulanSayi=(int)(Math.random()*sinir);

        System.out.print("Tahminizi girin=");
        int tahmin= oku.nextInt();

        if(tutulanSayi==tahmin)
            System.out.print("tebrikler");
        else
            System.out.print("bilemediniz="+tutulanSayi);
    }


}
