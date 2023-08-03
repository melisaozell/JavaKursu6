package _Soru_çöz;
import java.util.Scanner;
import java.util.Arrays;

public class soru5
{
    public static void main(String[] args) {
        //5- Girilen bir diziyi tersten yazdıran bir metod yazınız.

        int[]dizi=new int[5];
        Scanner oku=new Scanner(System.in);
        for (int i = 0; i < dizi.length; i++) {
            System.out.print("sayi girin=");
            dizi[i]= oku.nextInt();

        }

        reversefunc(dizi);

        }
        public static void reversefunc(int[]dizi){
            for (int i = dizi.length-1; i >=0 ; i--) {
                System.out.print(dizi[i]+" ");

            }

        }




    }



