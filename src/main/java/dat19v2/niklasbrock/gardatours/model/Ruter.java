package dat19v2.niklasbrock.gardatours.model;

public class Ruter {
    private String navn;
    private int pris;
    private String beskrivelse;

    public Ruter(String navn, int pris, String beskrivelse) {
        this.navn = navn;
        this.pris = pris;
        this.beskrivelse = beskrivelse;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public int getPris() {
        return pris;
    }

    public void setPris(int pris) {
        this.pris = pris;
    }

    public String getBeskrivelse() {
        return beskrivelse;
    }

    public void setBeskrivelse(String beskrivelse) {
        this.beskrivelse = beskrivelse;
    }
}
