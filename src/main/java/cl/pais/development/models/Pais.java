package cl.pais.development.models;

public class Pais {
    private String id;
    private String nombre;
    private int poblacion;
    private String capital;

    // Getters
    public String getId_producto() {
        return id;
    }

    public String getNombre_producto() {
        return nombre;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public String getCapital() {
        return capital;
    }

    // Setters
    public void setId_producto(String id) {
        this.id = id;
    }

    public void setNombre_producto(String nombre) {
        this.nombre = nombre;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }
}
