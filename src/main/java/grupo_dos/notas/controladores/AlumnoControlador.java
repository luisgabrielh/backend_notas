package grupo_dos.notas.controladores;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import grupo_dos.notas.modelos.AlumnoModelo;
import grupo_dos.notas.servicios.AlumnoServicio;

@RestController
@RequestMapping("/alumno")

public class AlumnoControlador {
    @Autowired
    AlumnoServicio alumnoServicio;

    @PostMapping()
    public AlumnoModelo guardarAlumno(@RequestBody AlumnoModelo alumno){
        return alumnoServicio.guardaAlumno(alumno);

    }
    @GetMapping()
    public ArrayList<AlumnoModelo> obtenerAlumno(){
        return alumnoServicio.obtenerAlumnos();
    }

    @DeleteMapping(path ="/{id}")
    public boolean eliminarAlumnoPorId(@PathVariable("id")Long id){
        return alumnoServicio.eliminarAlumno(id);

    }
    @GetMapping(path ="/{id}")
    public Optional<AlumnoModelo> obtenerAlumnoPorId(@PathVariable("id")Long id){
        return alumnoServicio.obtenerAlumnoPorId(id);
    }
    @GetMapping(path ="/buscar/{nombre}")
    public ArrayList<AlumnoModelo> obtenerAlumnoPorNombre(@PathVariable("nombre") String nombre){
        return alumnoServicio.obtenerAlumnoPorNombre(nombre);
    }

        
    
    
}
