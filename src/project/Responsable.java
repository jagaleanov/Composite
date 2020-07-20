/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author jgale
 */
public class Responsable {
    
    private String nombre;
    
    public Responsable (String n) {
        this.nombre = n;
    }
    
    public String getNombre(){
        return this.nombre;
    }
}
