package entity;

public class TamuEntity {
    protected String namaTamu, nik, notelp, alamat;
    protected int usia, noKamar;

    public TamuEntity(String namaTamu, int usia, String nik, String notelp, String alamat, int noKamar) {
        this.namaTamu = namaTamu;
        this.usia = usia;
        this.nik = nik;
        this.notelp = notelp;
        this.alamat = alamat;
        this.noKamar = noKamar;
    }

    public TamuEntity(){

    }

    public String getNamaTamu() {
        return namaTamu;
    }

    public String getNik() {
        return nik;
    }

    public String getNotelp() {
        return notelp;
    }

    public String getAlamat() {
        return alamat;
    }

    public int getUsia() {
        return usia;
    }

    public int getNoKamar(){
        return noKamar;
    }
}
