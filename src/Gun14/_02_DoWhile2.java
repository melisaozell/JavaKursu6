package Gun14;

import java.util.Scanner;

public class _02_DoWhile2
{   //kullanıcıdan x girilene kadar ekrana "Program çalışıyor" yazan
    //ve x girildiğinde ise "program bitti" yazan programı yazınız.
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        String girilen;

        do {
            System.out.print("ifade giriniz=");
            girilen=oku.next();

            if (girilen.equalsIgnoreCase("x"))
                System.out.println("program çalışıyor");
        }while (girilen.equalsIgnoreCase("x"));
        System.out.println("program bitti");
    }


}
