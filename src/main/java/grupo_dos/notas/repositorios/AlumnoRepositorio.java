package grupo_dos.notas.repositorios;

import java.util.ArrayList;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import grupo_dos.notas.modelos.AlumnoModelo;
@Repository
public interface AlumnoRepositorio extends MongoRepository <AlumnoModelo, Long> {
    ArrayList<AlumnoModelo> findByNombre(String nombre);
    
}
