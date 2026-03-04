package it.prova.test;

import it.prova.dao.MotociclettaDAO;
import it.prova.models.Motocicletta;

public class TestFindById {

    public static void main(String[] args) {
        System.out.println("Inizio....");

        MotociclettaDAO motoIstanza = new MotociclettaDAO();

        Motocicletta result = motoIstanza.findById((1L));
        System.out.println(" La motocicletta ricercata è " + result);


    }
}
