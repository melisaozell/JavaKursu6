package Gun09;

import java.util.Locale;
import java.util.Scanner;

public class _08_JavaIf
{
    public static void main(String[] args) {
        //girilen bir cümledeki küçük veya büyük a harf olup olmadığını yazdırın
        //var ve yok şeklinde

        Scanner oku=new Scanner(System.in);
        System.out.print("cümle gir=");
        String cumle= oku.nextLine();

        cumle=cumle.toLowerCase(); //bütün büyük harfler küçük oldu

        if (cumle.contains("a"))
            System.out.println("var");
        if (!cumle.contains("a"))
            System.out.println("yok");
    }

}
