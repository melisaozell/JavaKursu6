package Gun21;

import java.util.ArrayList;
import java.util.Scanner;

public class _03_Soru
{
    public static void main(String[] args) {
    //bir öğretmenden girmek istediği kadar notu alınız
    //öğretmene devam etmek istiyor musunuz(E/H) şeklinde sorunuz
    //ve ortalamayı geçen öğrenci sayısını bulunuz.

        Scanner okuInt=new Scanner(System.in);
        Scanner okuStr=new Scanner(System.in);

        ArrayList<Integer>notlar=new ArrayList<>();
        double toplam=0;
        String cevap="";
        
        do {
            System.out.print("Not giriniz=");
            int not= okuInt.nextInt();
            
            notlar.add(not);
            toplam=toplam+not;

            System.out.print("Devam etmek istiyor musunuz?(E/H)");
            cevap=okuStr.nextLine();
            
        }while (cevap.equalsIgnoreCase("E"));//döngünün devam şartı
        //öğretmenin istediği notlar girildi
        
        //ortalama bulundu
        double ort=toplam/notlar.size();
        System.out.println("ort = " + ort);
        
        int gecenSayisi=0;
        for (int i = 0; i < notlar.size(); i++) {
            if (notlar.get(i)>=ort)
                gecenSayisi++;
            
        }
        System.out.println("gecenSayisi = " + gecenSayisi);



    }


}
