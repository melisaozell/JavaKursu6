package Gun16;

public class _04_JavaArray
{
    public static void main(String[] args) {
       int[] dizi=new int[5];//0,1,2,3,4 indexli 5 elemanlı dizi , int sayi;
        int[]diz2={3,6,44,55,77};//5 elemanlı dizi, hem tanımlandı hem değer atandı, int

        String[]cumleler=new String[5];//5 tane cümle saklayabilen bir String diz değişkeni
        boolean[]dizi3=new boolean[5];//5 tane (true/false)saklayabilen bir dizi değişkeni
        double[]oranlar=new double[5];//5 tane double saklayabilen bir dizi değişkeni

        for (int i = 0; i < dizi.length; i++) {
            System.out.println("dizi = " + dizi[i]);
        }
        for (int i = 0; i < cumleler.length; i++) {
            System.out.println("cumleler = " + cumleler);
        }
        for (int i = 0; i < dizi3.length; i++) {
            System.out.println("boolean dizi= " +dizi3[i]);
        }
        for (int i = 0; i < oranlar.length; i++) {
            System.out.println("oranlar = " +oranlar[i]);
        }
        for (int i = 0; i < diz2.length; i++) {
            System.out.println(i+".diz2 = " + diz2[i]);

        }


    }


}
