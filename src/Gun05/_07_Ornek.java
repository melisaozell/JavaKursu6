package Gun05;

import java.util.Scanner;

public class _07_Ornek
{
    public static void main(String[] args) {
        //Bir dikdörtgenin kenar uzunluklarını kullanıcıdan isteyip alan ve çevreyyi bulunuz

        Scanner oku=new Scanner(System.in);
        System.out.print("kısa kenar giriniz=");
        int kisakenar= oku.nextInt();
        System.out.print("uzun kenar giriniz=");
        int uzunkenar= oku.nextInt();

        int alan=kisakenar*uzunkenar;
        int cevre=(kisakenar*2)+(uzunkenar*2);

        System.out.println("cevre = " + cevre);
        System.out.println("alan = " + alan);
        System.out.println("bitti");

    }



}
