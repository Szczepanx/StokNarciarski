import java.util.LinkedList;
import java.util.List;

public class KartaPkt extends Karta{
    private int IloscPkt;


    List<KartaPkt> karty = new LinkedList<>();



    public void dodajKarte(KartaPkt kartaPkt){
        this.karty.add(kartaPkt);
    }

    public void wyswietKarty(){
        for (KartaPkt kartaPkt: karty) {
            System.out.println(karty.toString());
        }

    }

    public void calaListaKart(){

    }


    public KartaPkt() {
    }


    public KartaPkt(int IDKarty, int iloscPkt) {
        super(IDKarty);
        IloscPkt = iloscPkt;
    }

    public int getIloscPkt() {
        return IloscPkt;
    }

    public Karta setIloscPkt(int IloscPkt) {
        this.IloscPkt = IloscPkt;
        return this;
    }

 list
    public double cenaZaKarte(int iloscPunktow){
        double cena = iloscPunktow*2.15;
        return cena;

    }

    @Override
    public String toString() {
        return "KartaPkt{" +
                "ID Karty='" + IDKarty + '\'' +
                "Ilosc Pkt='" + IloscPkt + '\'' +
                '}';
    }
}
