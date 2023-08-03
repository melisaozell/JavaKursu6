package Gun18;

import java.util.Arrays;

public class _03_Java2DArrays {
    public static void main(String[] args) {
        int[][] tablo = {//2 satir 3 sütun
                {2, 3, 4},//1. satir 3 elemanlı
                {45, 66, 5}//2.satir 3 elemanlı
        };

        System.out.println(Arrays.toString(tablo[0]));//0.satir tümü
        System.out.println(Arrays.toString(tablo[1]));//1.satir tümü
        System.out.println("tablo[0].length = " + tablo[0].length);//0.satirin uzunluğu
        System.out.println("tablo[1].length = " + tablo[1].length);//1.satirin uzunluğu

        System.out.println("tablo = " + tablo.length);//kaç satir var,satır uzunluğu

        for (int satir = 0; satir < tablo.length; satir++) {

            for (int sütun = 0; sütun < tablo[satir].length; sütun++) //her bir satirin sütunlarını yazdıran for
                System.out.print(tablo[satir][sütun]+" ");

            System.out.println();

        }

    }
}
