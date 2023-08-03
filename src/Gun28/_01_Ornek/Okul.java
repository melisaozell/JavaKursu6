package Gun28._01_Ornek;
import java.util.Scanner;

public class Okul {
    public static void main(String[] args) {
        //Scanner oku=new Scanner(System.in);

        Ogrenci ogr1 = new Ogrenci();

        //1.yol
        ogr1.id=1;
        ogr1.ad="Melisa";
        ogr1.soyad="Özel";
        ogr1.sinif=6;

        System.out.println("ogr1.ad = " + ogr1.ad);
        
        //2.yol
        Ogrenci ogr2=new Ogrenci(2,"Mehmet","Yılmaz",5);
        System.out.println("ogr2.ad="+ogr2.ad);
        
        //3.yol
        Ogrenci ogr3=new Ogrenci(4,"Ayşe","Demir");
        System.out.println("ogr3.ad = " + ogr3.ad);
        
    }
}
