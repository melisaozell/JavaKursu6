package _Soru_çöz;
import java.util.Scanner;

public class soru3
{
    public static void main(String[] args) {
        /*reverseString isminde bir method oluşturun.
      Bu method bir String'i parametre olarak alsın.
      Ve bu method, girilen String'i tersten yazsın.
      Terste yazılmış halini yazdırınız.
      Örn: String = "Java'yı Seviyorum."
      Print: .muroyiveS ıy'avaJ*/

        Scanner oku=new Scanner(System.in);
        System.out.print("cümle giriniz");
        String cumle= oku.nextLine();

         reverseString(cumle);

    }

    public static void reverseString(String cumle){
        for (int i = cumle.length()-1; i >=0 ; i--) {
            System.out.print(cumle.charAt(i));
        }
        System.out.println();
    }

}
