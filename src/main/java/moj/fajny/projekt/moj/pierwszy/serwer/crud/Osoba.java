package moj.fajny.projekt.moj.pierwszy.serwer.crud;

public class Osoba {

    private String pesel;//ID

    private String imie;
    private String nazwisko;
    private int rokUrodzenia;
    private String zawod;
    private String wykszatlcenie;

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getRokUrodzenia() {
        return rokUrodzenia;
    }

    public void setRokUrodzenia(int rokUrodzenia) {
        this.rokUrodzenia = rokUrodzenia;
    }

    public String getZawod() {
        return zawod;
    }

    public void setZawod(String zawod) {
        this.zawod = zawod;
    }

    public String getWykszatlcenie() {
        return wykszatlcenie;
    }

    public void setWykszatlcenie(String wykszatlcenie) {
        this.wykszatlcenie = wykszatlcenie;
    }
}
