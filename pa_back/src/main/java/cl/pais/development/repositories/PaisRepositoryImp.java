package cl.pais.development.repositories;



import cl.pais.development.models.Pais;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import java.time.LocalDate;
import java.util.List;

@Repository
public class PaisRepositoryImp implements PaisRepository{

    @Autowired
    private Sql2o sql2o;

    
    
    @Override
    public List<Pais> getAll() {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("select * from pais order by nombre ASC")
                    .executeAndFetch(Pais.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }



    @Override
    public List<Pais> showByNombre(String nombre) {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("select * from pais where nombre = :nombre")
                    .addParameter("nombre",nombre)
                    .executeAndFetch(Pais.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

}