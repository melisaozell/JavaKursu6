package Gun27._01_Ornek;

public class Utility { //sınıfın,tipin adı

    public String getString(int sayi){
        return String.valueOf(sayi);

        //stringe çevir ver
    }
    // eğer bir metod nesnenin özelliklerini
    //kullanıyorsa nesne oluşturulmadan
    //kullanılamaz . Dolayısıyla STATİC olamaz
    //Nesne şart


    public static String getString2(int sayi){

        return String.valueOf(sayi);
        //stringe çevir ver
    }
    //Bağımsız metodlar yani STATİC metodlar herhangi
    //bir nesneye bağlı çalışması gerekmeyen metodlardır


}
