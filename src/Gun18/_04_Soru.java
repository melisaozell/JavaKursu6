package Gun18;

public class _04_Soru {
    public static void main(String[] args) {
        // 2 ye 3 lük bir tabloyu random 100 e kadar sayılarla doldurunuz
        // bütün doldurma işlemi bittikten sonra
        // sonrasında yazdırınız ve kaç tane tek sayı olduğunu bulunuz
        int[][] tablo = new int[2][3];//2 ye üçlük bir tablo

        //tabloyu random 100 e kadar sayılarla doldurunuz
        for (int satir = 0; satir < tablo.length; satir++) {

            for (int sütun = 0; sütun < tablo[satir].length; sütun++)
                tablo[satir][sütun] = (int) (Math.random() * 100);

        }//tabloyu yazdıralım

        for (int satir = 0; satir < tablo.length; satir++) {

            for (int sütun = 0; sütun < tablo[satir].length; sütun++)
                System.out.print(tablo[satir][sütun] + " ");

            System.out.println();


        }//tabloyu yazdıralım
        int tekSayiMik = 0;
        for (int satir = 0; satir < tablo.length; satir++) {

            for (int sütun = 0; sütun < tablo[satir].length; sütun++) {
                if (tablo[satir][sütun] % 2 == 1)
                    tekSayiMik++;



            }


        }
        System.out.println("tekSayiMik = " + tekSayiMik);


    }
}
