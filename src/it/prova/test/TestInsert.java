package it.prova.test;

import it.prova.dao.MotociclettaDAO;
import it.prova.models.Motocicletta;

import java.util.Calendar;
import java.util.Date;

public class TestInsert {

    public static void main(String[] args) {

        System.out.println("inizio Test ...");
        MotociclettaDAO motoDAO = new MotociclettaDAO();
        Calendar cal = Calendar.getInstance();
        cal.set(2025, Calendar.MAY, 5);
        Date d1 = cal.getTime();
        Motocicletta moto1 = new Motocicletta(39L, "HONDA" , "GG", 2900, d1);

        int numeroMotoBefore = motoDAO.findAll().size();
        System.out.println("Il numero delle moto prima è :" + numeroMotoBefore);
        int righeModificate = motoDAO.insert(moto1);
        int numeroMotoAfter = motoDAO.findAll().size();
        System.out.println("Il numero delle moto dopo è: " + numeroMotoAfter);

        if( righeModificate == 0 || numeroMotoBefore == numeroMotoAfter){
            System.out.println("TEST ERROR : non è stata aggiunta la moto");
        }
        else {
            System.out.println("TEST SUCCESS: è stata aggiunta la moto");
        }

    }

}
