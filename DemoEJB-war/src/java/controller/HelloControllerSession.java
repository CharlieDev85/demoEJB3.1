/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import demo.HelloSessionBean;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;

/**
 *
 * @author charlie
 */
@Named(value = "helloControllerSession")
@SessionScoped
public class HelloControllerSession implements Serializable {

    @EJB
    private HelloSessionBean helloSessionBean;

    /**
     * Creates a new instance of HelloControllerSession
     */
    public HelloControllerSession() {
    }
    
    public String display(){
        return this.helloSessionBean.hello("Learning Java EE");
    }
    
    public int calculate (){
        return this.helloSessionBean.calculate(2, "*", 8);
    }
    
}
