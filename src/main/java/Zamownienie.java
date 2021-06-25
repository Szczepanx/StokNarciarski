import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.*;

public class Zamownienie {
    private Date Data;
    private int IDKlienta;
    public List <Zamownienie> listaZamowien = new LinkedList<>();

    private static Klient klient;

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
    public int findIdKartyKlienta(
            int IDKlienta, List<Klient> listaKlientow) {

        for (Klient klient : listaKlientow) {
            if (klient.getIDKlienta()==IDKlienta) {
                System.out.println(IDKlienta);
                return IDKlienta;
            }
        }
        return -1;
    }

    public float podliczKosztyKarty(int IDKarty) {
        System.out.println(findIdKartyKlienta(IDKlienta, klient.getListaKlientow()));
        return 1;
    }
    public float podliczKosztyWynajmu(int IDKarty) {
        return 1;
    }
    public float podliczKosztyInstruktora(int IDKarty) {
        return 1;
    }
    public void podliczTotalKoszt(int IDKlienta) {
        int IDKartyDoZamowienia = findIdKartyKlienta(IDKlienta, klient.getListaKlientow());
        System.out.println(IDKartyDoZamowienia);
        float cenaZaKarte = podliczKosztyKarty(IDKartyDoZamowienia);
        float cenaZaWynajem = podliczKosztyWynajmu(IDKartyDoZamowienia);
        float cenaZaLekcje = podliczKosztyInstruktora(IDKartyDoZamowienia);
    }

}
