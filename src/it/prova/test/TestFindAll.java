package it.prova.test;

import it.prova.dao.MotociclettaDAO;
import it.prova.models.Motocicletta;

import java.util.ArrayList;
import java.util.List;

public class TestFindAll {

    public void main(String[] args){

        System.out.println("inizio Test ...");

        MotociclettaDAO motoIstanza = new MotociclettaDAO();
        List<Motocicletta> result = new ArrayList<>();

        result = motoIstanza.findAll();
        int numeroMotociclette = result.size();

        System.out.println("Ci sono " + numeroMotociclette + "motociclette, e sono : ");
        for(Motocicletta motocicletta : result){
            System.out.println(motocicletta);
        }

    }

}
