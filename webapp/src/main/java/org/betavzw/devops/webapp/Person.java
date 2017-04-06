/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.betavzw.devops.webapp;

/**
 *
 * @author Jef
 */
public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if ("".equals(name)) throw new IllegalArgumentException("Name cannot be empty");
        this.name = name;
    }
    
}
