/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercato.DAO.Classe;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.activation.DataSource;
import mercato.DAO.Interface.ICRUD;
import mercato.Model.Reclamation;
import mercato.Technique.DataBase;
import java.sql.Date;

/**
 *
 * @author ASUS
 */
public class ReclamationService implements ICRUD<Reclamation>{
    
    Connection cnx = DataBase.getInstance().getConnection();
    private Connection db;
    

    public void ajouter(Reclamation r) {
        try {
            String requete = "insert into reclamation (title,body,subject,user_id,date) values (?,?,?,?,?) ";
            PreparedStatement pst = cnx.prepareStatement(requete);
            pst.setString(1, r.getTitle());
            pst.setString(2, r.getBody());
            pst.setString(3, r.getSubject());
            pst.setInt(4, r.getUserId());
            pst.setDate(5,(Date)r.getDate());
            pst.executeUpdate();
            System.out.println("Reclamation ajoutée !");

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

    public void supprimer(Reclamation r) {
         try {
            String requete = "DELETE FROM reclamation WHERE id=?";
            PreparedStatement pst = cnx.prepareStatement(requete);
            pst.setInt(1, r.getRecId());
            pst.executeUpdate();
            System.out.println("Reclamation supprimée !");

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

    public void modifier(Reclamation r) {
        try {
            String requete = "UPDATE reclamation SET title=?,body=?,subject=?,user_id=?,date=? WHERE id=?";
            PreparedStatement pst = cnx.prepareStatement(requete);
            pst.setInt(6, r.getRecId());
            pst.setString(1, r.getTitle());
            pst.setString(2, r.getBody());
            pst.setString(3, r.getSubject());
            pst.setInt(4, r.getUserId());
            pst.setDate(5,(Date)r.getDate());
            pst.executeUpdate();
            System.out.println("Reclamation modifiée !");

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

    @Override
     public List<Reclamation> afficher() {
        List<Reclamation> list = new ArrayList<>();

        try {
            String requete = "SELECT * FROM reclamation";
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery(requete);
            while (rs.next()) {
                list.add(new Reclamation(rs.getInt("id"),rs.getString("title"),rs.getString("body"),rs.getString("subject"),rs.getInt("user_id"),rs.getDate("date")));
            }

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }

        return list;
    }
}
