/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercato.DAO.Classe;

import java.util.ArrayList;
import java.util.List;
import mercato.Model.Product;

/**
 *
 * @author PC-Yassine
 */
public class Helper {
    
    
    public List<Product> rechercheProductByNom(List<Product> lp , String nomProduit){
        List<Product> nlp= new ArrayList<Product>();
        for (Product product : lp) {
            if (product.getName().contains(nomProduit))
                nlp.add(product);
        }
    return nlp;
    }
    
    
     public List<Product> rechercheMyProduct(List<Product> lp , int id){
        List<Product> nlp= new ArrayList<Product>();
        for (Product product : lp) {
            if (product.getSp().getUser().getId() == id )
                nlp.add(product);
        }
    return nlp;
    }
    
}
