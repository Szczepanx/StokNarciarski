import java.sql.Time;
import java.time.Duration;
import java.time.LocalDate;
import java.util.Date;

public class Terminarz {
    private int IdWpisu;
    private int IdInstruktora;
    private Date Data;
    private int CzasTrwaniaLekcji;

    public Terminarz(int idWpisu, int idInstruktora, Date data, int czasTrwaniaLekcji) {
        IdWpisu = idWpisu;
        IdInstruktora = idInstruktora;
        Data = data;
        CzasTrwaniaLekcji = czasTrwaniaLekcji;
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

    public int getCzasTrwaniaLekcji() {
        return CzasTrwaniaLekcji;
    }

    public Terminarz setCzasTrwaniaLekcji(int czasTrwaniaLekcji) {
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
