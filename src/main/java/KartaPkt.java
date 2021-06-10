public class KartaPkt extends Karta{
    private int IloscPkt;

    public KartaPkt() {
    }

    public KartaPkt(int iloscPkt) {
        IloscPkt = iloscPkt;
    }

    public int getIloscPkt() {
        return IloscPkt;
    }

    public Karta setIloscPkt(int IloscPkt) {
        this.IloscPkt = IloscPkt;
        return this;
    }

    @Override
    public String toString() {
        return "KartaPkt{" +
                "ID Karty='" + IDKarty + '\'' +
                "Ilosc Pkt='" + IloscPkt + '\'' +
                '}';
    }
}
