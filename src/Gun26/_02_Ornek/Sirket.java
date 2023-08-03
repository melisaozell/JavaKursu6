package Gun26._02_Ornek;
import java.util.ArrayList;

public class Sirket
{   // 1- Adım : Person isimli bir class tanımlayınız : name, surname, age
    // 2- Adım : main de 2 tane bu sınıftan nesne oluşturup deger atayınız.
    // 3- Adım : bu değerleri yazdırınız
    // 4- Adım :  getBirthYear isminde Person a ait bir metod yazınız,
    //            çalıştığında kişinin doğum yılını versin.

    public static void main(String[] args) {

        Person cal1=new Person();
        cal1.name="Senol";
        cal1.surname="Doğan";
        cal1.age=20;

        Person cal2=new Person();
        cal2.name="Melisa";
        cal2.surname="Özel";
        cal2.age=22;

        //1.yöntem
        System.out.println("cal1.name = " + cal1.name);
        System.out.println("cal1.surname = " + cal1.surname);
        System.out.println("cal1.age = " + cal1.age);

        //2.yöntem
        BilgiYazdır(cal1);
        BilgiYazdır(cal2);

        //3.yöntem
        cal1.bilgiYazdir();
        cal2.bilgiYazdir();

        //4.yöntem
       // ArrayList<Integer>list=new ArrayList<>();
       // System.out.println("list = " + list);

        System.out.println("cal1 = " + cal1);
        System.out.println("cal2 = " + cal2);

        cal1.getBirthYear();
        cal2.getBirthYear();

        System.out.println("cal1 doğum tarihi = " + cal1.getBirthYear2());
        System.out.println("cal2 doğum tarihi = " + cal2.getBirthYear2());
    }
    public static void BilgiYazdır(Person cal){

        System.out.println("cal.name = " + cal.name);
        System.out.println("cal.surname = " + cal.surname);
        System.out.println("cal.age = " + cal.age);
    }



}
