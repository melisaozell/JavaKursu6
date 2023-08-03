package Gun09;

import java.util.Scanner;

public class _04_JavaIf
{
    public static void main(String[] args) {
        //girilen bir sayının tek mi çift mi olduğunu yazdırın
        //tek veya çift yazdırın

        Scanner oku=new Scanner(System.in);
        System.out.print("sayı gir=");
        int sayi= oku.nextInt();

        int kalan=sayi%2;
        if (kalan==0)
            System.out.println("sayı çift");
        if (kalan!=0)
            System.out.println("sayı tek");
    }


}
