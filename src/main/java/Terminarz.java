import java.sql.Time;
import java.time.Duration;
import java.time.LocalDate;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Terminarz {
    private int IdWpisu;
    private int IdInstruktora;
    private Date Data;
    private int CzasTrwaniaLekcji;
    private List<Terminarz> listaTerminarzy = new LinkedList<>();


    public void dodajTermin(Terminarz terminarz){
        this.listaTerminarzy.add(terminarz);
    }

    public void wyswietlTerminy(){
        for (Terminarz terminarz : listaTerminarzy) {
            System.out.println(terminarz.toString());
        }
    }



    public void calaListaTerminow(){

    }


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

    public List<Terminarz> getListaTerminarzy() {
        return listaTerminarzy;
    }

    public Terminarz setListaTerminarzy(List<Terminarz> listaTerminarzy) {
        this.listaTerminarzy = listaTerminarzy;
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
