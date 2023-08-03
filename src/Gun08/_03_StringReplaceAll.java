package Gun08;

public class _03_StringReplaceAll
{
    public static void main(String[] args) {
        //replace gibi çalışır . farklı kriter(regex) verilebiliyor
        //regex:regular expression/düzenli ifadeler
        // TODO(yapılacak):ödev:regex olarak neler yazılabiliyor googledan araştır

        String text="Merhaba Dünya";
        System.out.println("abn -> _ = " + text.replaceAll("[abn]","_"));
        // a,b,n leri _ yap -> Merh___ Dü_y_

        System.out.println("A-Z -> _ = " + text.replaceAll("[A-Z]","_"));
        // A Z ye kadar harfleri _ yap -> _erhaba _ünya

        System.out.println("0-9 arasınısil = " + text.replaceAll("[0-9]",""));
        // 0-9 arasını sil -> Merhaba Dünya

        System.out.println("0-9 dışındakileri sil = " + text.replaceAll("[^0-9]",""));
        // 0-9 un^ dışındakileri sil -> 1234
        // $500 -> "500" -> parseInt
        
        String para="$500";
        System.out.println("para.replaceAll(\"[^0-9]\",\"\") = " + para.replaceAll("[^0-9]",""));
    }


}
