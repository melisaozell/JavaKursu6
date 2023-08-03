package Gun27._03_Ornek;
import java.util.ArrayList;
public class Student {
    String name; //2.adım
    int maxSaat;
    ArrayList<Lesson>dersleri=new ArrayList<>();

    public void dersYazdır(){
        System.out.println("\n*** Transkript***");
        System.out.println("Sayın, " + this.name);
        System.out.println("Aldığınız dersler aşağıdadır.");
        for (Lesson d:this.dersleri)
            System.out.println(d.name+"-"+d.saat);


    }
    public static void universiteKuralları(){ //6.adım
        System.out.println("Kural1: Çaysız ve üzümsüz derse gelme");
        System.out.println("Kural2: Uykunu mutlaka al");
        System.out.println("Kural3: Her zaman dinç , dinamik ol");
    }

}
