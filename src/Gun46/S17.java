package Gun46;

public class S17 {
    public static void main(String[] args) {
        int[][]arr=new int[2][4];

        arr[0]=new int[]{1,3,5,7};
        arr[1]=new int[]{1,3};

        //arr in elemanları satırlardan (tek boyutlu dizelerden oluşuyor)

        for (int[]satir:arr) {
            for (int eleman:satir) {
                System.out.println(eleman + " ");

            }
            System.out.println();

        }
    }
}
