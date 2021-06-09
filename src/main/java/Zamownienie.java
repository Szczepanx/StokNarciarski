import java.sql.Time;
import java.util.Date;

public class Zamownienie {
    private Date Data;
    private int IDKlienta;

    public Zamownienie(){

    }

    public int getData() {
        return Data;
    }

    public Zamownienie setData(int Data) {
        Data = Data;
        return this;
    }
    public int getIDKlienta() {
        return IDKlienta;
    }

    public Zamownienie setIDKlienta(int IDKlienta) {
        IDKlienta = IDKlienta;
        return this;
    }

    public podliczKosztyKarty() {

    }
    public podliczKosztyWynajmu() {

    }
    public podliczKosztyInstruktora() {

    }
    public podliczTotalKoszt() {

    }

}
