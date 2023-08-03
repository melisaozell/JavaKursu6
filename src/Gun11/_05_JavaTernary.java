package Gun11;

import java.util.Scanner;

public class _05_JavaTernary
{
    public static void main(String[] args) {
        // Otopark ücretleri : (Ternary operatörü ile yazınız)
        // 3 saate kadar 10 tl, 5 saate kadar 15 tl, 5 den buyukse 20 tl  dir.
        // kullanıcıdan kac saat kaldıgını alarak ucretı yazdırınız

        Scanner oku = new Scanner(System.in);
        System.out.print("otoparkta kaç saat kaldığınızı girin=");
        int saat = oku.nextInt();

        String ucretStr=(saat<=3)? "10tl":(saat<=5)? "15tl": "20tl";
        System.out.println(ucretStr);
    }


}
