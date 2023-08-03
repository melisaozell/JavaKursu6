package Gun05;

import java.util.Scanner;

public class _06_Ornek {
    public static void main(String[] args) {
        //bir karenin kenarını kullanıcıdan isteyip çevresini ve alanını bulun ve yazdırın

        Scanner oku=new Scanner(System.in);

        System.out.print("karenin 1 kenarını giriniz=");
        int kenar= oku.nextInt();

        int cevre=kenar*4;
        int alan=kenar*kenar;

        System.out.println("karenin alanı = " + alan);
        System.out.println("karenin çevresi = " + cevre);
        System.out.println("bitti");

    }

}
