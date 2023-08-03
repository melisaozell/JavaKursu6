package Gun11;

import java.util.Scanner;

public class _06_JavaTernary
{
    public static void main(String[] args) {
        // Soru : Girilen bir sayının sıfır mı, negatif mi, pozitif mi
        //        olduğunu Ternary operatör ile yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("sayı=");
        int sayi= oku.nextInt();
         // ? böyle ise , : else
        String sonuc=(sayi<0)? "negatif":(sayi>0)? "pozitif": "sıfır";
        System.out.println(sonuc);
    }

}
