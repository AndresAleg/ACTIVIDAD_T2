package actividadt2.entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andres
 */
public class Aula {
    private int id;
    private String curso;
    private String turno;
    private List<Estudiante> estudiantes;
    
    public Aula(int id, String curso, String turno) {
        this.id = id;
        this.curso = curso;
        this.turno = turno;
        estudiantes = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }


}
    