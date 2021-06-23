public class KartaPkt extends Karta{
    private int IloscPkt;
    private int CenaPunktu;
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

    public int getCenaPunktu() {
        return CenaPunktu;
    }

    public void setCenaPunktu(int cenaPunktu) {
        CenaPunktu = cenaPunktu;
    }

    @Override
    public String toString() {
        return "KartaPkt{" +
                "ID Karty='" + IDKarty + '\'' +
                "Ilosc Pkt='" + IloscPkt + '\'' +
                '}';
    }
}
