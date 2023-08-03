package _OnemliSorular_;

import java.util.ArrayList;
import java.util.Scanner;

public class soru16
{
    public static void main(String[] args) {
        //bir öğretmenden girmek istediği kadar notu alınız
        //öğretmene devam etmek istiyor musunuz(E/H) şeklinde sorunuz
        //ve ortalamayı geçen öğrenci sayısını bulunuz.

        ArrayList<Integer> notlar=new ArrayList<>();
        Scanner okuInt=new Scanner(System.in);
        Scanner okuStr=new Scanner(System.in);

        double toplam=0;
        String cevap="";

        //not girişi ve toplam bulundu;
        do {
            System.out.print("notu giriniz=");
            int not=okuInt.nextInt();

            notlar.add(not);
            toplam=toplam+not;

            System.out.print("devam etmek istiyor musunuz(e/h)?");
            cevap=okuStr.nextLine();
        }while (cevap.equalsIgnoreCase("e"));

        //ortalama bul
        double ortalama=0;
        int gecenOgrSayisi=0;
        for (int i = 0; i < notlar.size(); i++) {
            ortalama=toplam/notlar.size();

            if (notlar.get(i)>ortalama){
                gecenOgrSayisi++;
            }

        }
        System.out.println("ortalama = " + ortalama);
        System.out.println("ortalamayı gecen öğrenci sayısı="+gecenOgrSayisi);

    }


}
