package Gun11;

import java.util.Scanner;

public class _03_JavaTernary
{
    public static void main(String[] args) {
        //kullanıcın gireceği sayı tek mi çift mi yazdırın
        Scanner oku=new Scanner(System.in);
        System.out.print("sayi=");
        int sayi= oku.nextInt();

        if (sayi%2==0)
            System.out.println("çift");
        else
            System.out.println("tek");
        //1. kısa yöntem
        String sonuc=((sayi%2==0) ?  "çift" :"tek");  // ? -> if  , : -> else
        System.out.println(sonuc);

        //2.kısa yöntem
        System.out.println(((sayi%2==0)?"çift":"tek"));
    }


}
