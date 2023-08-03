package Gun09;

import java.util.Scanner;

public class _02_JavaIf
{
    public static void main(String[] args) {
        //girilen bir sayının negatif mi pozitif mi olduğunu yazdırınız
        //sıfır ise sıfır yazdırın

        Scanner oku=new Scanner(System.in);
        System.out.print("sayı girin=");
        int sayi= oku.nextInt();

        if(sayi>0)
            System.out.println("sayı pozitif ");
        if (sayi<0)
            System.out.println("sayı negatif");
        if (sayi==0)
            System.out.println("sayı sıfırdır");



    }

}
