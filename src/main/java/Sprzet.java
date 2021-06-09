import java.util.List;

public class Sprzet {

    private int IdSprzetu;
    private String Producent;
    private double CenaSprzetu;
    private String TypSprzetu;
    private boolean DostepnoscSprzetu;

    public Sprzet(int id, String producent, double cenaSprzetu, String typSprzetu, boolean dostepnoscSprzetu) {
        this.IdSprzetu = id;
        Producent = producent;
        CenaSprzetu = cenaSprzetu;
        TypSprzetu = typSprzetu;
        DostepnoscSprzetu = dostepnoscSprzetu;
    }

    public Sprzet() {
    }

    public int getIdSprzetu() {
        return IdSprzetu;
    }

    public Sprzet setIdSprzetu(int idSprzetu) {
        IdSprzetu = idSprzetu;
        return this;
    }


    public int getId() {
        return IdSprzetu;
    }

    public Sprzet setId(int id) {
        this.IdSprzetu = id;
        return this;
    }

    public String getProducent() {
        return Producent;
    }

    public Sprzet setProducent(String producent) {
        Producent = producent;
        return this;
    }

    public double getCenaSprzetu() {
        return CenaSprzetu;
    }

    public Sprzet setCenaSprzetu(double cenaSprzetu) {
        CenaSprzetu = cenaSprzetu;
        return this;
    }

    public String getTypSprzetu() {
        return TypSprzetu;
    }

    public Sprzet setTypSprzetu(String typSprzetu) {
        TypSprzetu = typSprzetu;
        return this;
    }

    public boolean isDostepnoscSprzetu() {
        return DostepnoscSprzetu;
    }

    public Sprzet setDostepnoscSprzetu(boolean dostepnoscSprzetu) {
        DostepnoscSprzetu = dostepnoscSprzetu;
        return this;
    }

    @Override
    public String toString() {
        return "Sprzet{" +
                "id=" + IdSprzetu +
                ", Producent='" + Producent + '\'' +
                ", CenaSprzetu=" + CenaSprzetu +
                ", TypSprzetu='" + TypSprzetu + '\'' +
                ", DostepnoscSprzetu=" + DostepnoscSprzetu +
                '}';
    }
}
