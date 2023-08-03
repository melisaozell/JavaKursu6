package Gun25._04_Soru;
import java.util.Scanner;
import java.util.ArrayList;

public class OtoGaleri {
    public static void main(String[] args) {

        Scanner okuInt=new Scanner(System.in);
        Scanner okuStr=new Scanner(System.in);
        ArrayList<Araba>galeri=new ArrayList<>();

        for (int i = 0; i < 20; i++) {

            Araba a=new Araba();
            System.out.print("Araba no=");
            a.arabaNo=okuInt.nextInt();
            System.out.print("Araba Markası=");
            a.markano=okuStr.nextLine();
            System.out.print("Araba üretim yılı=");
            a.uretimYili=okuInt.nextInt();

            galeri.add(a);
        }
        arabalarYazdır(galeri);
        uretimOrtalamasıYazdır(galeri);
        int ort=uretimOrtalamasıYazdır2(galeri);//mainde bu şekilde de yazdırabiliriz
        System.out.println("ort = " + ort);

    }
    public static int uretimOrtalamasıYazdır2(ArrayList<Araba>galeri){
        int toplamYil=0;
        for (Araba a:galeri)
            toplamYil=toplamYil+a.uretimYili;

        int ort=toplamYil/ galeri.size();
        return ort;



    }
    public static void arabalarYazdır(ArrayList<Araba>galeri){
        for (Araba a:galeri) {
            System.out.println(a.arabaNo+" "+a.markano+" "+a.uretimYili);

        }
    }
    public static void uretimOrtalamasıYazdır(ArrayList<Araba>galeri){
        int toplamYil=0;
        for (Araba a:galeri)
            toplamYil=toplamYil+a.uretimYili;

        int ort=toplamYil/ galeri.size();
        System.out.println("ort = " + ort);



    }


}
