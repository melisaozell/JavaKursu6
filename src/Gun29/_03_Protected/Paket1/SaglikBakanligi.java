package Gun29._03_Protected.Paket1;

public class SaglikBakanligi {
    public static void main(String[] args) {
        Doctor doc1=new Doctor();
        doc1.hastaneAd="Numune Hastanesi";
        doc1.adi="ismet";
        doc1.bolumu="dahiliye";
        // doc1.sicilNo private

        Doctor doc2=new Doctor("Mehmet");
    }
}
