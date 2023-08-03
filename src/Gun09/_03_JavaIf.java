package Gun09;

import java.util.Scanner;

public class _03_JavaIf
{
    public static void main(String[] args) {
        //girilen iki sayıdan büyük olanın değerini ekrana yazdırın
        //eşit ise eşit yazdırın

        Scanner oku=new Scanner(System.in);
        System.out.print("1.sayıyı girin=");
        int sayi1= oku.nextInt();
        System.out.print("2. sayıyı girin");
        int sayi2= oku.nextInt();

        if (sayi1>sayi2)
            System.out.println("sayi1 sayi2 den büyük");
        if (sayi2>sayi1)
            System.out.println("sayi2 sayi1 den büyük");
        if (sayi1==sayi2)
            System.out.println("sayi1=sayi2");

    }

}
