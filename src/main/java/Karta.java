public class Karta {
    protected int IDKarty;

    public Karta() {
    }

    public int getIDKarty() {
        return IDKarty;
    }

    public Karta setIDKarty(int IDKarty) {
        IDKarty = IDKarty;
        return this;
    }

    @Override
    public String toString() {
        return "Karta{" +
                "ID Karty='" + IDKarty + '\'' +
                '}';
    }
}