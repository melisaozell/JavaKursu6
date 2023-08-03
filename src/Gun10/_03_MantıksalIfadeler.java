package Gun10;

import java.util.Scanner;

public class _03_MantıksalIfadeler
{
    public static void main(String[] args) {
        //mantıksal ifadeler Logic statement
        //&& ve işareti (shift+6)
        // || veya işareti (altgr <)

        Scanner oku=new Scanner(System.in);
        System.out.print("sayı giriniz=");
        int sayi= oku.nextInt();

        int kalan=sayi%2;

        if (kalan==1 || kalan==-1)
            System.out.println("TEK");
        else
            System.out.println("ÇİFT");
    }


}
