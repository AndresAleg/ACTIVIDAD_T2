package actividadt2;

import actividadt2.entidades.Asistencia;
import actividadt2.entidades.Aula;
import actividadt2.entidades.Estudiante;
import actividadt2.pantallas.JFrameAula;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andres
 */
public class ActividadT2 {

    public static List<Aula> aulas = new ArrayList<>();
    public static List<Estudiante> estudiantes = new ArrayList<>();
    public static List<Asistencia> asistencias = new ArrayList<>();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Inicializar las 3 aulas:
        Aula aula1 = new Aula(1, "Trigonometría", "Mañana");
        aulas.add(aula1);

        Aula aula2 = new Aula(2, "Geometría", "Tarde");
        aulas.add(aula2);

        Aula aula3 = new Aula(3, "Álgebra", "Noche");
        aulas.add(aula3);
        
        // Abrir el formulario:
        JFrameAula framePrincipal = new JFrameAula();
        framePrincipal.setLocationRelativeTo(null);
        framePrincipal.setVisible(true);
    }
}
