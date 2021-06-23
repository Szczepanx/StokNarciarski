import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Pracownik {

    private int IdPracownika;
    private String ImiePracownika;
    private String NazwiskoPracownika;
    private List<Pracownik> listaPracownikow = new LinkedList<>();




    public void calaListaPracownikow(){
        listaPracownikow.add(new Pracownik(1, "Jan", "Kowalski"));
        listaPracownikow.add(new Pracownik(2, "Andrzej", "Nowak"));
        listaPracownikow.add(new Pracownik(3, "Tadeusz", "Kaleta"));
        listaPracownikow.add(new Pracownik(4, "Stefan", "Drab"));}

    public void dodajPracownika(Pracownik pracownik){
        this.listaPracownikow.add(pracownik);
    }

    public void wyswietlPracownikow(){
        for (Pracownik pracownik : listaPracownikow) {
            System.out.println(pracownik.toString());
        }

    }

    public List<Klient> DodajNowegoKlienta(List <Klient> listaKlientow){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj Id Klienta:");
        int idKlienta = scanner.nextInt();
        System.out.println("Podaj ID karty :");
        int idKarty = scanner.nextInt();
        System.out.println("Podaj Imie Klienta :");
        String imieKlienta = scanner.next();
        System.out.println("Podaj Nazwisko Klienta :");
        String nazwiskoKlienta = scanner.next();
        listaKlientow.add(new Klient(idKlienta,idKarty,imieKlienta,nazwiskoKlienta));
        return listaKlientow;
    }

    public void PrzypiszKarteDoKlienta(){

    }
    public void PrzeprowadzPlatnosc(){

    }
    public void SprawdzDostepneSprzety(List<Sprzet> listaSprzetow){
        System.out.println(listaSprzetow.toString());
    }
    public void WypozyczSprzet(){

    }
    public void PrzyjmijZwrotSprzetu(){

    }
    public void ZarezerwujLekcjeUInstruktora(){

    }
    public void UsunWpisZTerminarza(){

    }
    public void ZobaczZarezerwowaneLekcje(){

    }
    public void PodliczKoszty(){

    }
    public void WybierzTypKarty(){

    }
    public void DodajDoZamowienia(){

    }

    public Pracownik(int idPracownika, String imiePracownika, String nazwiskoPracownika) {
        IdPracownika = idPracownika;
        ImiePracownika = imiePracownika;
        NazwiskoPracownika = nazwiskoPracownika;
    }

    public Pracownik() {
    }

    public int getIdPracownika() {
        return IdPracownika;
    }

    public Pracownik setIdPracownika(int idPracownika) {
        IdPracownika = idPracownika;
        return this;
    }

    public String getImiePracownika() {
        return ImiePracownika;
    }

    public Pracownik setImiePracownika(String imiePracownika) {
        ImiePracownika = imiePracownika;
        return this;
    }

    public String getNazwiskoPracownika() {
        return NazwiskoPracownika;
    }

    public Pracownik setNazwiskoPracownika(String nazwiskoPracownika) {
        NazwiskoPracownika = nazwiskoPracownika;
        return this;
    }

    public List<Pracownik> getListaPracownikow() {
        return listaPracownikow;
    }

    public Pracownik setListaPracownikow(List<Pracownik> listaPracownikow) {
        this.listaPracownikow = listaPracownikow;
        return this;
    }

    @Override
    public String toString() {
        return "Pracownik{" +
                "IdPracownika=" + IdPracownika +
                ", ImiePracownika='" + ImiePracownika + '\'' +
                ", NazwiskoPracownika='" + NazwiskoPracownika + '\'' +
                '}';
    }
}
