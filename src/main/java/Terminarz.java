import java.sql.Time;
import java.util.Date;

public class Terminarz {
    private int IdWpisu;
    private int IdInstruktora;
    private Date Data;
    private Time CzasTrwaniaLekcji;

    public Terminarz(int idWpisu, int idInstruktora, Date data, Time czasTrwaniaLekcji) {
        IdWpisu = idWpisu;
        IdInstruktora = idInstruktora;
        Data = data;
        CzasTrwaniaLekcji = czasTrwaniaLekcji;
    }

    public Terminarz() {
    }

    public int getIdWpisu() {
        return IdWpisu;
    }

    public Terminarz setIdWpisu(int idWpisu) {
        IdWpisu = idWpisu;
        return this;
    }

    public int getIdInstruktora() {
        return IdInstruktora;
    }

    public Terminarz setIdInstruktora(int idInstruktora) {
        IdInstruktora = idInstruktora;
        return this;
    }

    public Date getData() {
        return Data;
    }

    public Terminarz setData(Date data) {
        Data = data;
        return this;
    }

    public Time getCzasTrwaniaLekcji() {
        return CzasTrwaniaLekcji;
    }

    public Terminarz setCzasTrwaniaLekcji(Time czasTrwaniaLekcji) {
        CzasTrwaniaLekcji = czasTrwaniaLekcji;
        return this;
    }

    @Override
    public String toString() {
        return "Terminarz{" +
                "IdWpisu=" + IdWpisu +
                ", IdInstruktora=" + IdInstruktora +
                ", Data=" + Data +
                ", CzasTrwaniaLekcji=" + CzasTrwaniaLekcji +
                '}';
    }
}
