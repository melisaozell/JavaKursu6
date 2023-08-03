package Gun29._03_Protected.Paket2;

import Gun29._03_Protected.Paket1.Doctor;

public class OzelHastane {
    public static void main(String[] args) {

        Doctor doc1=new Doctor("Ayşe");
        doc1.hastaneAd="özel istanbul hastanesi";

        //Doctor doc2=new Doctor();
        // default sadece kendi paketinde ulaşılabilir
    }
}
