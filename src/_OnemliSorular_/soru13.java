package _OnemliSorular_;

public class soru13
{
    public static void main(String[] args) {
        // Bir String oluşturun : "Hello World"
        // Stringi tersten yazdırın ve print edin.
        // _Cevap böyle olmalı :  "dlroW olleH"_

        String cumle="Hello World";

        for (int i = cumle.length()-1; i >=0 ; i--) {
            System.out.print(cumle.charAt(i));

        }
        System.out.println();
    }


}
