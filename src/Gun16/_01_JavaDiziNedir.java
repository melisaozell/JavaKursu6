package Gun16;

public class _01_JavaDiziNedir
{
    public static void main(String[] args) {
        int sayi=0;

        int ogrNot1=0;
        int ogrNot2=0;
        int ogrNot3=0;
        //...
        //...
        //...

        int ogrNot50=0;

        //bana bir tanımlamada BİRDEN FAZLA değer tutabilen bir değişkene ihtiyacım var;
        //çözüm;
        int[]notlar=new int[50];//50 tane int saklaybilen notlar isimli değişken

        notlar[0]=75;
        notlar[1]=88;
        //...
        //...
        notlar[49]=56; //son eleman toplam eleman sayısı-1 lenght-1 dir . böylece 49 indextir
        //50. öğrenci notu
        //notlar[50]=77; challanger patlar

        System.out.println("notlar[0] = " + notlar[0]);

        System.out.println("notlar.length = " + notlar.length);
        //50 yani toplam eleman sayısını verir

    }


}
