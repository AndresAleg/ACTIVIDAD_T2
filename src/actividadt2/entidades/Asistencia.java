package actividadt2.entidades;

import java.util.Date;

/**
 *
 * @author Andres
 */
public class Asistencia {
    private Aula aula;
    private String fecha;
    private Estudiante estudiante;

    public Aula getAula() {
        return aula;
    }

    public void setAula(Aula aula) {
        this.aula = aula;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public String mostrarDatos() {
        return this.getFecha() + " - " + 
                this.getAula().getCurso() + " - " + 
                this.getEstudiante().getNombre() + " - " +
                this.getEstudiante().getApellido();
    }
}
