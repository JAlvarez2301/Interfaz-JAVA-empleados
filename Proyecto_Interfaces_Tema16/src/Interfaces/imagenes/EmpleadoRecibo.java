/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces.imagenes;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class EmpleadoRecibo extends javax.swing.JFrame {

    /**
     * Creates new form EmpleadoRecibo
     */
    public EmpleadoRecibo() {
        initComponents();
         setSize(1000,550); //Escogemos el tamaño inicial
        setLocationRelativeTo(null); // Para que se inicie en medio de mi ventana
        setTitle("Generar Recibo del empleado");
    }

    private EmpleadoRecibo(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private EmpleadoRecibo(String text, String text0, String text1, String text2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Nombre = new javax.swing.JLabel();
        Apellidos = new javax.swing.JLabel();
        DNI = new javax.swing.JLabel();
        Direccion = new javax.swing.JLabel();
        Edad = new javax.swing.JLabel();
        AñosExperiencia = new javax.swing.JLabel();
        HorasTrabajadas = new javax.swing.JLabel();
        PagoPorHora = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        TextField_Nombre = new javax.swing.JTextField();
        TextField_Apellidos = new javax.swing.JTextField();
        TextField_DNI = new javax.swing.JTextField();
        TextField_Direccion = new javax.swing.JTextField();
        TextField_Edad = new javax.swing.JTextField();
        TextField_AñosExperiencia = new javax.swing.JTextField();
        TextField_HorasTrabajadas = new javax.swing.JTextField();
        TextField_PagoPorHora = new javax.swing.JTextField();
        TextField_Recibo = new javax.swing.JTextField();
        Procesar = new javax.swing.JButton();
        LIMPIAR = new javax.swing.JButton();
        VOLVER = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        TextoFinal = new javax.swing.JTextArea();
        ImagenFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("EMPLEADO RECIBO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 240, -1));

        Nombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Nombre.setText("Nombre: ");
        jPanel1.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, -1, -1));

        Apellidos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Apellidos.setText("Apellidos: ");
        jPanel1.add(Apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, -1, -1));

        DNI.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        DNI.setText("DNI: ");
        jPanel1.add(DNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, -1, -1));

        Direccion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Direccion.setText("Direccion");
        jPanel1.add(Direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, -1, -1));

        Edad.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Edad.setText("Edad: ");
        jPanel1.add(Edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, -1, -1));

        AñosExperiencia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AñosExperiencia.setText("Años de Experiencia");
        jPanel1.add(AñosExperiencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, -1, -1));

        HorasTrabajadas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        HorasTrabajadas.setText("Horas Trabajadas: ");
        jPanel1.add(HorasTrabajadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, -1, -1));

        PagoPorHora.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PagoPorHora.setText("Pago por hora: ");
        jPanel1.add(PagoPorHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Recibo: ");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, -1, -1));

        TextField_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_NombreActionPerformed(evt);
            }
        });
        jPanel1.add(TextField_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 140, -1));

        TextField_Apellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_ApellidosActionPerformed(evt);
            }
        });
        jPanel1.add(TextField_Apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 140, -1));

        TextField_DNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_DNIActionPerformed(evt);
            }
        });
        jPanel1.add(TextField_DNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 140, -1));

        TextField_Direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_DireccionActionPerformed(evt);
            }
        });
        jPanel1.add(TextField_Direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 140, -1));

        TextField_Edad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_EdadActionPerformed(evt);
            }
        });
        jPanel1.add(TextField_Edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 140, -1));

        TextField_AñosExperiencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_AñosExperienciaActionPerformed(evt);
            }
        });
        jPanel1.add(TextField_AñosExperiencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, 100, -1));

        TextField_HorasTrabajadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_HorasTrabajadasActionPerformed(evt);
            }
        });
        jPanel1.add(TextField_HorasTrabajadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, 100, -1));
        jPanel1.add(TextField_PagoPorHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, 100, -1));

        TextField_Recibo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_ReciboActionPerformed(evt);
            }
        });
        jPanel1.add(TextField_Recibo, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, 100, -1));

        Procesar.setBackground(new java.awt.Color(204, 204, 255));
        Procesar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Procesar.setText("PROCESAR");
        Procesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProcesarActionPerformed(evt);
            }
        });
        jPanel1.add(Procesar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 80, 210, -1));

        LIMPIAR.setBackground(new java.awt.Color(204, 204, 255));
        LIMPIAR.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LIMPIAR.setText("LIMPIAR");
        LIMPIAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LIMPIARActionPerformed(evt);
            }
        });
        jPanel1.add(LIMPIAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 140, 210, -1));

        VOLVER.setBackground(new java.awt.Color(204, 204, 255));
        VOLVER.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        VOLVER.setText("VOLVER");
        VOLVER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VOLVERActionPerformed(evt);
            }
        });
        jPanel1.add(VOLVER, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 200, 210, 40));

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setText("SALIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 270, 280, 50));

        TextoFinal.setColumns(20);
        TextoFinal.setRows(5);
        jPanel1.add(TextoFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 240, 290, 290));

        ImagenFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/imagenes/computer-workstation-g3950cbb7a_1280.jpg"))); // NOI18N
        jPanel1.add(ImagenFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int opcion = JOptionPane.showConfirmDialog(EmpleadoRecibo.this, "¿Estas seguro que quieres cerrar la aplicación?",
            "Ventana salida.", JOptionPane.YES_NO_OPTION);
        if(opcion==JOptionPane.YES_OPTION){
            dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void VOLVERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VOLVERActionPerformed
        Portada p1 = new Portada();
       p1.setVisible(true);
       dispose();
    }//GEN-LAST:event_VOLVERActionPerformed

    private void LIMPIARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LIMPIARActionPerformed
        TextField_Apellidos.setText("");
        TextField_AñosExperiencia.setText("");
        TextField_DNI.setText("");
        TextField_Edad.setText("");
        TextField_HorasTrabajadas.setText("");
        TextField_Nombre.setText("");
        TextField_PagoPorHora.setText("");
        TextField_Recibo.setText("");
        TextField_Direccion.setText("");
    }//GEN-LAST:event_LIMPIARActionPerformed

    private void ProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProcesarActionPerformed
                     String Apelidos =  TextField_Apellidos.getText();
                     String AñosExperiencia = TextField_AñosExperiencia.getText();
                     String DNI= TextField_DNI.getText();
                     String Direccion= TextField_Direccion.getText();
                     String Edad = TextField_Edad.getText();
                     String HorasTrabajadas= TextField_HorasTrabajadas.getText();
                     String Recibo = TextField_Recibo.getText();
                     String PagoPorHora= TextField_PagoPorHora.getText();
                     
                      TextoFinal.append(DNI+"\n");
         TextoFinal.append(AñosExperiencia+"\n");
           TextoFinal.append(Direccion+"\n");
             TextoFinal.append(Edad+"\n");
               TextoFinal.append(HorasTrabajadas+"\n");
                 TextoFinal.append(Recibo+"\n");
                   TextoFinal.append(Nombre+"\n");
                     TextoFinal.append(PagoPorHora+"\n");
                       TextoFinal.append(Apelidos+"\n");
    }//GEN-LAST:event_ProcesarActionPerformed

    private void TextField_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_NombreActionPerformed

    private void TextField_ApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_ApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_ApellidosActionPerformed

    private void TextField_DNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_DNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_DNIActionPerformed

    private void TextField_DireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_DireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_DireccionActionPerformed

    private void TextField_EdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_EdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_EdadActionPerformed

    private void TextField_AñosExperienciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_AñosExperienciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_AñosExperienciaActionPerformed

    private void TextField_HorasTrabajadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_HorasTrabajadasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_HorasTrabajadasActionPerformed

    private void TextField_ReciboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_ReciboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_ReciboActionPerformed

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
            java.util.logging.Logger.getLogger(EmpleadoRecibo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmpleadoRecibo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmpleadoRecibo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmpleadoRecibo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmpleadoRecibo();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Apellidos;
    private javax.swing.JLabel AñosExperiencia;
    private javax.swing.JLabel DNI;
    private javax.swing.JLabel Direccion;
    private javax.swing.JLabel Edad;
    private javax.swing.JLabel HorasTrabajadas;
    private javax.swing.JLabel ImagenFondo;
    private javax.swing.JButton LIMPIAR;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel PagoPorHora;
    private javax.swing.JButton Procesar;
    private javax.swing.JTextField TextField_Apellidos;
    private javax.swing.JTextField TextField_AñosExperiencia;
    private javax.swing.JTextField TextField_DNI;
    private javax.swing.JTextField TextField_Direccion;
    private javax.swing.JTextField TextField_Edad;
    private javax.swing.JTextField TextField_HorasTrabajadas;
    private javax.swing.JTextField TextField_Nombre;
    private javax.swing.JTextField TextField_PagoPorHora;
    private javax.swing.JTextField TextField_Recibo;
    private javax.swing.JTextArea TextoFinal;
    private javax.swing.JButton VOLVER;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private void parseInt(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
