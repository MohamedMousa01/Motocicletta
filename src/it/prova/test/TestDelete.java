package it.prova.test;

import it.prova.dao.MotociclettaDAO;

public class TestDelete {

    public static void main(String[] args) {

        System.out.println("inizio Test ...");
        MotociclettaDAO motoDAO = new MotociclettaDAO();

        int numeroMotoBefore = motoDAO.findAll().size();   // numero moto prima di fare delete
        System.out.println("Il numero delle moto prima è : " + numeroMotoBefore);

        int result = motoDAO.delete(38L);   //ritorno del metodo delete;

        int numeroMotoAfter = motoDAO.findAll().size();
        System.out.println("Il numero delle moto dopo é : " + numeroMotoAfter);

        if( result ==0 ||numeroMotoBefore == numeroMotoAfter){
            System.out.println(" TEST FALLITO : non è stato fatto delete!");
        }
        else{
            System.out.println("TEST SUCCESS : è stato fatto il delete");
        }


    }


}
