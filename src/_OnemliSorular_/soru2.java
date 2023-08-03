package _OnemliSorular_;

import java.util.Scanner;

public class soru2 {
    public static void main(String[] args) {
        //kullanıcıdan x girilene kadar ekrana "Program çalışıyor" yazan
        //ve x girildiğinde ise "program bitti" yazan programı yazınız.





        //do-while çözümü
        Scanner oku = new Scanner(System.in);
        String harf;

        do {
            System.out.print("harf giriniz=");
            harf = oku.next();
            if (!harf.equalsIgnoreCase("x")) {
                System.out.println("program çalışıyor");

            }
        }while (!harf.equalsIgnoreCase("x")) ;

        System.out.print("program bitti");

    }
}
