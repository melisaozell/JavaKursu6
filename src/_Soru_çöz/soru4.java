package _Soru_çöz;
import java.util.Scanner;

public class soru4
{
    public static void main(String[] args) {
        /*adı  reverseWord olan bir method oluşturun
        Bu methodun String olarak bir parametresi olmalıdır
        Ve bu cümledeki kelimelerle tersine çevirmeli

 Ters halini yazdırın.
 Örnek 1 :
 Dize: Java yazın
 dönüş şöyle olmalıdır:  yazın Java*/

        Scanner oku=new Scanner(System.in);
        System.out.print("cümle giriniz");
        String cumle=oku.nextLine();

        reverseWord(cumle);



    }
    public static void reverseWord(String cumle){
        String[]kelimeler=cumle.split(" ");

    for (int i = kelimeler.length-1; i >=0 ; i--) {
        System.out.print(kelimeler[i]+" ");

    }

}

}
