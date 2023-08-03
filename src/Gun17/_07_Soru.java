package Gun17;
import java.util.Arrays;
import java.util.Scanner;

public class _07_Soru
{
    public static void main(String[] args) {
        // 10 elemanlı bir diziyi random(10 dahil sayılarla) doldurduktan sonra,
        // kullanıcının  gireceği bir rakamı arattırınız.
        // bu rakam var ise indexini yazıdırnız.

        int[]dizi=new int[10];

         //diziyi random sayılarla doldur
        for (int i = 0; i < dizi.length; i++) {
            dizi[i]=(int)(Math.random()*10);
        }
        System.out.println("dizi="+Arrays.toString(dizi));
        //kullanıcıdan sayı al
        Scanner oku=new Scanner(System.in);
        System.out.print("sayi giriniz=");
        int sayi= oku.nextInt();

        //sayının olup olmadığını kontrol et
        boolean varMi=false;

        for (int i = 0; i < dizi.length; i++) {
            if (sayi==dizi[i]){
                System.out.println("rakam" +i+ ".indexte bulundu");
                varMi=true;
            }





        }



    }


}
