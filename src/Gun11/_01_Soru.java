package Gun11;

import java.util.Scanner;

public class _01_Soru
{
    public static void main(String[] args) {
        // yan yana aralarında bir boslukla girilen 2 int sayının
        //birbirnine eşit olup olmadığını bulunuz
        //45 67

        Scanner oku=new Scanner(System.in);
        System.out.print("sayıları aralarında bir boşluk olarak giriniz"); //56 879
        String sayilar=oku.nextLine();

        int boslukindex=sayilar.indexOf(" ");
        String Strsayı1=sayilar.substring(0,boslukindex); //56
        String Strsayı2=sayilar.substring(boslukindex+1);//879

        int sayi1=Integer.parseInt(Strsayı1);
        int sayi2=Integer.parseInt(Strsayı2);

        if (sayi1==sayi2)
            System.out.println("sayılar eşit");
        else
            System.out.println("eşit değiller");


    }


}
