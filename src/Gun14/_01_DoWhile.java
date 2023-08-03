package Gun14;

import java.util.Scanner;

public class _01_DoWhile
{
    public static void main(String[] args) {
        //kullanıcı 0 değerini girene kadar
        //girdiği sayıların toplamını bulunuz.

        Scanner oku=new Scanner(System.in);
        int toplam=0;

        System.out.println("sayi girin=");
        int sayi= oku.nextInt();
        toplam=toplam+sayi;


        while (sayi!=0) //döngünün dönme şartı : girilen sayının 0 dan farklı olması
        {
            System.out.print("sayı girin=");
            sayi=oku.nextInt();

            toplam=toplam+sayi;
        }
        System.out.println("toplam = " + toplam);




    }

}
