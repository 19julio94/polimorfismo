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
public class Gato extends Animal{
    
    private String cor;

    public Gato() {
    }

    public Gato(String cor, String nombre) {
        super(nombre);
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Gato{" + "cor=" + cor + '}';
    }
    
    
    @Override
    public void falar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
