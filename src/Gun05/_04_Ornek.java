package Gun05;

import java.util.Scanner;

public class _04_Ornek
{
    public static void main(String[] args) {
        //kullanıcıdan ad ve soyadı ayrı ayrı okutarak alıp
        //birlikte ekrana yazdırın
        Scanner okuyucu=new Scanner(System.in);
        System.out.print("isminizi giriniz=");
        String okunanisim= okuyucu.nextLine();

        System.out.print("soyadınızı giriniz=");
        String okunansoyad=okuyucu.next();

        System.out.println("okunan isim soyisim="+okunanisim+" "+okunansoyad);
        System.out.println("bitti");
    }


}
