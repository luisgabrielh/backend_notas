package grupo_dos.notas.servicios;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import grupo_dos.notas.modelos.AlumnoModelo;
import grupo_dos.notas.repositorios.AlumnoRepositorio;

@Service
public class AlumnoServicio {

    @Autowired
    AlumnoRepositorio alumnoRep;

    public AlumnoModelo guardaAlumno(AlumnoModelo alumno){
        return alumnoRep.save(alumno);

    }
    public ArrayList<AlumnoModelo> obtenerAlumnos(){
        return (ArrayList<AlumnoModelo>) alumnoRep.findAll();
    
    }
    public boolean eliminarAlumno(Long id){
        if (alumnoRep.existsById(id) ){
            alumnoRep.deleteById(id);
            return true;
        }
        else{
            return false;

        }
    

    }
    public Optional <AlumnoModelo> obtenerAlumnoPorId(Long id){
        return alumnoRep.findById(id);
    }
    public ArrayList <AlumnoModelo> obtenerAlumnoPorNombre(String nombre){
        return alumnoRep.findByNombre(nombre);
    }

}   

