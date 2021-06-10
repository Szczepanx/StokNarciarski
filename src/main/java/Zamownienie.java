import java.util.Date;

public class Zamownienie {
    private Date Data;
    private int IDKlienta;

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

    public void podliczKosztyKarty() {

    }
    public void podliczKosztyWynajmu() {

    }
    public void podliczKosztyInstruktora() {

    }
    public void podliczTotalKoszt() {

    }

}
