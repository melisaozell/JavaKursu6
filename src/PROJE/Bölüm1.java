package PROJE;

import java.util.Scanner;

public class Bölüm1 {
    public static void main(String[] args) {
        // 2-Süt eklemek istermisiniz ( evet veya hayır cevabı ile) sorusunu ve aynı şekilde
        // hatalı bir giriş yapıldığında programı bitirmeden tekrar aynı soruyu sorsun.

        Scanner oku = new Scanner(System.in);
        String cevap;

        do {
            System.out.print("süt eklemek ister misiniz=  (EVET veya HAYIR şeklinde cevaplayın)=");
            cevap = oku.nextLine();
            if (cevap.equalsIgnoreCase("EVET")) {
                System.out.print("süt ekleniyor");
                break;

            }
            else if (cevap.equalsIgnoreCase("HAYIR")){
                System.out.println("süt eklenmiyor");
                break;
            }
            else{
                System.out.println("Hatalı seçim,tekrardan seçin");
            }

        } while (!cevap.equalsIgnoreCase("EVET") && !cevap.equalsIgnoreCase("HAYIR")) ;




    }
}

