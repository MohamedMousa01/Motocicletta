package it.prova.models;

public class Motocicletta {

    private long id;
    private String marca;
    private String modello;
    private Integer cilindrata;

    public Motocicletta(){}

    public Motocicletta(long id, String marca, String modello, Integer cilindrata){
        this.id = id;
        this.marca = marca;
        this.modello = modello;
        this.cilindrata = cilindrata;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public Integer getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(Integer cilindrata) {
        this.cilindrata = cilindrata;
    }

}
