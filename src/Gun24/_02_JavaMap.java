package Gun24;

import java.util.HashMap;
import java.util.Map;

public class _02_JavaMap 
{
    public static void main(String[] args) {
        HashMap<Integer,String> hm=new HashMap<>(); //sıralı istersen TreeMap kullanılmalı
        hm.put(1001,"ısmet temur");
        hm.put(1002,"yusuf yılmaz");
        hm.put(2001,"melisa özel");
        hm.put(5001,"melike özel");
        hm.put(1002,"seda parça");

        System.out.println("hm.keySet() = " + hm.keySet());
        System.out.println("hm.values() = " + hm.values());

        for (Integer key:hm.keySet()) //foreach döngüsü
            System.out.print(key+"\t");

        System.out.println();

        for (String value:hm.values()) //foreach döngüsü
            System.out.print(value+"\t");

        System.out.println();

        System.out.println("hm = " + hm);

        for (Map.Entry<Integer,String>keyValue:hm.entrySet()){
            System.out.println(keyValue.getKey()+"-"+keyValue.getValue());
        }
    }
    
    
}
