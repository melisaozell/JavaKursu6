package Tools;

public class MyFunc {


    public static int enbSayiBul(int s1, int s2) {//metodun imzası
        return (s1 > s2 ? s1 : s2);
    }
    public static int rndTamSayi(int sinir){
        int rndSayi=(int)(Math.random()*(sinir+1));

        return rndSayi;
    }
}
