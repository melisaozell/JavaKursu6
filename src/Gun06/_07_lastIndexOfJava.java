package Gun06;

public class _07_lastIndexOfJava
{
    public static void main(String[] args) {
        //indexOf:baştan itibaren arayıp oda numarasını dönüştürür
        //lastindexof:sondan itibaren aramaya başlar

        //            0123456789012
        String cumle="merhaba dünya";
        System.out.println("cumle.indexof(a) = " + cumle.indexOf("a"));//4
        System.out.println("cumle.lastindexof(a) = " + cumle.lastIndexOf("a"));//12
          //index her zaman tektir, arama yönüne göre değişmez
        System.out.println("cumle.lastindexof(a,8) = " + cumle.lastIndexOf("a",8));
        //sondan gelerek aramaya 8 nolu odadan başla
    }


}
