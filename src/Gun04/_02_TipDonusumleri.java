package Gun04;

public class _02_TipDonusumleri
{
    public static void main(String[] args) {
     byte ogrNot1=98;
     byte ogrNot2=97;
     byte ogrNot3=99;
     byte ogrNot4=100;
        System.out.println("ogrNot2 = " +ogrNot2 );

     //int           //byte
      int toplamNot=ogrNot1+ogrNot2+ogrNot3+ogrNot4;
        System.out.println("toplamNot="+ toplamNot);

        ogrNot2= (byte)toplamNot; //394ü byte alana atıyorum
        System.out.println("ogrNot2="+ ogrNot2);

        // int -> byte atınca dur bakalım dedi   (DARALTMA)
        // büyük hafıza ayrılmış bir alanı, küçük hafıza ayrılmış alana atma
        // işlemi var. veri kaybı ihtimali var




    }


}
