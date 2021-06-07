public class Pracownik {

    private int IdPracownika;
    private String ImiePracownika;
    private String NazwiskoPracownika;

    public void DodajNowegoKlienta(){

    }

    public void PrzypiszKarteDoKlienta(){

    }

    public void PrzeprowadzPlatnosc(){

    }

    public void SprawdzDostepneSprzety(){

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

    @Override
    public String toString() {
        return "Pracownik{" +
                "IdPracownika=" + IdPracownika +
                ", ImiePracownika='" + ImiePracownika + '\'' +
                ", NazwiskoPracownika='" + NazwiskoPracownika + '\'' +
                '}';
    }
}
