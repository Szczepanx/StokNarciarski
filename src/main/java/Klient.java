public class Klient {
    private int IDKlienta;
    private int IDKarty;
    private String ImieKlienta;
    private String NazwiskoKlienta;


    public Klient() {
    }

    public Klient(int IDKlienta, int IDKarty, String imieKlienta, String nazwiskoKlienta) {
        this.IDKlienta = IDKlienta;
        this.IDKarty = IDKarty;
        ImieKlienta = imieKlienta;
        NazwiskoKlienta = nazwiskoKlienta;
    }

    public int getIDKlienta() {
        return IDKlienta;
    }

    public Klient setIDKlienta(int IDKlienta) {
        this.IDKlienta = IDKlienta;
        return this;
    }

    public int getIDKarty() {
        return IDKarty;
    }

    public Klient setIDKarty(int IDKarty) {
        this.IDKarty = IDKarty;
        return this;
    }

    public String getImieKlienta() {
        return ImieKlienta;
    }

    public Klient setImieKlienta(String ImieKlienta) {
        this.ImieKlienta = ImieKlienta;
        return this;
    }

    public String getNazwiskoKlienta() {
        return NazwiskoKlienta;
    }

    public Klient setNazwiskoKlienta(String NazwiskoKlienta) {
        this.NazwiskoKlienta = NazwiskoKlienta;
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
