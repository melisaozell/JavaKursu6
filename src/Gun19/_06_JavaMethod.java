package Gun19;

import java.util.Scanner;

public class _06_JavaMethod
{
    public static void main(String[] args) {
        //bir sayının tek mi çift mi olduğunu yazdırınız.

        int sayi=55;

        if (sayi%2==0)
            System.out.println("çift");
        else
            System.out.println("tek");
        /*********************************************/
        tekMiCiftMiYaz(55);
        tekMiCiftMiYaz(56);
        /*********************************************/

        okuTekMiCiftMiYaz();

    }
    public static void tekMiCiftMiYaz(int sayi){
        if (sayi%2==0)
            System.out.println("m:çift");
        else
            System.out.println("m:tek");
    }
    public static void okuTekMiCiftMiYaz(){
        Scanner oku=new Scanner(System.in);
        System.out.print("sayi girin=");
        int sayi= oku.nextInt();

        tekMiCiftMiYaz(sayi);

       // if (sayi%2==0)
       //     System.out.println("m:çift");
       // else
       //     System.out.println("m:tek");

    }
}
