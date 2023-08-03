package _OnemliSorular_;

import java.util.Arrays;

public class soru11
{
    public static void main(String[] args) {
         /*int Array oluşturun ve elemanları : 15 , 25, 22, 18, 30

        Arraydaki en büyük 2. elemanı yazdıran bir program yazın.*/

        int[]dizi={15,25,22,18,30};
        int diziIndex= dizi.length;


        //dizi sıralama
        for (int i = 0; i < dizi.length; i++) {

            Arrays.sort(dizi);
        }

        int enBüyükIkinciSayi= dizi[3];
        System.out.println("enBüyüksayi2 = " + enBüyükIkinciSayi);

    }


}
