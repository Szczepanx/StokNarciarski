import java.util.LinkedList;
import java.util.List;

public class Klient {
    private int IDKlienta;
    private int IDKarty;
    private String ImieKlienta;
    private String NazwiskoKlienta;
    private List<Klient> listaKlientow = new LinkedList<>();



    public void dodajKlienta(Klient klient){
        this.listaKlientow.add(klient);
    }

    public void wyswietlKlientow(){
        for (Klient klient : listaKlientow) {
            System.out.println(klient.toString());
        }

    }

    public void calaListaKlientow(){
        listaKlientow.add(new Klient(1, 1, "Jan", "Kowalski"));
    }


    public Klient() {
    }

    public Klient(int IDKlienta, int IDKarty, String imieKlienta, String nazwiskoKlienta) {
        this.IDKlienta = IDKlienta;
        this.IDKarty = IDKarty;
        ImieKlienta = imieKlienta;
        NazwiskoKlienta = nazwiskoKlienta;
    }

    public List<Klient> getListaKlientow() {
        return listaKlientow;
    }

    public Klient setListaKlientow(List<Klient> listaKlientow) {
        this.listaKlientow = listaKlientow;
        return this;
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
