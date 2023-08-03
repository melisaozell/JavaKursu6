package Gun05;

import java.util.Scanner;

public class _03_Ornek
{
    public static void main(String[] args) {
        //kullanıcının adını ve soyadını alarak ekrana yazdırın

        Scanner okuyucu=new Scanner(System.in);

        System.out.print("isim ve soyisim giriniz=");
        String okunanisimsoyisim= okuyucu.nextLine();

        System.out.println("okunan isim soyisim = " + okunanisimsoyisim);
        System.out.println("bitti");
    }


}
