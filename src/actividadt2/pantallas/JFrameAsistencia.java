package actividadt2.pantallas;

import actividadt2.ActividadT2;
import actividadt2.entidades.Asistencia;
import actividadt2.entidades.Aula;
import actividadt2.entidades.Estudiante;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;

/**
 *
 * @author Andres
 */
public class JFrameAsistencia extends javax.swing.JFrame {

    private final JFrame padre;
    private DefaultListModel<String> modelListAsistenciaShow;
    private List<Aula> listaAula;
    private List<Asistencia> listaAsistencia;
    
    public JFrameAsistencia(JFrame padre) {
        this.padre = padre;
        initComponents();
        inicializarFormulario();
    }
    
    private void inicializarFormulario() {
        listaAula = ActividadT2.aulas;
        listaAsistencia = ActividadT2.asistencias;
        
        modelListAsistenciaShow = new DefaultListModel<>(); 
        this.lstAsistencia.setModel(modelListAsistenciaShow);
        modelListAsistenciaShow.removeAllElements();
        cbAula.removeAllItems();
        
        for (Asistencia asistencia : listaAsistencia) {
            modelListAsistenciaShow.addElement(asistencia.mostrarDatos());
        }
        
        for (Aula aula: listaAula) {
            cbAula.addItem(aula.getCurso());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        lblAula = new javax.swing.JLabel();
        cbAula = new javax.swing.JComboBox<>();
        lblEstudiante = new javax.swing.JLabel();
        cbEstudiante = new javax.swing.JComboBox<>();
        btnRegistrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstAsistencia = new javax.swing.JList<>();
        lblListaAsistencia = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pantalla Asistencia");

        lblTitulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblTitulo.setText("ASISTENCIA");

        lblFecha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblFecha.setText("Fecha:");

        txtFecha.setText("dd/MM/yyyy");

        lblAula.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblAula.setText("Aula:");

        cbAula.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbAulaItemStateChanged(evt);
            }
        });

        lblEstudiante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblEstudiante.setText("Estudiante:");

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(lstAsistencia);

        lblListaAsistencia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblListaAsistencia.setText("Lista Asistencia:");

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addGap(175, 175, 175))
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblListaAsistencia)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblFecha)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(29, 29, 29)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblAula)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cbAula, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(39, 39, 39)
                                    .addComponent(lblEstudiante)
                                    .addGap(18, 18, 18)
                                    .addComponent(cbEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(jScrollPane1)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFecha)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAula)
                    .addComponent(cbAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEstudiante)
                    .addComponent(cbEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegistrar)
                .addGap(18, 18, 18)
                .addComponent(lblListaAsistencia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegresar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        padre.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void cbAulaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbAulaItemStateChanged
        // TODO add your handling code here:
        String cursoSeleccionado = (String) cbAula.getSelectedItem();
            
        cbEstudiante.removeAllItems();
        
        for (Aula aula : listaAula) {
            if (aula.getCurso().equals(cursoSeleccionado)){
                for (Estudiante estudiante : aula.getEstudiantes()){
                    cbEstudiante.addItem(estudiante.getNombre());
                }
            }
        }
    }//GEN-LAST:event_cbAulaItemStateChanged

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        Asistencia asistencia = new Asistencia();
        
        for (Aula aula : listaAula) {
            if (aula.getCurso().equals(cbAula.getSelectedItem())) {
                asistencia.setAula(aula);
                System.out.println(cbAula.getSelectedItem());
                break;
            }
        }

        for (Estudiante estudiante : ActividadT2.estudiantes) {
            if (estudiante.getNombre().equals(cbEstudiante.getSelectedItem())) {
                asistencia.setEstudiante(estudiante);
                System.out.println(cbEstudiante.getSelectedItem());
                break;
            }
        }

        asistencia.setFecha(txtFecha.getText());
        ActividadT2.asistencias.add(asistencia);
        inicializarFormulario();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameAsistencia(new JFrame()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> cbAula;
    private javax.swing.JComboBox<String> cbEstudiante;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAula;
    private javax.swing.JLabel lblEstudiante;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblListaAsistencia;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JList<String> lstAsistencia;
    private javax.swing.JTextField txtFecha;
    // End of variables declaration//GEN-END:variables
}
