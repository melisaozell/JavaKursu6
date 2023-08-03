package Gun07;

public class _08_StringStartsWith {
    public static void main(String[] args) {
        //startsWith : Bununla başlıyor mu?
        //sonuc: true veya false

     String cumle="Benim Adım Melisa";

        System.out.println("cumle.startsWith(B) = " + cumle.startsWith("b"));
        System.out.println("cumle.startsWith(A) = " + cumle.startsWith("A"));
        System.out.println("cumle.startsWith(Benim) = " + cumle.startsWith("Benim"));
    }
}
