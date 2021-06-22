import java.sql.Time;
import java.util.Date;

public class Harmonogram {
    private int IdWpisu;
    private int IdInstruktora;
    private Date Data;
    private Time CzasWypozyczeniaSprzetu;

    public Harmonogram(int idWpisu, int idInstruktora, Date data, Time czasWypozyczeniaSprzetu) {
        IdWpisu = idWpisu;
        IdInstruktora = idInstruktora;
        Data = data;
        CzasWypozyczeniaSprzetu = czasWypozyczeniaSprzetu;
    }

    public Harmonogram() {
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
