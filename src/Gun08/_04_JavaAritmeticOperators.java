package Gun08;

public class _04_JavaAritmeticOperators
{
    public static void main(String[] args) {
        int a=9;
        int b=5;

        System.out.println("Toplama işlemi");
        System.out.println("a+b = " + (a+b) );

        System.out.println("çıkarma işlemi");
        System.out.println("a-b = " + (a-b) );

        System.out.println("çarpma işlemi");
        System.out.println("axb = " + (a*b) );

        System.out.println("bölme işlemi");
        System.out.println("a/b = " + (a/b) );//1
        // normal sonuc 1.8, fakat bilgisayar 2 si de tam sayı tipinde ise, küsüratı atar
        // bu sebeple sonuç 1 olur, yuvarlama yapmaz, int/int = int
        // küsüratlı sonuç istiyorsan ,işleme girenlerden en az birisi double olmalı
        System.out.println("(double)a/b = " + ((double)a/b) );//1.8

        /************************************/

        System.out.println("modül işlemi: bölümünden kalan demek");
        System.out.println("a%b = " +(a%b) );//4
        System.out.println("b%a = " +(b%a) );//5
        
        int sonuc=145/10;// int/int ->int
        System.out.println("sonuc = " + sonuc);

    }

}
