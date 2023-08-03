package Gun30;

public class KimlerDinledi {
    
    int a;
    static int b=0;

    void artır(){
        a++;
        b++;
    }

    public static void main(String[] args) {
        KimlerDinledi kd1=new KimlerDinledi();
        kd1.a=5;
        
        KimlerDinledi kd2=new KimlerDinledi();
        kd2.a=7;
        
        //1. soru: a nın değeri şuan da kaçtır?
        //Burada her nesnenin a sı var ve kd1 in 5, kd2 nin ise 7 değeri var
        System.out.println("kd1.a = " + kd1.a);
        System.out.println("kd2.a = " + kd2.a);

        //2. soru: b nin değeri kaçtır? tek bir değer vardır o da sıfırdır
        kd1.artır();//kd1.a ->6, b->1
        kd2.artır();//kd2.a ->8, b->2

        //3. soru a ve b nin değerleri kaçtır
        System.out.println("kd1.a = " + kd1.a);
        System.out.println("kd2.a = " + kd2.a);
        System.out.println("b = " + b);

    }
}
