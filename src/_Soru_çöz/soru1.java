package _Soru_çöz;
import java.util.Scanner;


public class soru1
{
    public static void main(String[] args) {
        /*Ismi **randomNum** olan bir method oluşturun.
        Parametre olarak **int max** almalı.
        Bu method, 0 ile max arasında random bir değer döndürmelidir.
        Random numarayı döndürünüz.*/

        Scanner oku=new Scanner(System.in);
        System.out.print("max değeri girin=");
        int MaxSayi=randomNum(oku.nextInt());
        System.out.println("random sayi = " + MaxSayi);


        }



       public static int randomNum(int max){
        return (int)(Math.random()*max);
       }


    }



