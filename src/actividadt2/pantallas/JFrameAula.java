package actividadt2.pantallas;

import actividadt2.ActividadT2;
import actividadt2.entidades.Aula;
import actividadt2.entidades.Estudiante;
import java.awt.event.ItemEvent;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Andres
 */
public class JFrameAula extends javax.swing.JFrame {

    
    private List<Estudiante> listaEstudiante;
    private List<Aula> listaAula;
    private DefaultListModel<String> modelListEstudianteShow;
    
    public JFrameAula() {
        initComponents();
        inicializarFormulario();
    }
    
    public final void inicializarFormulario() {
        
        listaEstudiante = ActividadT2.estudiantes;
        listaAula = ActividadT2.aulas;
        
        modelListEstudianteShow = new DefaultListModel<>();
        this.lstEstudiante.setModel(modelListEstudianteShow);
        modelListEstudianteShow.removeAllElements();
        cbCurso.removeAllItems();
        
        for (Estudiante estudiante : listaEstudiante) {
            modelListEstudianteShow.addElement(estudiante.mostrarDatos());
        }
        
        for (Aula aula : listaAula) {
            cbCurso.addItem(aula.getCurso());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblCurso = new javax.swing.JLabel();
        cbCurso = new javax.swing.JComboBox<>();
        lblTurno = new javax.swing.JLabel();
        lblTurnoValor = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstEstudiante = new javax.swing.JList<>();
        lblListaEstudiantes = new javax.swing.JLabel();
        btnAñadir = new javax.swing.JButton();
        btnIrEstudiante = new javax.swing.JButton();
        btnIrAsistencia = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pantalla Aula");

        lblTitulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblTitulo.setText("AULAS");

        lblCurso.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCurso.setText("Curso:");

        cbCurso.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbCursoItemStateChanged(evt);
            }
        });

        lblTurno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTurno.setText("Turno:");

        lblTurnoValor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTurnoValor.setText("Mañana");

        jScrollPane1.setViewportView(lstEstudiante);

        lblListaEstudiantes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblListaEstudiantes.setText("Lista Estudiantes:");

        btnAñadir.setText("Añadir Estudiante");
        btnAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirActionPerformed(evt);
            }
        });

        btnIrEstudiante.setText("Ir a Estudiante");
        btnIrEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIrEstudianteActionPerformed(evt);
            }
        });

        btnIrAsistencia.setText("Ir a Asistencia");
        btnIrAsistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIrAsistenciaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCurso)
                        .addGap(18, 18, 18)
                        .addComponent(cbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblTurno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblTurnoValor))
                    .addComponent(lblListaEstudiantes)
                    .addComponent(btnAñadir)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(75, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblTitulo)
                        .addGap(214, 214, 214))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnIrEstudiante)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIrAsistencia))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCurso)
                    .addComponent(cbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTurno)
                    .addComponent(lblTurnoValor))
                .addGap(18, 18, 18)
                .addComponent(lblListaEstudiantes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAñadir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIrAsistencia)
                    .addComponent(btnIrEstudiante))
                .addGap(7, 7, 7))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIrEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIrEstudianteActionPerformed
        // TODO add your handling code here:
        JFrameEstudiante pantallaEstudiante = new JFrameEstudiante(this);
        pantallaEstudiante.setLocationRelativeTo(this);
        pantallaEstudiante.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnIrEstudianteActionPerformed

    private void btnIrAsistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIrAsistenciaActionPerformed
        // TODO add your handling code here:
        JFrameAsistencia pantallaAsistencia = new JFrameAsistencia(this);
        pantallaAsistencia.setLocationRelativeTo(this);
        pantallaAsistencia.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnIrAsistenciaActionPerformed

    private void cbCursoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbCursoItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            
            String cursoSeleccionado = (String) cbCurso.getSelectedItem();
            
            if (cursoSeleccionado.equals("Trigonometría")) {
                lblTurnoValor.setText("Mañana");
            } else if (cursoSeleccionado.equals("Geometría")) {
                lblTurnoValor.setText("Tarde");
            } else if (cursoSeleccionado.equals("Álgebra")) {
               lblTurnoValor.setText("Noche");   
            }
        }
    }//GEN-LAST:event_cbCursoItemStateChanged

    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed
        // TODO add your handling code here:
        
        int selectedIndex = lstEstudiante.getSelectedIndex();
        
        if (selectedIndex != -1) {
            String texto = lstEstudiante.getSelectedValue();
            String campos[] = texto.split(" - ");
            
            Estudiante estudianteSeleccionado = new Estudiante();
            estudianteSeleccionado.setDni(campos[0]);
            estudianteSeleccionado.setNombre(campos[1]);
            estudianteSeleccionado.setApellido(campos[2]);
            
            String cursoSeleccionado = (String) cbCurso.getSelectedItem();
            
            for (Aula aula : ActividadT2.aulas) {
                if (aula.getCurso().equals(cursoSeleccionado)) {
                    aula.getEstudiantes().add(estudianteSeleccionado);
                    break;
                }
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un estudiante, para añadir al aula");
        }
        
    }//GEN-LAST:event_btnAñadirActionPerformed


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameAula().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAñadir;
    private javax.swing.JButton btnIrAsistencia;
    private javax.swing.JButton btnIrEstudiante;
    private javax.swing.JComboBox<String> cbCurso;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCurso;
    private javax.swing.JLabel lblListaEstudiantes;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTurno;
    private javax.swing.JLabel lblTurnoValor;
    private javax.swing.JList<String> lstEstudiante;
    // End of variables declaration//GEN-END:variables
}
