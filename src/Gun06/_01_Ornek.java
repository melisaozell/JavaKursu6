package Gun06;

import java.util.Scanner;

public class _01_Ornek
{
    public static void main(String[] args) {
        //kullanıcıya öğrenci misiniz diye sorunuz
        //evet ise true,hayır ise false yazdırınız
        //alınan cevabı yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.print("öğrenci misiniz=");
        boolean cevap= oku.nextBoolean();

        System.out.println("cevap = " + cevap);
    }


}
