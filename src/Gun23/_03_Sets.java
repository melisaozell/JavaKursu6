package Gun23;

import java.util.HashSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
public class _03_Sets {
    public static void main(String[] args) {
        HashSet<String> renkler = new HashSet<>();

        renkler.add("Red");
        renkler.add("Green");
        renkler.add("Blue");
        renkler.add("RED");
        renkler.add("Red");//Tekrar değer eklenmesi başarısız.

        System.out.println("renkler = " + renkler);

        //ekrana tek tek nasıl yazdırırım
        for (String eleman : renkler) {
            System.out.println("eleman = " + eleman);
        }
        //For each

        //Integer[] dizi={2,5,9,88,76,90};
        //for(Integer eleman:dizi)
        //System.out.println("eleman = " + eleman);

        //ArrayList<Integer>liste=new ArrayList<>(Arrays.asList(dizi));
        //for (Integer e:liste)
        //System.out.println("e = " + e);


        //set in kendi sırası nasıl ise onun aynısını verir
        Iterator gosterge = renkler.iterator();
        while (gosterge.hasNext()) { //sırada eleman var ise

            System.out.println("gosterge.next() = " + gosterge.next());
            //.Next göstergenin gösterdiği elemanı temsil ediyor

        }


    }
}
