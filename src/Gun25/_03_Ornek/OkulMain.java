package Gun25._03_Ornek;
import java.util.Scanner;
import java.util.ArrayList;
public class OkulMain {
    public static void main(String[] args) {
        Scanner okuInt=new Scanner(System.in);
        Scanner okuStr=new Scanner(System.in);
        ArrayList<Ogrenci>ogrenciler=new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Ogrenci ogr=new Ogrenci();
            System.out.print(i+".öğrenci adı=");
            ogr.ad=okuStr.nextLine();

            System.out.print(i+".öğrenci soyadı=");
            ogr.soyad=okuStr.nextLine();

            System.out.print(i+".öğrenci sınıfı=");
            ogr.sinif=okuInt.nextInt();

            System.out.print(i+".öğrenci adresi=");
            ogr.adres=okuStr.nextLine();
            
            ogrenciler.add(ogr);
            
        }
        for (Ogrenci öğrenci:ogrenciler){
            System.out.println("o.ad = " + öğrenci.ad);
            System.out.println("o.soyad = " + öğrenci.soyad);
            System.out.println("o.sinif = " + öğrenci.sinif);
            System.out.println("o.adres = " + öğrenci.adres);
            
        }
    }




}
