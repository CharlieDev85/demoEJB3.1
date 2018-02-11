/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import entities.Product;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author charlie
 */
@Stateless
@LocalBean
public class ProductSessionBean {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    public Product find(){
        return new Product("p1", "Name 1", 500);
    }
    
    public List<Product> findAll(){
        List<Product> listProduct;
        listProduct = new ArrayList<>();
        listProduct.add(new Product("pr1", "Name 12", 500));
        listProduct.add(new Product("pr2", "Name 22", 700));
        listProduct.add(new Product("pr3", "Name 33", 900));
        return listProduct;
    }
}
