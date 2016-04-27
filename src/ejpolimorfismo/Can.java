/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejpolimorfismo;

/**
 *
 * @author mgonzalezlorenzo
 */
public class Can extends Animal{

    private String raza;

    public Can() {
    }

    public Can(String raza, String nombre) {
        super(nombre);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Can{" + "raza=" + raza + '}';
    }
    
    
    @Override
    public void falar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
