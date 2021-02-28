/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercato;

import java.sql.Connection;
import mercato.DAO.Classe.ReclamationService;
import mercato.Model.Reclamation;
import mercato.Technique.DataBase;
import java.sql.Date;

/**
 *
 * @author ASUS
 */
public class Mercato {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        Connection cnx = DataBase.getInstance().getConnection();
        Date d = new Date(2022-12-12);
        Reclamation r1 = new Reclamation("Reclammmmmmm", "Prob", "Bug", 4, d);
        Reclamation r2 = new Reclamation("Reclamation", "Probleme", "Bug", 2, d);
        ReclamationService ps = new ReclamationService();
        ps.ajouter(r1);
        ps.ajouter(r2);
        ps.afficher().forEach(System.out::println);
        ps.supprimer(new Reclamation(9));
        ps.modifier(new Reclamation (2,"Reclam","Prob","le systeme bug",2,d));
        ps.afficher().forEach(System.out::println); 
       
        
    }
    
}
