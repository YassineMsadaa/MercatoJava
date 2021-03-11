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
public class ProductDateComaprable implements Comparator<Product>{

    @Override
    public int compare(Product o1, Product o2) {
        if(o1.getDate().after(o2.getDate())){
            return 1;
        }
        else {
            return -1;
        }//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Comparator<Product> reversed() {
        return Comparator.super.reversed(); //To change body of generated methods, choose Tools | Templates.
    }

   
}
