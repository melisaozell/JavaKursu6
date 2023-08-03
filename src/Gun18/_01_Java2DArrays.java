package Gun18;

import java.util.Scanner;

public class _01_Java2DArrays
{
    public static void main(String[] args) {
        int sayi=0;
        int[]dizi=new int[100];

        int[]ders1Not=new int[50]; //50 kişilik ders1 in notları
        int[]ders2Not=new int[50];//50 kişilik ders2 nin notları
        int[]ders3Not=new int[50];//50 kişilik ders3 ün notları

        int[][]tumDersNotlari=new int[3][50];//3 tane 50 lik sayı tutabiliyor

        ders1Not[0]=80;//tek boyutlu dizinin ilk elemanı

        tumDersNotlari[0][0]=80;//2 indexle gösterilir,tablonun ilk elemanı

        System.out.println("tumDersNotları[0][0]="+tumDersNotlari[0][0]);

        Scanner oku=new Scanner(System.in);
        tumDersNotlari[0][0]= oku.nextInt();

    }


}
