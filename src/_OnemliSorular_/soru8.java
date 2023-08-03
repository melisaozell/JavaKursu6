package _OnemliSorular_;

public class soru8
{
    public static void main(String[] args) {
        // 5 tv kanalı ismini bir diziye doldurunuz. trtr, kanald,atv,fox,habertürk
        // Daha sonra random olarak bir tanesini seçip ekrana seçileni yazıdırnız.

        String[] tvler = {"trt", "kanald", "atv", "fox", "habertürk" };
        String randomdanGelenKanal = ("");

        for (int i = 0; i < tvler.length; i++) {
            int rndIndex = (int) (Math.random() * (tvler.length));

            if (tvler[rndIndex].contains(randomdanGelenKanal)) {
                System.out.println("randomdanGelenKanal = " + tvler[rndIndex]);


            }
        }
    }


}
