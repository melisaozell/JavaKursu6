package Gun03;

public class _03_JavaDataTypes
{
    public static void main(String[] args)
    {
        int sayi; // hafızada int kadar yer kaplar sadece tam sayı atılabilir
        //tam sayılarda default int

        //tam sayılar için
        byte byteDeger=7; //-128 -127
        short shortDeger=1645; // -32000 -  +32000
        int intDeger=25000;
        long longDeger=343353663436L;

         //ondalıklı sayıları defaultu double
        //ondalıklı sayılar
        double doubleDeger=3.123456780987654345;//noktadan sonra 16 haneye kadar hassasiyeti var
        float floatDeger=3.1696585F;// noktadan sonra 5 hane hassasiyeti var , ama kararsız


        //karakter ve harfler
        char basHarf='A';// bir tane harf saklar
        String isim="İsmet"; // kelime veya cümle saklayabilir ,uzunluğu değişken

        System.out.println("byteDeger = " + byteDeger);
        System.out.println("shortDeger = " + shortDeger);
        System.out.println("intDeger = " + intDeger);
        System.out.println("longDeger = " + longDeger);
        System.out.println("doubleDeger = " + doubleDeger);
        System.out.println("floatDeger = " + floatDeger);
        System.out.println("isim = " + isim);
        System.out.println("basHarf = " + basHarf);

    }


}
