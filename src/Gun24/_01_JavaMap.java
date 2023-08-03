package Gun24;

import java.util.HashMap;

public class _01_JavaMap
{
    public static void main(String[] args) {
        //Set -> HashSet , LinkedHashSet , TreeSet
        //Map -> HashMap , LinkedHashSet , TreeMap
        //Map -> Anahtar + Set -> Anahtarlı Set (Tekrar eden değer yok)

        //anahtarın tipi Integer , değerin tipi String
        HashMap<Integer,String> hm=new HashMap<>(); //sıralı istersen TreeMap kullanılmalı
        hm.put(1001,"ısmet temur");
        hm.put(1002,"yusuf yılmaz");
        hm.put(2001,"melisa özel");
        hm.put(5001,"melike özel");
        hm.put(1002,"seda parça");

        System.out.println("hm = " + hm);
        System.out.println("hm.get(2001) = " + hm.get(2001));
        System.out.println("hm.get(5001) = " + hm.get(5001));

        System.out.println("hm.containsKey(2001) = " + hm.containsKey(2001));
        System.out.println("hm.containsKey(5002) = " + hm.containsKey(5002));

        System.out.println("hm.keySet() = " + hm.keySet());//keyleri toplu verir
        System.out.println("hm.values() = " + hm.values());//değerleri toplu verir

        hm.remove(5001);
        System.out.println("hm = " + hm);
    }
}
