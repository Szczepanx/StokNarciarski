import java.sql.Time;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Harmonogram {
    private int IdWpisu;
    private int IdInstruktora;
    private Date Data;
    private Time CzasWypozyczeniaSprzetu;
    private List<Harmonogram> listaHarmonogramu = new LinkedList<>();

    public void dodajHarmonogram(Harmonogram harmonogram){
        this.listaHarmonogramu.add(harmonogram);
    }

    public void wyswietlHarmonogram(){
        for (Harmonogram harmonogram : listaHarmonogramu) {
            System.out.println(harmonogram.toString());
        }

    }

    public void calaListaHarmonogramu(){

    }

    public Harmonogram(int idWpisu, int idInstruktora, Date data, Time czasWypozyczeniaSprzetu) {
        IdWpisu = idWpisu;
        IdInstruktora = idInstruktora;
        Data = data;
        CzasWypozyczeniaSprzetu = czasWypozyczeniaSprzetu;
    }

    public Harmonogram() {
    }

    public List<Harmonogram> getListaHarmonogramu() {
        return listaHarmonogramu;
    }

    public Harmonogram setListaHarmonogramu(List<Harmonogram> listaHarmonogramu) {
        this.listaHarmonogramu = listaHarmonogramu;
        return this;
    }

    public int getIdWpisu() {
        return IdWpisu;
    }

    public void setIdWpisu(int idWpisu) {
        IdWpisu = idWpisu;
    }

    public int getIdInstruktora() {
        return IdInstruktora;
    }

    public void setIdInstruktora(int idInstruktora) {
        IdInstruktora = idInstruktora;
    }

    public Date getData() {
        return Data;
    }

    public void setData(Date data) {
        Data = data;
    }

    public Time getCzasWypozyczeniaSprzetu() {
        return CzasWypozyczeniaSprzetu;
    }

    public void setCzasWypozyczeniaSprzetu(Time czasWypozyczeniaSprzetu) {
        CzasWypozyczeniaSprzetu = czasWypozyczeniaSprzetu;
    }

    @Override
    public String toString() {
        return "Harmonogram{" +
                "IdWpisu=" + IdWpisu +
                ", IdInstruktora=" + IdInstruktora +
                ", Data=" + Data +
                ", CzasWypozyczeniaSprzetu=" + CzasWypozyczeniaSprzetu +
                '}';
    }
}
