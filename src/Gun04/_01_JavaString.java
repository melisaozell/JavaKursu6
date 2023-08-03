package Gun04;

public class _01_JavaString
{
    public static void main(String[] args)
    {
      int sayac=0; // int tipi,sayac adı,0 başlangıç değeri

      String ad="İsmet";  //kelime veya kelimeler saklayacaksam Stirng kullanacağız

        System.out.println("sayac = " + sayac);
        System.out.println("ad = " + ad);

        String soyad="temur";
        System.out.println("soyad = " + soyad);

        String tamAd=ad+" "+soyad; //+ işareti sayılarda toplar , kelimelerde yan yana birleştirir

        System.out.println("tamAd= " +tamAd); // ismetTemur

    }


}
