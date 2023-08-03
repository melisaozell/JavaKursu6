package Gun31._01_Konu;

enum Aylar{
    Tanımsız,OCAK,SUBAT,MART,NİSAN,MAYIS,HAZIRAN,
    TEMMUZ,AĞUSTOS,EYLÜL,EKİM,KASIM,ARALIK
}
public class Ornek1Cozum {

    //enumaration:numaralandırılmıs simgeler
    public static void main(String[] args) {
        Aylar ay=Aylar.MAYIS;

        switch (ay){
            case SUBAT: System.out.println(28);break;
            case OCAK:
            case MART:
            case MAYIS:
            case TEMMUZ:
            case EKİM:
            case ARALIK: System.out.println(31);break;
            case NİSAN:
            case HAZIRAN:
            case KASIM:
            case EYLÜL: System.out.println(30);break;

        }
        if (ay==Aylar.MAYIS)
            System.out.println("zam ayı");

        System.out.println("ay="+ay);// toString SİMGE MAYIS
        System.out.println("ay.name() = " + ay.name()); // SİMGE MAYIS
        System.out.println("ay.ordinal() = " + ay.ordinal()); //SİMGE NİN İNDEXİ 5

        for (Aylar a:Aylar.values()) {
            System.out.println(a.name()+"-"+a.ordinal());

        }
        // Yazılım dillerinde enum, enumaration ve enum sabitleri
        // olarak adladırılmaktadır. Tanımlanan değişkenlerin
        // sabit değer alması için kullanılır. Tanımlanan
        // bu sabit değerler bir grup oluşturur. Erişilmesi,
        // yönetilmesi ve anlaşılması kolay hale gelir.
    }



}
