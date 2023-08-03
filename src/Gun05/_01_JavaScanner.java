package Gun05;

import java.util.Scanner;

public class _01_JavaScanner
{
    public static void main(String[] args) {
       //tipi       adı    başlangıç değeri
         int        sayi=  5;


        Scanner   okuyucu = new Scanner(System.in);
      //tipi      adı       yeni bir tane okuyucu oluştur

        System.out.print("Sayı giriniz=");
        int okunan=okuyucu.nextInt(); // klavyeden girilen tam sayıyı oku
        // rakam girilip entara basıldığında değeri alıp okunana atıyor

        System.out.println("okunan="+okunan);
        System.out.println("bitti");


    }


}
