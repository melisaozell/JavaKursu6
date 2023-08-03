package Gun08;

public class _02_StringReplaceFirst
{
    public static void main(String[] args) {
        //replace: bir stringin içndeki karakter(leri) verilenle değiştirir.sadece ilkini

        String text="Merhaba Dünya";
        System.out.println("text = " + text);
        System.out.println("text.replaceFirst(a,e) = " + text.replaceFirst("a","e"));
        System.out.println("text.replaceFirst(ba,de) = " + text.replaceFirst("ba","de"));
        System.out.println("text.replaceFirst(Dünya,Java) = " + text.replaceFirst("Dünya","Java"));
        System.out.println("text.replaceFirst(a,'') = " + text.replaceFirst("a",""));
    }

}
