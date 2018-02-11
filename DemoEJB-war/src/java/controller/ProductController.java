/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import demo.ProductSessionBean;
import entities.Product;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author charlie
 */
@Named(value = "productController")
@SessionScoped
public class ProductController implements Serializable {

    @EJB
    private ProductSessionBean productSessionBean;

    /**
     * Creates a new instance of ProductController
     */
    public ProductController() {
    }
    
    public Product find(){
        return this.productSessionBean.find();
    }
    
    public List<Product> findAll(){
        return this.productSessionBean.findAll();
    }
}
