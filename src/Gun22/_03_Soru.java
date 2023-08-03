package Gun22;

import com.sun.xml.internal.bind.v2.TODO;

import java.util.ArrayList;
import java.util.Scanner;

public class _03_Soru
{
    public static void main(String[] args) {
        ArrayList<Integer>matNotları=new ArrayList<>();
        ArrayList<Integer>fizNotları=new ArrayList<>();
        ArrayList<Integer>kimNotları=new ArrayList<>();

        matNotları.add(50);
        matNotları.add(70);
        matNotları.add(80);

        fizNotları.add(30);
        fizNotları.add(40);

        kimNotları.add(60);
        kimNotları.add(70);
        kimNotları.add(80);
        kimNotları.add(90);

        ArrayList< ArrayList<Integer> >notlarListesi=new ArrayList<>();//Listelerin listesi
        notlarListesi.add(matNotları);
        notlarListesi.add(fizNotları);
        notlarListesi.add(kimNotları);
        // Soru 1:
        // Notları ekrana ders adlarını bir ArrayListten alarak her dersin adını ve notlarını
        // her bir satıra yazdırınız
        // Matematik : 50 70 80
        // Fizik : 30 40
        // Kimya : 60 70 80 90

        ArrayList<String>dersler=new ArrayList<>();
        dersler.add("Matematik");
        dersler.add("Fizik");
        dersler.add("Kimya");

        for (int i = 0; i < notlarListesi.size(); i++) {

            System.out.print(dersler.get(i)+ " : ");
            for (int j = 0; j < notlarListesi.get(i).size(); j++) {

                System.out.print(notlarListesi.get(i).get(j)+"\t");

            }
            System.out.println();

        }

        // Soru 2 :
        // Kullanıcıdan istediği bir dersin  nosunu alarak (0-Mat, 1-Fiz, 2-Kim)
        // sadece istedği derse ait notları bir metodda yazdırınız.

        System.out.println("*********** 2. soru **********");
        Scanner oku=new Scanner(System.in);
        System.out.print("Ders no(0-Mat, 1-Fiz, 2-Kim)=");
        int dersNo= oku.nextInt();

        dersNotlariniYazdir(dersNo,notlarListesi);

        //TODO
        // Soru 3 :
        // Yukarıda verilen derse ait not otlamasını ve geçen sayısını bir metodda yazdırınız.
    }

    public static void dersNotlariniYazdir(int dersNo,ArrayList<ArrayList<Integer>>notlarListesi){
        for (int i = 0; i < notlarListesi.get(dersNo).size(); i++) {
            System.out.print(notlarListesi.get(dersNo).get(i)+"\t");

        }
    }

}
