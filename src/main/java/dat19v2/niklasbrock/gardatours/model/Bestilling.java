package dat19v2.niklasbrock.gardatours.model;

import javax.validation.constraints.Max;

public class Bestilling {
    private Kunde kunde;
    @Max(1)
    private Ruter rute;
    @Max(10)
    private int antal;
    private int pris;

    public Bestilling(Kunde kunde, @Max(1) Ruter rute, @Max(10) int antal) {
        this.kunde = kunde;
        this.rute = rute;
        this.antal = antal;
        this.pris = antal * rute.getPris();
    }
}
