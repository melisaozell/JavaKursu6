package Gun12;

import java.util.Scanner;

public class _05_IfElseIf
{
    public static void main(String[] args) {
        // Soru : Kullanıcıdan  Fizik:90   şeklinde not bilgisini alınız.
        // >= 90 için A
        // >= 80 için B
        // >= 70 için C
        // >= 60 için D
        // >= 40 için E
        // < 40 için F yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("dersi ve  notunuzu giriniz=");
        String dersVenotu= oku.nextLine(); //fizik:90

        //1.yöntem substring
        int ind=dersVenotu.indexOf(":");
        int ogrNot=Integer.parseInt(dersVenotu.substring(ind+1));
        System.out.println("ogrNot1 = " + ogrNot);

        //2.yöntem regex
        ogrNot=Integer.parseInt(dersVenotu.replaceAll("[^0-9]",""));
        System.out.println("ogrNot2 = " + ogrNot);

       // else if görünüm
        if (ogrNot>=90)
            System.out.println("A");
        else if (ogrNot>=80)
            System.out.println("B");
        else if (ogrNot>=70)
            System.out.println("C");
        else if (ogrNot>=60)
            System.out.println("D");
        else if (ogrNot>=40)
            System.out.println("E");
        else
            System.out.println("F");

        }

    }








