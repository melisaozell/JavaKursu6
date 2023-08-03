package _OnemliSorular_;
import java.util.Scanner;

public class Proje {
    public static void main(String[] args) {

        String[][]tahta=new String[3][3];
        String p1="X";
        String p2="O";

        Scanner oku=new Scanner(System.in);

        for (int satir = 0; satir < 3; satir++) {
            for (int sutun = 0; sutun < 3; sutun++) {
                System.out.print("satir bilgisini giriniz=");
                int sayi= oku.nextInt();
                System.out.print("sütun bilgisini giriniz=");
                int sayi2= oku.nextInt();
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print(tahta[satir][sutun]+" ");
                    }
                    System.out.println();
                }



            }

        }
    }
}
