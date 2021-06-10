public class Karta {
    protected int IDKarty;

    public Karta() {
    }

    public Karta(int IDKarty) {
        this.IDKarty = IDKarty;
    }

    public int getIDKarty() {
        return IDKarty;
    }

    public Karta setIDKarty(int IDKarty) {
        this.IDKarty = IDKarty;
        return this;
    }

    @Override
    public String toString() {
        return "Karta{" +
                "ID Karty='" + IDKarty + '\'' +
                '}';
    }
}