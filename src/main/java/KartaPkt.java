public class KartaPkt extends Karta{
    private int IloscPkt;

    public KartaPkt() {
    }

    public int getIloscPkt() {
        return IloscPkt;
    }

    public Karta setIloscPkt(int IloscPkt) {
        IloscPkt = IloscPkt;
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
