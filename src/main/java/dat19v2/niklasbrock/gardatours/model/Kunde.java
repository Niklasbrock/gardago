package dat19v2.niklasbrock.gardatours.model;

public class Kunde {
    private String navn;
    private String tlf;

    public Kunde(String navn, String tlf) {
        this.navn = navn;
        this.tlf = tlf;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getTlf() {
        return tlf;
    }

    public void setTlf(String tlf) {
        this.tlf = tlf;
    }
}
