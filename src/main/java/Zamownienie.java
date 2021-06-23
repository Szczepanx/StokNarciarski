import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Zamownienie {
    private Date Data;
    private int IDKlienta;
    public List <Zamownienie> listaZamowien = new LinkedList<>();


    public void dodajZamowinie(Zamownienie zamownienie){
        this.listaZamowien.add(zamownienie);
    }

    public void wyswietlZamowienia(){
        for (Zamownienie zamownienie : listaZamowien) {
            System.out.println(zamownienie.toString());
        }
    }

    public Zamownienie(){

    }
    public Date getData() {
        return Data;
    }
    public Zamownienie setData(Date Data) {
        this.Data = Data;
        return this;
    }
    public int getIDKlienta() {
        return IDKlienta;
    }

    public Zamownienie setIDKlienta(int IDKlienta) {
        this.IDKlienta = IDKlienta;
        return this;
    }

    public List<Zamownienie> getListaZamowien() {
        return listaZamowien;
    }

    public Zamownienie setListaZamowien(List<Zamownienie> listaZamowien) {
        this.listaZamowien = listaZamowien;
        return this;
    }

    public void podliczKosztyKarty() {

    }
    public void podliczKosztyWynajmu() {

    }
    public void podliczKosztyInstruktora() {

    }
    public void podliczTotalKoszt() {

    }

}
