package Gun30._01_StaticVariables.Ornek1;

public class Okul {
    public static void main(String[] args) {
       /* Ogrenci ogr1=new Ogrenci("melisa","nazlı","Yıldırım ilkokulu")
        Ogrenci ogr2=new Ogrenci("zeynep","derin","Yıldırım ilkokulu")
        Ogrenci ogr3=new Ogrenci("ali","mert","Yıldırım ilkokulu")

        //...
        //...
        Ogrenci ogr499=new Ogrenci("melike","eryılmaz","Yıldırım ilkokulu")
        Ogrenci ogr500=new Ogrenci("sevgi","özel","Yıldırım ilkokulu") */

        Ogrenci ogr1=new Ogrenci("ismet","temur");
        System.out.println("ogr1 = " + ogr1);

        Ogrenci.okulAd="Atatürk ilkokulu";
        System.out.println("ogr1 tekrar = " + ogr1);

        //aynı verinin çok kez girişi engellendi
        //aynı verinin hafızada NESNE sayısı kadar tekrarlanması engellendi

    }
}
