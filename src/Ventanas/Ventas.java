package Ventanas;

import javax.swing.JFrame;

/**
 *
 * @author Claudio
 */
public class Ventas extends javax.swing.JFrame {
 
    public Ventas() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton7 = new javax.swing.JButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jButton8 = new javax.swing.JButton();
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

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre del producto", "Cantidad", "Precio", "Precio Total"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 800, 190));

        jLabel2.setText("Codigo:");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));
        jPanel4.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 120, 30));

        jLabel3.setText("Tipo de pago");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 40, -1, -1));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel4.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, 100, 30));

        jLabel4.setText("Descripción:");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, -1, -1));
        jPanel4.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 190, 30));

        jLabel5.setText("Cantidad:");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, -1, -1));
        jPanel4.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 100, 30));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/003-agregar.png"))); // NOI18N
        jButton3.setText("Nueva venta");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 130, 140, 40));

        jButton4.setBackground(new java.awt.Color(204, 204, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/001-buscar.png"))); // NOI18N
        jPanel4.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 40, 30));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/002-lpiz.png"))); // NOI18N
        jButton5.setText("Modificar");
        jPanel4.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 280, 140, 40));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/007-disco-flexible.png"))); // NOI18N
        jButton6.setText("Guardar venta");
        jPanel4.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 180, 140, 40));

        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/005-impresora.png"))); // NOI18N
        jPanel4.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 370, 60, 50));

        jLabel6.setText("precio:");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 40, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Efectivo", "Targeta" }));
        jPanel4.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 70, 90, 30));

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/006-borrar.png"))); // NOI18N
        jButton7.setText("Borrar");
        jPanel4.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 230, 140, 40));

        jToggleButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/002-etiqueta-de-descuento.png"))); // NOI18N
        jToggleButton2.setText("Descuento");
        jPanel4.add(jToggleButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 370, 130, 50));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/006-borrar.png"))); // NOI18N
        jButton8.setText("Anular Orden");
        jPanel4.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 370, 140, 50));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 990, 560));

        jPanel5.setBackground(new java.awt.Color(153, 153, 255));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ventas");
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
        //cambiarVentana(new Ventas());
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
        cambiarVentana(new Informes());
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

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventas().setVisible(true);
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
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    // End of variables declaration//GEN-END:variables
}