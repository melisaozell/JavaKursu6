package Gun14;

import java.util.Scanner;

public class _01_DoWhile2
{
    public static void main(String[] args) {
        //kullanıcı 0 değerini girene kadar
        //girdiği sayıların toplamını bulunuz.
        Scanner oku=new Scanner(System.in);
        int toplam=0;
        int sayi=0;

        do { //bu döngü en az bi kere çalışır
            System.out.print("sayi girin=");
            sayi= oku.nextInt();
            toplam=toplam+sayi;
        }while (sayi!=0);

        System.out.println("toplam = " + toplam);
    }

}
