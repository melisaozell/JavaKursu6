package Gun20;

import java.util.Scanner;

public class _03_JavaMethod
{
    public static void main(String[] args) {
        // Kullanıcının gireceği 2 sayıdan büyük olanını bulma işlemini bir metodda
        // yaptıktan sonra main de yazdırınız.
        Scanner oku=new Scanner(System.in);

        System.out.print("1.sayıyı girin");
        int sayi1=oku.nextInt();

        System.out.print("2.sayıyı girin");
        int sayi2= oku.nextInt();

        int enb=enbSayiBul(sayi1,sayi2);
        System.out.println("enb="+enb);
        }


    public static int enbSayiBul(int s1,int s2){//metodun imzası
       return (s1>s2 ? s1 : s2);
    }
}

