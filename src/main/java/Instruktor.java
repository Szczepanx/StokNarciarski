public class Instruktor {
    private int idInstruktora;
    private String ImieInstruktora;
    private String NazwiskoInstruktora;
    private String PoziomZaawansowania;
    private String TypInstruktora;
    private double CenaInstruktora;


    public Instruktor(int idInstruktora, String imieInstruktora, String nazwiskoInstruktora, String poziomZaawansowania, String typInstruktora, double cenaInstruktora) {
        this.idInstruktora = idInstruktora;
        ImieInstruktora = imieInstruktora;
        NazwiskoInstruktora = nazwiskoInstruktora;
        PoziomZaawansowania = poziomZaawansowania;
        TypInstruktora = typInstruktora;
        CenaInstruktora = cenaInstruktora;
    }

    public Instruktor() {
    }

    public int getIdInstruktora() {
        return idInstruktora;
    }

    public Instruktor setIdInstruktora(int idInstruktora) {
        this.idInstruktora = idInstruktora;
        return this;
    }

    public String getImieInstruktora() {
        return ImieInstruktora;
    }

    public Instruktor setImieInstruktora(String imieInstruktora) {
        ImieInstruktora = imieInstruktora;
        return this;
    }

    public String getNazwiskoInstruktora() {
        return NazwiskoInstruktora;
    }

    public Instruktor setNazwiskoInstruktora(String nazwiskoInstruktora) {
        NazwiskoInstruktora = nazwiskoInstruktora;
        return this;
    }

    public double getCenaInstruktora() {
        return CenaInstruktora;
    }

    public Instruktor setCenaInstruktora(double cenaInstruktora) {
        CenaInstruktora = cenaInstruktora;
        return this;
    }

    public String getPoziomZaawansowania() {
        return PoziomZaawansowania;
    }

    public Instruktor setPoziomZaawansowania(String poziomZaawansowania) {
        PoziomZaawansowania = poziomZaawansowania;
        return this;
    }

    public String getTypInstruktora() {
        return TypInstruktora;
    }

    public Instruktor setTypInstruktora(String typInstruktora) {
        TypInstruktora = typInstruktora;
        return this;
    }

    public double getCena() {
        return CenaInstruktora;
    }

    public Instruktor setCena(double cena) {
        CenaInstruktora = cena;
        return this;
    }

    @Override
    public String toString() {
        return "Instruktor{" +
                "ImieInstruktora='" + ImieInstruktora + '\'' +
                ", NazwiskoInstruktora='" + NazwiskoInstruktora + '\'' +
                ", PoziomZaawansowania='" + PoziomZaawansowania + '\'' +
                ", TypInstruktora='" + TypInstruktora + '\'' +
                ", CenaInstruktora=" + CenaInstruktora +
                '}';
    }
}
