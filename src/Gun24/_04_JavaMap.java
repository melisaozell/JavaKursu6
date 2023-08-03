package Gun24;
import java.util.Map;
import java.util.HashMap;

public class _04_JavaMap
{
    public static void main(String[] args) {
        //bir kartvizit uygulamasını 2 kişi için yapınız

       Map<String,String>ugurKartVizit=new HashMap<>();
       ugurKartVizit.put("isim","Ugur Yılmaz");
       ugurKartVizit.put("email","ugur@gmail.com");
       ugurKartVizit.put("adres","çekmeköy/istanbul");
       ugurKartVizit.put("telefon","05054567889");

        System.out.println("ugurKartVizit.get(isim) = " + ugurKartVizit.get("isim"));
        System.out.println("ugurKartVizit.get(email) = " + ugurKartVizit.get("email"));

        Map<String,String>zaferKartVizit=new HashMap<>();
        zaferKartVizit.put("isim","zafer canlı");
        zaferKartVizit.put("email","zafer@gmail.com");
        zaferKartVizit.put("adres","ümraniye/istanbul");
        zaferKartVizit.put("telfon","05557890564");

        Map<String, Map<String,String> > kartvizitler=new HashMap<>();
        kartvizitler.put("ugur",ugurKartVizit);
        kartvizitler.put("zafer",zaferKartVizit);

        //zaferin adresi
        System.out.println( kartvizitler.get("zafer").get("adres"));
        //ugurun emaili
        System.out.println(kartvizitler.get("ugur").get("email"));

        for(Map.Entry<String,Map<String,String>>kv:kartvizitler.entrySet())//entrySet() =keys+value
        {
            System.out.println("kv="+kv);
            System.out.println("emailler="+kv.getValue().get("email"));
        }
    }


}
