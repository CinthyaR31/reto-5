/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorRequerimientos;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Cinthya Rojas
 */
public class AppFormularioLideres extends javax.swing.JFrame {

    /**
     * Creates new form AppFormularioLideres
     */
    public AppFormularioLideres() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPrimerApellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSegundoApellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jSalario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jCiudadResidencia = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jCargo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jClasificacion = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jDocumentoIdentificacion = new javax.swing.JTextField();
        labelFechaNacimiento = new javax.swing.JLabel();
        jFechaNacimiento = new javax.swing.JTextField();
        jBtnGuardarLider = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre");

        jNombre.setPreferredSize(new java.awt.Dimension(8, 20));
        jNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNombreActionPerformed(evt);
            }
        });

        jLabel2.setText("Primer Apellido");

        jPrimerApellido.setPreferredSize(new java.awt.Dimension(8, 20));

        jLabel3.setText("Segundo Apellido");

        jSegundoApellido.setPreferredSize(new java.awt.Dimension(8, 20));
        jSegundoApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSegundoApellidoActionPerformed(evt);
            }
        });

        jLabel4.setText("Salario");

        jSalario.setPreferredSize(new java.awt.Dimension(8, 20));

        jLabel5.setText("Ciudad residencia");

        jCiudadResidencia.setPreferredSize(new java.awt.Dimension(8, 20));

        jLabel6.setText("Cargo");

        jLabel7.setText("Clasificacion");

        jLabel8.setText("Documento identificacion");

        labelFechaNacimiento.setText("Fecha Nacimiento");

        jBtnGuardarLider.setText("Guardar lider");
        jBtnGuardarLider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGuardarLiderActionPerformed(evt);
            }
        });

        jButton1.setText("Limpiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jBtnGuardarLider)
                .addGap(49, 49, 49)
                .addComponent(jButton1)
                .addContainerGap(150, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jCiudadResidencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSalario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPrimerApellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSegundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(labelFechaNacimiento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jFechaNacimiento)
                    .addComponent(jDocumentoIdentificacion)
                    .addComponent(jClasificacion)
                    .addComponent(jCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jClasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jDocumentoIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelFechaNacimiento)
                            .addComponent(jFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jPrimerApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jSegundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jCiudadResidencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnGuardarLider)
                    .addComponent(jButton1))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limpiarCampos(){
        jNombre.setText("");
        jPrimerApellido.setText("");
        jSegundoApellido.setText("");
        jSalario.setText("");
        jCiudadResidencia.setText("");
        jCargo.setText("");
        jClasificacion.setText("");
        jDocumentoIdentificacion.setText("");
        jFechaNacimiento.setText("");
    }
    
    private void jBtnGuardarLiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGuardarLiderActionPerformed
        String Nombre = jNombre.getText(); 
        String Primer_Apellido = jPrimerApellido.getText(); 
        String Segundo_Apellido = jSegundoApellido.getText(); 
        Integer Salario = Integer.parseInt(jSalario.getText());
        String Ciudad_Residencia = jCiudadResidencia.getText(); 
        String Cargo = jCargo.getText(); 
        Integer Clasificacion = Integer.parseInt(jClasificacion.getText());
        String Documento_Identidad = jDocumentoIdentificacion.getText(); 
        String Fecha_Nacimiento = jFechaNacimiento.getText();
        
        ControladorRequerimientos controladorRequerimientos = new ControladorRequerimientos();
        try {
            Boolean guardarLider = controladorRequerimientos.guardarLider(Nombre, Primer_Apellido, Segundo_Apellido, Salario, Ciudad_Residencia, Cargo, Clasificacion, Documento_Identidad, Fecha_Nacimiento);
            
            if(guardarLider){
                JOptionPane.showMessageDialog(null, "Se guardo el lider =)");
                this.limpiarCampos();
            }else{
                JOptionPane.showMessageDialog(null, "No se guardo el lider =(");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(AppFormularioLideres.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jBtnGuardarLiderActionPerformed

    private void jNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNombreActionPerformed

    private void jSegundoApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSegundoApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSegundoApellidoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.limpiarCampos();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AppFormularioLideres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppFormularioLideres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppFormularioLideres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppFormularioLideres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppFormularioLideres().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton jBtnGuardarLider;
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField jCargo;
    private javax.swing.JTextField jCiudadResidencia;
    private javax.swing.JTextField jClasificacion;
    private javax.swing.JTextField jDocumentoIdentificacion;
    private javax.swing.JTextField jFechaNacimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jNombre;
    private javax.swing.JTextField jPrimerApellido;
    private javax.swing.JTextField jSalario;
    private javax.swing.JTextField jSegundoApellido;
    private javax.swing.JLabel labelFechaNacimiento;
    // End of variables declaration//GEN-END:variables
}
