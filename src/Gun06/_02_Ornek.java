package Gun06;

import java.util.Scanner;

public class _02_Ornek
{
    public static void main(String[] args) {
        //kullanıcıdan cadde(c),sokak(s),postakodu(int),ve ülke(s)
        //evsahibi(b) şeklinde adres bilgilerini alarak yazdırınız
        Scanner okuStr=new Scanner(System.in);
        Scanner okuInt=new Scanner(System.in);
        Scanner okubool=new Scanner(System.in);

        System.out.print("cadde=");
        String cadde=okuStr.nextLine();
        System.out.print("sokak=");
        String sokak= okuStr.nextLine();
        System.out.print("postakodu=");
        int postakodu=okuInt.nextInt();
        System.out.print("ülke=");
        String ulke=okuStr.nextLine();
        System.out.print("ev sahibi mi(t/f)");
        Boolean evsahibimi=okubool.nextBoolean();

        System.out.println("adres="+cadde+" "+sokak+" "+postakodu+" "+ulke+" "+evsahibimi);


    }


}
