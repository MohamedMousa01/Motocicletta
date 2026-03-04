package it.prova.models;

import java.util.Date;

public class Motocicletta {

    private long id;
    private String marca;
    private String modello;
    private Integer cilindrata;
    private Date dataImmatricolazione;

    public Motocicletta(){}

    public Motocicletta(long id, String marca, String modello, Integer cilindrata, Date dataImmatricolazione){
        this.id = id;
        this.marca = marca;
        this.modello = modello;
        this.cilindrata = cilindrata;
        this.dataImmatricolazione = dataImmatricolazione;
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

    public Date getDataImmatricolazione() {
        return dataImmatricolazione;
    }

    public void setDataImmatricolazione(Date dataImmatricolazione) {
        this.dataImmatricolazione = dataImmatricolazione;
    }

    @Override
    public String toString() {
        return "Motocicletta{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", modello='" + modello + '\'' +
                ", cilindrata=" + cilindrata +
                ", dataImmatricolazione=" + dataImmatricolazione +
                '}';
    }
}
