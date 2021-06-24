import java.util.LinkedList;
import java.util.List;

public class Sprzet {

    private int IdSprzetu;
    private String Producent;
    private double CenaSprzetu;
    private String TypSprzetu;
    private boolean DostepnoscSprzetu;
    private List<Sprzet> listaSprzetow = new LinkedList<>();


    public List <Sprzet> naszaLista(){
        listaSprzetow.add(new Sprzet(1, "Salomon", 29.99, "Kask", true));
        listaSprzetow.add(new Sprzet(2, "Salomon", 50.00, "Narty", true));
        listaSprzetow.add(new Sprzet(3, "Salomon", 29.99, "Buty Narciarskie", true));
        listaSprzetow.add(new Sprzet(4, "Salomon", 35.00, "Buty Snowboardowe", true));
        listaSprzetow.add(new Sprzet(5, "Salomon", 60.00, "Snowboard", true));
        listaSprzetow.add(new Sprzet(6, "Rossignol", 29.99, "Kask", true));
        listaSprzetow.add(new Sprzet(7, "Rossignol", 45.00, "Narty", true));
        listaSprzetow.add(new Sprzet(8, "Rossignol", 24.99, "Buty Narciarskie", true));
        listaSprzetow.add(new Sprzet(9, "Rossignol", 14.99, "Kijki", true));

        return listaSprzetow;

    }


    public void dodajSprzet(Sprzet sprzet){
         this.listaSprzetow.add(sprzet);
    }

    public void wyswietlSprzet(){
        for (Sprzet sprzet : listaSprzetow) {
            System.out.println(sprzet.toString());
        }

    }



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

    public List<Sprzet> getListaSprzetow() {
        return listaSprzetow;
    }

    public Sprzet setListaSprzetow(List<Sprzet> listaSprzetow) {
        this.listaSprzetow = listaSprzetow;
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
