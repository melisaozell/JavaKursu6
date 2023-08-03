package Gun15;

import java.util.Scanner;

public class _05_Continue
{
    public static void main(String[] args) {
        // Girilen bir stringin harflerini teker teker ekrana alt alta olacak
        // şekilde yazdırınız, boşlukları yazmasın.

        Scanner oku=new Scanner(System.in);
        System.out.print("bir cumle girin=");
        String cumle=oku.nextLine();

        // Bu gün hava çok güzel-> index=0, kaça<cumle.lenght,1 er artıyo

        for (int i = 0; i <cumle.length() ; i++) {

            if (cumle.charAt(i)==' ')
                continue;
            System.out.println(cumle.charAt(i));

        }
    }


}
