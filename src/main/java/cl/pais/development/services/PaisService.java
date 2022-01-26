package cl.pais.development.services;




import cl.pais.development.models.Pais;
import cl.pais.development.repositories.PaisRepository;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@CrossOrigin
@RestController
public class PaisService {
    private final PaisRepository paisRepository;

    PaisService(PaisRepository paisRepository){
        this.paisRepository = paisRepository;
    }

    // leer R
    @GetMapping("/pais")
    public List<Pais> getAllPais(){
        return paisRepository.getAll();
    }
    
    @GetMapping("/pais/nombre/{nombre}")
    public List<Pais> getPaisByNombre(@PathVariable String nombre){
        return paisRepository.showByNombre(nombre);
    }
}
