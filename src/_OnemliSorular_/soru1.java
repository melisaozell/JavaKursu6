package _OnemliSorular_;

import java.util.Scanner;

public class soru1 {
    public static void main(String[] args) {
        //kullanıcı 0 değerini girene kadar
        //girdiği sayıların toplamını bulunuz.

        Scanner oku=new Scanner(System.in);
        System.out.print("sayi girin=");
        int sayi= oku.nextInt();
        int toplam=0;
        toplam=toplam+sayi;

        while (sayi!=0){
            System.out.print("sayi gir=");
            sayi= oku.nextInt();
            toplam=toplam+sayi;

        }
        System.out.println("toplam = " + toplam);

    }
}

