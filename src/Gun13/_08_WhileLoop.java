package Gun13;

import java.util.Scanner;

public class _08_WhileLoop
{
    public static void main(String[] args) {
        // Kullanıcının gireceği 6 sayıdan tek olanları toplayınız

        Scanner oku=new Scanner(System.in);
        int sayac=1;
        int toplam=0;

        while (sayac<=6)
        {
            System.out.print("sayı girin=");
            int sayi= oku.nextInt();

            if(sayi%2==1)
                toplam=toplam+sayi;

            sayac++;

        }
        System.out.println("toplam = " + toplam);

    }


}
