package it.prova.dao;

import it.prova.connection.MyConnection;
import it.prova.models.Motocicletta;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

//--------------------------------###################

public class MotociclettaDAO {

    public Motocicletta findById(Long input){

        if(input == null || input < 1){
            return null;
        }

        Connection c = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Motocicletta result = null;

        try {

            c = MyConnection.getConnection();
            ps = c.prepareStatement("select * from lavoratore u where u.id=?;");
            ps.setLong(1, input);

            rs = ps.executeQuery();

            if (rs.next()) {
                result = new Motocicletta();
                result.setId(rs.getLong("id"));
                result.setMarca(rs.getString("marca"));
                result.setModello(rs.getString("modello"));
                result.setCilindrata(rs.getInt("cilindrata"));
                result.setDataImmatricolazione(rs.getDate("dataimmatricolazione"));
            }

        } catch (Exception e) {
                e.printStackTrace();

            } finally {
                try {
                    rs.close();
                    ps.close();
                    c.close();

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return result;
        }


//----------------------------------------------############

    public List<Motocicletta> findAll(){

        Connection c = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Motocicletta temp = null;
        List<Motocicletta> result = new ArrayList<>();

        try{

            c = MyConnection.getConnection();
            ps = c.prepareStatement("SELECT * FROM motociclettajdbc");

            while(rs.next()){
                temp = new Motocicletta();
                temp.setId(rs.getLong("id"));
                temp.setMarca(rs.getString("marca"));
                temp.setModello(rs.getString("modello"));
                temp.setDataImmatricolazione(rs.getDate("dataimmatricolazione"));
                result.add(temp);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try {
                rs.close();
                c.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return result;
    }


//---------------------------------------#####################

    public int update(Motocicletta input){

        if (input == null || input.getId() < 1) {
            return 0;
        }

        Connection c = null;
        PreparedStatement ps = null;
        int result = 0;

        try {

            c = MyConnection.getConnection();
            ps = c.prepareStatement("UPDATE lavoratore SET marca=?, modello=?, cilindrata=?, dataimmatricolazione=? where id=?;");
            ps.setString(1, input.getMarca());
            ps.setString(2, input.getModello());
            // quando si fa il setDate serve un tipo java.sql.Date
            ps.setInt(3, input.getCilindrata());
            ps.setDate(4, new java.sql.Date(input.getDataImmatricolazione().getTime()));
            ps.setLong(5, input.getId());

            result = ps.executeUpdate();

        } catch (Exception e) {

            e.printStackTrace();

        } finally {
            try {
                ps.close();
                c.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return result;

    }

    // --------------------------------------#################

    public int delete(Long inputId){

        if (inputId == null || inputId < 1) {
            return 0;
        }

        Connection c = null;
        PreparedStatement ps = null;
        int result = 0;

        try {

            c = MyConnection.getConnection();
            ps = c.prepareStatement("DELETE from lavoratore where id=?;");
            ps.setLong(1, inputId);

            result = ps.executeUpdate();

        } catch (Exception e) {

            e.printStackTrace();

        } finally {
            try {
                ps.close();
                c.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return result;
    }


    //-------------------------------------################################

    public int insert(Motocicletta input){

        Connection c = null;
        PreparedStatement ps = null;
        int result = 0;

        try {

            c = MyConnection.getConnection();
            ps = c.prepareStatement("INSERT INTO lavoratore (marca, modello, cilindrata, dataimmatricolazione) VALUES (?, ?, ?,?) ");
            ps.setString(1, input.getMarca());
            ps.setString(2, input.getModello());
            // quando si fa il setDate serve un tipo java.sql.Date
            ps.setInt(3, input.getCilindrata());
            ps.setDate(4, new java.sql.Date(input.getDataImmatricolazione().getTime()));

            result = ps.executeUpdate();

        } catch (Exception e) {

            e.printStackTrace();

        } finally {
            try {
                ps.close();
                c.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return result;
    }

}
