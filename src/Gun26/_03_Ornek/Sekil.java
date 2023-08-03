package Gun26._03_Ornek;

public class Sekil
{
    public static void main(String[] args) {

        Rectangle r=new Rectangle();

        r.lenght=5;
        r.width=4;

        r.cevre();
        r.alan();

        int cevre=r.cevre2();
        System.out.println("cevre2 = " + r.cevre2());

        int alan=r.alan2();
        System.out.println("alan2 = " + r.alan2());

        //metod ile değer ata
        r.degerAta(6,5);
        r.alan();
        r.cevre();
    }



}
