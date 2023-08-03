package Gun06;

import java.util.Scanner;

public class _05_Ornek
{
    public static void main(String[] args) {
        //girilen bir stringin sadece son harfini yazdırınız
        Scanner oku=new Scanner(System.in);
        System.out.print("cumle=");
        String cumle=oku.nextLine();

       //01234
       //bugün   uzunluk=5  lenght-1
       int uzunluk=cumle.length();

        char sonharf=cumle.charAt(uzunluk-1);
        System.out.println("sonharf = " + sonharf);

        //2.yöntem
    }
}
