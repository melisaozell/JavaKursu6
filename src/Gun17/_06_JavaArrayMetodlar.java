package Gun17;

import java.util.Arrays;

public class _06_JavaArrayMetodlar
{
    public static void main(String[] args) {
        String[]isimler={"Ahmet","Zeynep","Roman","Kaya","Cihan"};

        //diziyi ekrana direk yazdırmak için
        System.out.println("isimler = " + Arrays.toString(isimler));

        int[]a={1,3,6,99};
        System.out.println("a = " +Arrays.toString(a));

        //dizi sıralama
        Arrays.sort(isimler);
        System.out.println("isimler"+Arrays.toString(isimler));;

        //diziler eşit mi

        int[]b={1,3,6,99};
        int[]c={1,6,3,99};

        System.out.println("Arrays.equals(a,b) = " + Arrays.equals(a,b));//true
        System.out.println("Arrays.equals(a,c) = " + Arrays.equals(a,c));//false

        //contains gibi çalışır , var ise pozitif sayi verir,yok ise negatif
        //sadece sıralı dizilerde çalışır
        System.out.println("Arrays.binarySearch(a,3) = " + Arrays.binarySearch(a,3));//- değer yok
        System.out.println("Arrays.binarySearch(c,3) = " + Arrays.binarySearch(c,3));//1,var


        //Diziyi hızlıca doldurmak bir değer ile
        Arrays.fill(a,8);
        System.out.println("Arrays.toString(a)="+Arrays.toString(a));

    }

}
