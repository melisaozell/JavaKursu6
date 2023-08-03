package Gun16;

import java.util.Scanner;

public class _05_JavaArray
{
    public static void main(String[] args) {
        // Kullanıcıdan alacağınız 7 sayıyı aldıktan sonra
        // kaç tanesinin ortalamadan büyük ve tek sayı olduğunu bulunuz.

        Scanner oku=new Scanner(System.in);
        double toplam=0;
        int[] dizi=new int[7];

        for (int i = 0; i < dizi.length; i++) {
            System.out.print((i+1)+".sayı giriniz=");
            dizi[i]= oku.nextInt();

            toplam=toplam+dizi[i];

        }
        double ort=toplam/dizi.length;
        int miktar=0;

        for (int i = 0; i < dizi.length; i++) {

            if (dizi[i]>ort && dizi[i]%2==1)
                miktar++;

        }
        System.out.println("ort = " + ort);
        System.out.println("miktar="+miktar);

    }


}
