package Gun21;

import java.util.ArrayList;
import java.util.Scanner;

public class _02_Soru
{
    public static void main(String[] args) {
        // Kullanıcıdan alacağınız sayılarla dolduracağınız 6 elemanlı(sayı) bir dizinin
        // sadece tek sayı olan elemanlarını ayrı diziye(liste)(ArrayList) atayarak
        // yazdırınız.

        int[]dizi=new int[6];
        ArrayList<Integer>tekSayilar=new ArrayList<>();
        Scanner oku=new Scanner(System.in);
        for (int sayac = 0; sayac < dizi.length ; sayac++) {
            System.out.print("Sayi giriniz=");
            int sayi= oku.nextInt();
            dizi[sayac]=sayi;

        }
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i]%2==1){
                tekSayilar.add(dizi[i]);
            }


        }
        System.out.println("tekSayilar = " +tekSayilar);
    }


}
