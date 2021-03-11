/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercato.Model;

import java.util.Comparator;

/**
 *
 * @author PC-Yassine
 */
public class ProductPriceComparator implements Comparator<Product>{

    @Override
    public int compare(Product o1, Product o2) {
     if(o1.getPrice()>o2.getPrice()){
     return 1;}
     else{
         return -1;
     }
//To change body of generated methods, choose Tools | Templates.
    }
    
    
}
