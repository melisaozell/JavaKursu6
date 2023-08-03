package Gun06;

public class _04_StringCharAt
{
    public static void main(String[] args) {
        //istenilen noktadaki karakteri verir
        //                      111
        //            0123456789012
        String cumle="merhaba dünya"; //uzunluğu=13  0-12 index
        System.out.println("uzunluk = " + cumle.length());
        
        char ilkharf=cumle.charAt(0);//0 daki karakteri ver
        System.out.println("ilkharf = " + ilkharf);
        
    }


}
