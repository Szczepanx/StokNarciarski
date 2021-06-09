public class KartaCzas extends Karta {
    private int DataRoz;
    private int CzasRoz;

    public KartaCzas() {
    }

    public int getDataRoz() {
        return DataRoz;
    }

    public Karta setDataRoz(int DataRoz) {
        DataRoz = DataRoz;
        return this;
    }

    public int getCzasRoz() {
        return CzasRoz;
    }

    public Karta setCzasRoz(int CzasRoz) {
        CzasRoz = CzasRoz;
        return this;
    }

    @Override
    public String toString() {
        return "KartaPkt{" +
                "ID Karty='" + IDKarty + '\'' +
                "Data Roz='" + DataRoz + '\'' +
                "Czas Roz='" + CzasRoz + '\'' +
                '}';
    }
}
