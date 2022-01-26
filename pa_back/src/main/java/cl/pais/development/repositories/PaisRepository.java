package cl.pais.development.repositories;

import cl.pais.development.models.Pais;

import java.util.List;

public interface PaisRepository {
    
    public List<Pais> showByNombre(String nombre);

    public List<Pais> getAll();

}