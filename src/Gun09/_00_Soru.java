package Gun09;

import java.util.Scanner;

public class _00_Soru
{
    public static void main(String[] args) {
        //girilen bir sayının tek olup olmadığını bulunuz

        Scanner oku=new Scanner(System.in);
        System.out.print("sayı giriniz =");
        int sayi= oku.nextInt();
        
        int kalan=sayi%2;// 1 ise tektir

         boolean tekMi=(kalan==1);
        System.out.println("tekMi = " + tekMi);
        
        
    }

}
