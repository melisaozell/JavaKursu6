package Gun08;

public class _01_StringReplace

{
    public static void main(String[] args) {
        //replace: bir stringin içndeki karakter(leri) verilenle değiştirir.hepsini

        String text="Merhaba Dünya";
        System.out.println("text = " + text);
        System.out.println("text.replace(a,e) = " + text.replace("a","e"));
        System.out.println("text.replace(ba,de) = " + text.replace("ba","de"));
        System.out.println("text.replace(Merhaba,hello) = " + text.replace("Merhaba","hello"));
        System.out.println("text.replace(a,'') = " + text.replace("a",""));
    }


}
