package Ventanas;

import javax.swing.JFrame;

/**
 *
 * @author Claudio
 */
public class Informes extends javax.swing.JFrame {

    /**
     * Creates new form Clientes
     */
    public Informes() {
        initComponents();

        this.setLocationRelativeTo(null);

    }
 private void cambiarVentana(JFrame ventanaNueva) {
        dispose(); // Cierra la ventana actual
        ventanaNueva.setVisible(true); // Abre la nueva ventana
 }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        btnPago = new javax.swing.JButton();
        btnSeguridad = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        btnProductos = new javax.swing.JButton();
        btnEmpleados = new javax.swing.JButton();
        btnInformes = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnProveedores = new javax.swing.JButton();
        btnPromociones = new javax.swing.JButton();
        btnPedidos = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton17 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPago.setBackground(new java.awt.Color(204, 204, 255));
        btnPago.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btnPago.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/010-tarjeta-de-credito.png"))); // NOI18N
        btnPago.setText("Formas de pago");
        btnPago.setMaximumSize(new java.awt.Dimension(168, 47));
        btnPago.setMinimumSize(new java.awt.Dimension(168, 47));
        btnPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagoActionPerformed(evt);
            }
        });
        jPanel3.add(btnPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 170, 40));

        btnSeguridad.setBackground(new java.awt.Color(204, 204, 255));
        btnSeguridad.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btnSeguridad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/001-proteger.png"))); // NOI18N
        btnSeguridad.setText("Seguridad");
        btnSeguridad.setMaximumSize(new java.awt.Dimension(127, 47));
        btnSeguridad.setMinimumSize(new java.awt.Dimension(127, 47));
        btnSeguridad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeguridadActionPerformed(evt);
            }
        });
        jPanel3.add(btnSeguridad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 150, -1));

        btnVentas.setBackground(new java.awt.Color(204, 204, 255));
        btnVentas.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btnVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Nventa.png"))); // NOI18N
        btnVentas.setText("Ventas");
        btnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasActionPerformed(evt);
            }
        });
        jPanel3.add(btnVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 150, -1));

        btnProductos.setBackground(new java.awt.Color(204, 204, 255));
        btnProductos.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btnProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/005-un-pan.png"))); // NOI18N
        btnProductos.setText("Productos");
        btnProductos.setMaximumSize(new java.awt.Dimension(127, 47));
        btnProductos.setMinimumSize(new java.awt.Dimension(127, 47));
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });
        jPanel3.add(btnProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 150, 40));

        btnEmpleados.setBackground(new java.awt.Color(204, 204, 255));
        btnEmpleados.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btnEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/004-empleado.png"))); // NOI18N
        btnEmpleados.setText("Empleados");
        btnEmpleados.setMaximumSize(new java.awt.Dimension(127, 47));
        btnEmpleados.setMinimumSize(new java.awt.Dimension(127, 47));
        btnEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpleadosActionPerformed(evt);
            }
        });
        jPanel3.add(btnEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 150, -1));

        btnInformes.setBackground(new java.awt.Color(204, 204, 255));
        btnInformes.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btnInformes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/006-reporte.png"))); // NOI18N
        btnInformes.setText("Informes");
        btnInformes.setMaximumSize(new java.awt.Dimension(127, 47));
        btnInformes.setMinimumSize(new java.awt.Dimension(127, 47));
        btnInformes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformesActionPerformed(evt);
            }
        });
        jPanel3.add(btnInformes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 150, -1));

        btnClientes.setBackground(new java.awt.Color(204, 204, 255));
        btnClientes.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btnClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/003-clasificacin.png"))); // NOI18N
        btnClientes.setText("Clientes");
        btnClientes.setMaximumSize(new java.awt.Dimension(127, 47));
        btnClientes.setMinimumSize(new java.awt.Dimension(127, 47));
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });
        jPanel3.add(btnClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 150, -1));

        btnProveedores.setBackground(new java.awt.Color(204, 204, 255));
        btnProveedores.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btnProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/proveedor.png"))); // NOI18N
        btnProveedores.setText("Proveedores");
        btnProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedoresActionPerformed(evt);
            }
        });
        jPanel3.add(btnProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 150, 40));

        btnPromociones.setBackground(new java.awt.Color(204, 204, 255));
        btnPromociones.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btnPromociones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/002-etiqueta-de-descuento.png"))); // NOI18N
        btnPromociones.setText("Promociones");
        btnPromociones.setMaximumSize(new java.awt.Dimension(127, 47));
        btnPromociones.setMinimumSize(new java.awt.Dimension(127, 47));
        btnPromociones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromocionesActionPerformed(evt);
            }
        });
        jPanel3.add(btnPromociones, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        btnPedidos.setBackground(new java.awt.Color(204, 204, 255));
        btnPedidos.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btnPedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/008-portapapeles.png"))); // NOI18N
        btnPedidos.setText("Pedidos");
        btnPedidos.setMaximumSize(new java.awt.Dimension(127, 47));
        btnPedidos.setMinimumSize(new java.awt.Dimension(127, 47));
        btnPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedidosActionPerformed(evt);
            }
        });
        jPanel3.add(btnPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 150, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 190, 560));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton17.setBackground(new java.awt.Color(204, 204, 255));
        jButton17.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton17.setText("Ventas");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 90, 40));

        jButton13.setBackground(new java.awt.Color(204, 204, 255));
        jButton13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton13.setText("Ganancias");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 110, 40));

        jButton18.setBackground(new java.awt.Color(204, 204, 255));
        jButton18.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton18.setText("Gastos");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 90, 40));

        jButton19.setBackground(new java.awt.Color(204, 204, 255));
        jButton19.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton19.setText("Perdidas");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, 100, 40));

        jButton14.setBackground(new java.awt.Color(204, 204, 255));
        jButton14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton14.setText("Insumos");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 60, 110, 40));

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dia", "Mes", "Año" }));
        jPanel4.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 140, 110, 50));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 990, 560));

        jPanel5.setBackground(new java.awt.Color(153, 153, 255));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Informes");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, -1, -1));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1180, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSeguridadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeguridadActionPerformed
        // TODO add your handling code here:
        cambiarVentana(new Seguridad());
    }//GEN-LAST:event_btnSeguridadActionPerformed

    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed
        // TODO add your handling code here:
         cambiarVentana(new Ventas());
    }//GEN-LAST:event_btnVentasActionPerformed

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        // TODO add your handling code here:
          cambiarVentana(new Productos());
    }//GEN-LAST:event_btnProductosActionPerformed

    private void btnEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpleadosActionPerformed
        // TODO add your handling code here:
          cambiarVentana(new Empleados());
    }//GEN-LAST:event_btnEmpleadosActionPerformed

    private void btnInformesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInformesActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        // TODO add your handling code here:
          cambiarVentana(new Clientes());
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedoresActionPerformed
        // TODO add your handling code here:
          cambiarVentana(new Proveedores());
    }//GEN-LAST:event_btnProveedoresActionPerformed

    private void btnPromocionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromocionesActionPerformed
        // TODO add your handling code here:
         cambiarVentana(new Promociones());
    }//GEN-LAST:event_btnPromocionesActionPerformed

    private void btnPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedidosActionPerformed
        // TODO add your handling code here:
          cambiarVentana(new Pedidos());

    }//GEN-LAST:event_btnPedidosActionPerformed

    private void btnPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagoActionPerformed
        // TODO add your handling code here:
        cambiarVentana(new Formas_de_pago());
        
       
    }//GEN-LAST:event_btnPagoActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

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
            java.util.logging.Logger.getLogger(Informes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Informes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Informes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Informes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Informes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnEmpleados;
    private javax.swing.JButton btnInformes;
    private javax.swing.JButton btnPago;
    private javax.swing.JButton btnPedidos;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnPromociones;
    private javax.swing.JButton btnProveedores;
    private javax.swing.JButton btnSeguridad;
    private javax.swing.JButton btnVentas;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
