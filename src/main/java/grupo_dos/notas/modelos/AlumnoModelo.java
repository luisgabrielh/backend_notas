package grupo_dos.notas.modelos;

import org.springframework.data.annotation.Id;

public class AlumnoModelo {
    @Id
    private long id;
    private String nombre;
    private String apellido;
    private String correo;
    private String grado;
    private String salon;


    
    public AlumnoModelo(long id, String nombre, String apellido, String correo, String grado, String salon) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.grado = grado;
        this.salon = salon;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getGrado() {
        return grado;
    }
    public void setGrado(String grado) {
        this.grado = grado;
    }
    public String getSalon() {
        return salon;
    }
    public void setSalon(String salon) {
        this.salon = salon;
    }   

    
}
