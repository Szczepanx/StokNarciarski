public class Stok {
    private int IloscPkt;

    public Stok(){
    }

    public Stok(int iloscPkt) {
        IloscPkt = iloscPkt;
    }

    public int getIloscPkt() {
        return IloscPkt;
    }

    public Stok setIloscPkt(int IloscPkt) {
        this.IloscPkt = IloscPkt;
        return this;
    }
}
