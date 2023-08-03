package Gun07;

public class _09_StringEndsWith
{
    public static void main(String[] args) {
        //endswith: verilen karakter(ler) ile bitiyor mu
        //sonuc true veya false yani boolean döner

        String text="merhaba dünya";
        System.out.println("text.endsWith(ya) = " + text.endsWith("ya"));//true
        System.out.println("text.endsWith(n) = " + text.endsWith("n"));//false
        System.out.println("text.endsWith(A) = " + text.endsWith("A"));//false
        System.out.println("text.endsWith(dünya) = " + text.endsWith("dünya"));//true
    }


}
