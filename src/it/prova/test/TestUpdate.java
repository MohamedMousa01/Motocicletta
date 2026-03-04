package it.prova.test;

import it.prova.dao.MotociclettaDAO;
import it.prova.models.Motocicletta;

import java.util.List;

public class TestUpdate {

    public static void main(String[] args) {

        System.out.println("inizio Test ...");

        MotociclettaDAO motoDAO = new MotociclettaDAO();

        List<Motocicletta> tutteLeMotociclette = motoDAO.findAll();
        Motocicletta motoScelta = tutteLeMotociclette.get(0);


        long idMotoScelta= motoScelta.getId();
        String marcaMotoScelta = motoScelta.getMarca();

        System.out.println("La moto scelta è : " + motoScelta );
        System.out.println(" e ha marca :" + marcaMotoScelta);

        String nuovaMarca = "SUZUKI";
        motoScelta.setMarca(nuovaMarca);
        int righeModificate = motoDAO.update(motoScelta);

        System.out.println("La moto scelta è : " + motoScelta );
        System.out.println(" e ha marca :" + nuovaMarca);



        if (righeModificate > 0) {
            System.out.println("Update eseguito correttamente sul DB.");
        } else {
            System.out.println("Update fallito: nessuna riga modificata.");
        }

        Motocicletta motoDopoUpdate = motoDAO.findById(idMotoScelta);

        if (motoDopoUpdate != null && motoDopoUpdate.getMarca().equals(nuovaMarca)) {
            System.out.println("TEST SUCCESS: La marca sul database è ora " + motoDopoUpdate.getMarca());
        } else {
            System.err.println("TEST FAILED: La marca sul DB non corrisponde!");
        }

    }

}
