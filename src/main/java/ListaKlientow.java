import java.util.LinkedList;
import java.util.List;

public class ListaKlientow {

    static List<Klient> listaKlientow = new LinkedList<>();
    public void dodajKlientaDoListy(Klient klient){
        listaKlientow.add(klient);


    }
}
