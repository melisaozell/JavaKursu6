package _OnemliSorular_;

public class soru12
{
    public static void main(String[] args) {
         /*Bu şekilde bir String oluşturunuz.  "$12 $23 $10 $2 $5 $2"
        $ işaretlerini kaldırın ve sayıları toplayın.
        Sayıların toplamını yazdırın.*/

        String cumle="$12 $23 $10 $2 $5 $2";

        String[] kelimeler=cumle.split(" ");
        int toplam=0;

        for (int i = 0; i < kelimeler.length; i++) {

            kelimeler[i]=kelimeler[i].replace("$","");
            toplam=toplam+Integer.parseInt(kelimeler[i]);
        }
        System.out.println("toplam = " + toplam);
    }


}
