package Gun20;

public class _02_JavaMethod {
    public static void main(String[] args) {
        System.out.println("Merhaba Dünya ");
        System.out.println("Merhaba Dünya ");

        merhabaYaz();//giden yok,gelen yok.
        toplamYaz(4, 5);//giden var,dönen yok
        int enb = Math.max(4, 5);//giden var,dönen var(eşitleyebiliyorsak dönen var)
        double rndSayi = Math.random();//giden yok,dönen var(eşitleyebiliyorsak dönen var)

        /**************************************/
        enbBulYaz(4, 5);
        enb = enbBulYazGeriGonder(4, 5);
        System.out.println("enb = " + enb);

        //javaya ait herhangi bir metodun üzerine CTRL ile tıklattığımızda
        //metodun içeriğini görebiliriz.

    }

    public static int enbBulYazGeriGonder(int s1, int s2)//sırasıyla eşleşiyor
    {//void:tipSİZ demek,yani returnu yok,yani returnSÜZ
        int enb = 0;
        if (s1 > s2)
            enb = s1;//return s1;
        else
            enb = s2;//return s2;

        return enb;//dönecek elemanın tipini metodun adından önce yazıyoruz.
    }

    public static void enbBulYaz(int s1, int s2)//sırasıyla eşleşiyor
    {
        if (s1 > s2)
            System.out.println("s1=" + s1);
        else
            System.out.println("s2=" + s2);
    }

    public static void toplamYaz(int s1, int s2) // sırasıyle eşleşiyor
    {
        System.out.println("toplam=" + (s1 + s2));
    }

    public static void merhabaYaz() {
        System.out.println("Merhaba Dünya");

    }
}
