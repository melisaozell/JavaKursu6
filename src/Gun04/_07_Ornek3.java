package Gun04;

public class _07_Ornek3
{
    public static void main(String[] args) {
        // Stirng olarak verilen 3 notun ("82","95","56") ortalamasını bulunuz

        String not1="82";
        String not2="95";
        String not3="56";

        double Snot1=Double.parseDouble(not1);
        double Snot2=Double.parseDouble(not2);
        double Snot3=Double.parseDouble(not3);

        double ortalama=(Snot1+Snot2+Snot3)/3;

        System.out.println("ortalama = " + ortalama);

    }


}
