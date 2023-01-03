package entity;

public class KamarEntity {
    private String statusKamar, tipeKamar;
    private int noKamar;

    public KamarEntity(int noKamar, String tipeKamar, String statusKamar) {
        this.statusKamar = statusKamar;
        this.tipeKamar = tipeKamar;
        this.noKamar = noKamar;
    }

    public String getStatusKamar() {
        return statusKamar;
    }

    public String getTipeKamar() {
        return tipeKamar;
    }

    public int getNoKamar() {
        return noKamar;
    }

    public void setStatuskamar(String type){
        if (type == "checkin"){
            this.statusKamar = "booked\n";
        }
        else if (type == "checkout") {
            this.statusKamar = "tersedia\n";
        }
    }
}
