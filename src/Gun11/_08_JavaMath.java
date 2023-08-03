package Gun11;

import java.util.Scanner;

public class _08_JavaMath
{
    public static void main(String[] args) {
        //  Math.max yöntemi ile girilen 3 sayıdan büyük olanını bulunuz

        Scanner oku=new Scanner(System.in);
        System.out.print("sayı giriniz=");
        int a= oku.nextInt();
        System.out.print("sayı giriniz=");
        int b=oku.nextInt();
        System.out.print("sayı giriniz=");
        int c= oku.nextInt();

        int enbABden=Math.max(a,b);
        int enb=Math.max(enbABden,c);
        System.out.println("enb = " + enb);
    }


}
