package Gun02;

public class _05_EscapeCharacters
{
    public static void main(String[] args)
    {
        // \n   -> yeni satır aç , alt satıra geçer
        // \t   -> tab tuşuna bas , 2-3 harflik boşluk oluşturur
        // \b   -> backspace etkisi yapar, yan 1 karakter geri siler
        // \"   -> tırnak yazdırmak için kullanılır
        // \\   -> ekrana bir tane slash \ yazar
        // \r   -> satır başına git demek

        System.out.println("MerhabaDünya"); // MerhabaDünya
        System.out.println("Merhaba\nDünya");// Merhaba yazar, sonra alt satıra geçer Dünya yazar
        System.out.println("Merhaba\tDünya");// Merhaba   Dünya (tab tuşu kadar boşluk olur)
        System.out.println("Merhaba\"Dünya");// Merhaba"Dünya yazar
        System.out.println("Merhaba\\Dünya");// Merhaba/Dünya yazar
        System.out.println("Merhaba\rDünya");// Dünya  yazar sadece
        System.out.println("Merhaba\bDünya");// MerhabDünya

    }


}
