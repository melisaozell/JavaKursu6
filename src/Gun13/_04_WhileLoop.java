package Gun13;

public class _04_WhileLoop
{
    public static void main(String[] args) {
        //ekrana 5 kere merhaba yazdırın

        int sayac=1;

        while (sayac<=5) //iken yap: şartı yazıyoruz,dönme şartı
        {
            //tekrarlanacak adımlar buraya yazılıyor
            System.out.println("merhaba");
            sayac++; //2 3 4 5
        }
        System.out.println("program bitti");
    }


}
