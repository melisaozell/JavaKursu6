package Gun30._01_StaticVariables.Ornek2;

import Gun30._01_StaticVariables.Ornek2.Student;

public class School {
    public static void main(String[] args) {

        Student ogr1=new Student(1,"ismet temur");
        Student ogr2=new Student(2,"mehmet yılmaz");
        Student ogr3=new Student(3,"beyza demir");

        //problem:hem id yi takip etmek zorundyım
        //hem de hata olasılığı yüksek

        Student ogr10=new Student("ismet");
        Student ogr11=new Student("mehmet");
        Student ogr12=new Student("ayşe");

        System.out.println("ogr10 = " + ogr10);
        System.out.println("ogr11 = " + ogr11);
        System.out.println("ogr12 = " + ogr12);
    }
}
