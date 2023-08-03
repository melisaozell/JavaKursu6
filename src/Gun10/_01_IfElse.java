package Gun10;

import java.util.Scanner;

public class _01_IfElse {
    public static void main(String[] args) {
        //öğrencinin notu 50 den küçükse kaldınız büyükse geçtiniz yazdırın

        Scanner oku=new Scanner(System.in);
        System.out.print("notunuzu girin=");
        int ogrNot= oku.nextInt();

        //1. yöntem bilgisayar boş yere yoruluyor
        if (ogrNot>=50)
            System.out.println("geçtiniz");
        if (ogrNot<50)
            System.out.println("kaldınız");

        //2.yöntem olması gereken
        if (ogrNot<50)
            System.out.println("kaldınız");
        else
            System.out.println("geçtiniz");
    }
}
