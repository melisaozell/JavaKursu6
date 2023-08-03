package Gun26._02_Ornek;

public class Person {

    String name;
    String surname;
    int age;
    //field properties,özellik

    public void bilgiYazdir() {
        System.out.println(this.name);
        System.out.println(this.surname);
        System.out.println(this.age);

    }
   //yazdırılırken otomatik çağırılıyor
    public String toString(){
       String yazılacakYazı=this.name+" "+this.surname+" "+this.age;
       return yazılacakYazı;
    }

    public  void getBirthYear(){
        System.out.println("Doğum yılı="+(2023-this.age));
    }

    public int getBirthYear2(){
        return 2023-this.age;
    }
}

