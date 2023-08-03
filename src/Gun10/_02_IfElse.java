package Gun10;

import java.util.Scanner;

public class _02_IfElse
{
    public static void main(String[] args) {
        //girilen bir sayının tek mi çift mi olduğunu yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.print("sayı giriniz=");
        int sayi= oku.nextInt();

        int kalan=sayi%2;
        //Çiftler0(2,4,6  -2,-4,-6)  tekler 1 (1,3,5)veya -1(-1,-3,-5,-7...)

        if (kalan==0)
            System.out.println("ÇİFT");
        else
            System.out.println("TEK");
    }

}
