package Gun18;

public class _02_Java2DArrays
{
    public static void main(String[] args) {
        int[]dizi=new int[10];//10 tane değer boş halde , default 0
        int[]dizi2={2,3,45,67,8,8,99,0,44,2};//10 tane hem tanımlandı hem değer atandı

        int[][] tablo=new int[2][3];//2 satır , 3 sütun,hepsi default 0 değerine sahip

        int[][]tablo2={//2 satir,3 sütun
                {2,3,44},//1.satır 3 elemanlı
                {45,66,5}//2.satır 3 elemanlı
        };

        for (int satir=0; satir<2; satir++){
            System.out.println(tablo2[satir][0]);//her bir satırın 0. elemanı
            System.out.println(tablo2[satir][1]);//her bir satırın 1. elemanı
            System.out.println(tablo2[satir][2]);//her bir satırın 2. elemanı
        }

        // 2 forlu yöntem kesin veya hatasız
        for (int satir = 0; satir <2 ; satir++) {

            for (int sütun = 0; sütun < 3; sütun++) {//her bir satırın sütunlarını yazdıran for
                System.out.println(tablo2[satir][sütun]+" ");

                System.out.println();

            }

        }
    }



}
