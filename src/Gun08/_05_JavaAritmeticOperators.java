package Gun08;

public class _05_JavaAritmeticOperators
{
    public static void main(String[] args) {
        int sayac=0;

        sayac=sayac+1; //sayacın değerini 1 arttırdık :1
        sayac++ ; //sayacın değerini 1 arttırdık:2
        ++sayac; //sayacın değerini 1 arttırdık:3

        sayac=sayac-1; //sayacın değerini 1 azaltır :2
        sayac-- ; //sayacın değerini 1 azaltır:1
        --sayac ; //sayacın değerini 1 azaltır:0

        System.out.println("sayac = " + sayac);

        /**********************************/
        int toplam=0 , sayi=0;

        //işlemden önce :toplam=0, sayı=0
        toplam=5+sayi;
        //toplama işlemden sonra : toplam=5,sayi=0;

        /************************************/
        toplam=0; sayi=0;

        //toplama işleminden önce toplam=0, sayi=0
        toplam=5 + sayi++; //önce toplam=5+sayi; sonra sayi++
        //toplama işleminden sonra : toplam=5, sayi=1

        /**********************************/
        toplam=0; sayi=0;

        //toplama işleminden önce : toplam=0 , sayi=1
        toplam = 5 + ++sayi; // önce sayi ++sayi; sonra toplam=5+sayi
        //işlemden sonra : toplam=6, sayi=1



    }

}
