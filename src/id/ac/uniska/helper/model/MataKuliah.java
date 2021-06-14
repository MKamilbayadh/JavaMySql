package id.ac.uniska.helper.model;

public class MataKuliah {
    int idMakul;
    String namaMakul, singkatMakul, namaDosen, kontakDosen;
    boolean aktif;

    public MataKuliah(int idMakul, String namaMakul, String singkatMakul, String namaDosen, String kontakDosen, boolean aktif) {
        this.idMakul = idMakul;
        this.namaMakul = namaMakul;
        this.singkatMakul = singkatMakul;
        this.namaDosen = namaDosen;
        this.kontakDosen = kontakDosen;
        this.aktif = aktif;
    }

    public int getIdMakul() {
        return idMakul;
    }

    public void setIdMakul(int idMakul) {
        this.idMakul = idMakul;
    }

    public String getNamaMakul() {
        return namaMakul;
    }

    public void setNamaMakul(String namaMakul) {
        this.namaMakul = namaMakul;
    }

    public String getSingkatMakul() {
        return singkatMakul;
    }

    public void setSingkatMakul(String singkatMakul) {
        this.singkatMakul = singkatMakul;
    }

    public String getNamaDosen() {
        return namaDosen;
    }

    public void setNamaDosen(String namaDosen) {
        this.namaDosen = namaDosen;
    }

    public String getKontakDosen() {
        return kontakDosen;
    }

    public void setKontakDosen(String kontakDosen) {
        this.kontakDosen = kontakDosen;
    }

    public boolean isAktif() {
        return aktif;
    }

    public void setAktif(boolean aktif) {
        this.aktif = aktif;
    }
}
