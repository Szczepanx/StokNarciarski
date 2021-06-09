public class Klient {
    private int IDKlienta;
    private int IDKarty;
    private String ImieKlienta;
    private String NazwiskoKlienta;

    public Klient() {
    }

    public int getIDKlienta() {
        return IDKlienta;
    }

    public Klient setIDKlienta(int IDKlienta) {
        IDKlienta = IDKlienta;
        return this;
    }

    public int getIDKarty() {
        return IDKarty;
    }

    public Klient setIDKarty(int IDKarty) {
        IDKarty = IDKarty;
        return this;
    }

    public String getImieKlienta() {
        return ImieKlienta;
    }

    public Klient setImieKlienta(String ImieKlienta) {
        ImieKlienta = ImieKlienta;
        return this;
    }

    public String getNazwiskoKlienta() {
        return NazwiskoKlienta;
    }

    public Klient setNazwiskoKlienta(String NazwiskoKlienta) {
        NazwiskoKlienta = NazwiskoKlienta;
        return this;
    }

    @Override
    public String toString() {
        return "KartaPkt{" +
                "ID Klienta='" + IDKlienta + '\'' +
                "ID Karty='" + IDKarty + '\'' +
                "Imie Klienta='" + ImieKlienta + '\'' +
                "Nazwisko Klienta='" + NazwiskoKlienta + '\'' +
                '}';
    }
}
