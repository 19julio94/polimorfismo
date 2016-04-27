package ejpolimorfismo;

/**
 *
 * @author mgonzalezlorenzo
 */
public abstract class Animal {
    
    private String nombre;

    public Animal() {
    }

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + '}';
    }
    
    
    public abstract void falar();
    
}