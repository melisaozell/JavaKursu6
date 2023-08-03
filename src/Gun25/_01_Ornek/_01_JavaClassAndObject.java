package Gun25._01_Ornek;
//class-tiplerinin tanımlandığı yer

public class _01_JavaClassAndObject
{
 //metodların yazılabileceği yer

 public static void main(String[] args) { //basla

     // ana programın çalıştığı yer

     Ogrenci ogr1=new Ogrenci();
     ogr1.adi="ahmet";
     ogr1.soyadi="yılmaz";
     ogr1.Adresi="çekmeköy/istanbul";
     ogr1.sinifi=6;
     ogr1.okulNo=1001;
     ogr1.telefonu="05054567890";

     System.out.println("ogr1.telefonu = " + ogr1.telefonu);
     System.out.println("ogr1.okulNo = " + ogr1.okulNo);


 }//dur

   //metodların yazılabildiği yer

}
//class tiplerinin tanımlandığı yer
   class Ogrenci{
    int okulNo;
    String adi;
    String soyadi;
    int sinifi;
    String Adresi;
    String telefonu;
}
