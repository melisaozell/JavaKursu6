package Gun19;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class _01_Java2DArrays
{
    public static void main(String[] args) {
        // 3x2 lik bir diziyi kullanıcıdan sayı alarak
        // doldurduktan sonra sadece tek elemenlarını tek boyutlu bir
        // diziye atayınız.

        int[][]tablo=new int[3][2];
        Scanner oku=new Scanner(System.in);
        int tekMik=0;
        //okuma işlemi , tablonun tüm hücreleri sayi ile dolduruldu
        for (int i = 0; i < tablo.length; i++) {//satir

            for (int j = 0; j < tablo[i].length; j++) {//sütun
                System.out.print("sayi giriniz = ");
                tablo[i][j]= oku.nextInt();//00 01-

                if (tablo[i][j]%2==1)
                    tekMik++;

            }

        }
        int[] tekler=new int[tekMik];//

        int teklerIndex=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                if (tablo[i][j]%2==1){
                     tekler[teklerIndex]=tablo[i][j];
                    teklerIndex++;
                }

            }

        }
        System.out.println(Arrays.toString(tekler));
    }


}
