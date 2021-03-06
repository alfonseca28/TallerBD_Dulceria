/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import Modelo.Conexion;
import Modelo.ReporteProductos;
import Modelo.ReporteVentas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;

/**
 * @author Erick Gonzalez, Damian Cazarin & Aaron Alfonseca
 */
public class VistaInformacionVentas extends javax.swing.JFrame {

    /**
     * Creates new form VistaInformacionVentas
     */
    public VistaInformacionVentas() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnCargarTodoCompa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVentas = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuInformacionCompras = new javax.swing.JMenu();
        menuRegresarVentas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Informacion Ventas");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        jLabel1.setText("Información Ventas");

        btnCargarTodoCompa.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        btnCargarTodoCompa.setText("Cagar todos los registros");
        btnCargarTodoCompa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarTodoCompaActionPerformed(evt);
            }
        });

        tablaVentas.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        tablaVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id Venta", "Producto", "Nombre Empleado", "Apelllido Empleado", "Nombre Cliente", "Apellido Cliente", "Fecha", "Hora", "Cantidad", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaVentas);
        if (tablaVentas.getColumnModel().getColumnCount() > 0) {
            tablaVentas.getColumnModel().getColumn(0).setResizable(false);
            tablaVentas.getColumnModel().getColumn(0).setPreferredWidth(40);
            tablaVentas.getColumnModel().getColumn(1).setResizable(false);
            tablaVentas.getColumnModel().getColumn(2).setResizable(false);
            tablaVentas.getColumnModel().getColumn(3).setResizable(false);
            tablaVentas.getColumnModel().getColumn(4).setResizable(false);
            tablaVentas.getColumnModel().getColumn(5).setResizable(false);
            tablaVentas.getColumnModel().getColumn(6).setResizable(false);
            tablaVentas.getColumnModel().getColumn(6).setPreferredWidth(40);
            tablaVentas.getColumnModel().getColumn(7).setResizable(false);
            tablaVentas.getColumnModel().getColumn(7).setPreferredWidth(40);
            tablaVentas.getColumnModel().getColumn(8).setResizable(false);
            tablaVentas.getColumnModel().getColumn(8).setPreferredWidth(40);
            tablaVentas.getColumnModel().getColumn(9).setResizable(false);
            tablaVentas.getColumnModel().getColumn(9).setPreferredWidth(40);
        }

        jButton1.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jButton1.setText("Generar reporte");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        menuInformacionCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graficos/icon_opciones16.png"))); // NOI18N
        menuInformacionCompras.setText("Opciones");
        menuInformacionCompras.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N

        menuRegresarVentas.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        menuRegresarVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graficos/icon_regresar16.png"))); // NOI18N
        menuRegresarVentas.setText("Regresar");
        menuInformacionCompras.add(menuRegresarVentas);

        jMenuBar1.add(menuInformacionCompras);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 962, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCargarTodoCompa)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addComponent(jLabel1))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(btnCargarTodoCompa))
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCargarTodoCompaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarTodoCompaActionPerformed
        DefaultTableModel modelotabla = new DefaultTableModel();
        tablaVentas.setModel(modelotabla);

        PreparedStatement ps = null;
        ResultSet rs = null;

        Conexion con = new Conexion();
        Connection conexion = con.getconnection();

        try {
            ps = conexion.prepareStatement("select idVenta as ID, Fecha, precio as Importe, Cantidad, producto.nombre as Producto,\n"
                    + "empleado.nombre as NombreEmpleado, empleado.apellidoPaterno as ApellidoEmpleado, empleado.apellidoMaterno as ApellidoEmpleado, \n"
                    + "cliente.nombre as nombreCliente, cliente.apellidoPaterno as ClienteApellido, cliente.apellidoMaterno as apellidoCliente\n"
                    + "from  venta \n"
                    + "inner join empleado on venta.idEmpleado = empleado.idEmpleado\n"
                    + "inner join producto on venta.idProducto = producto.idProducto\n"
                    + "inner join cliente on venta.idCliente = cliente.idCliente");

            rs = ps.executeQuery();

            modelotabla.addColumn("IdVenta");
            modelotabla.addColumn("Fecha");
            modelotabla.addColumn("Importe");
            modelotabla.addColumn("Cantidad");
            modelotabla.addColumn("Producto");
            modelotabla.addColumn("Nombre empleado");
            modelotabla.addColumn("ApPaterno");
            modelotabla.addColumn("ApMaterno");
            modelotabla.addColumn("Nombre Cliente");
            modelotabla.addColumn("ApPaterno");
            modelotabla.addColumn("ApMaterno");

            while (rs.next()) {
                Object fila[] = new Object[11];
                for (int i = 1; i <= 11; i++) {
                    fila[i - 1] = rs.getObject(i);
                }
                modelotabla.addRow(fila);
            }

        } catch (SQLException ex) {
            Logger.getLogger(VistaInformacionClientes.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(VistaInformacionClientes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnCargarTodoCompaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int mes = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el número del mes a generar el reporte", "Mensaje", JOptionPane.INFORMATION_MESSAGE));

        ReporteVentas reporte = new ReporteVentas();

        reporte.reporte(mes);
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
            java.util.logging.Logger.getLogger(VistaInformacionVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaInformacionVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaInformacionVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaInformacionVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
        } catch (ClassNotFoundException ex) {
            //Logger.getLogger(VistaInicio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            //Logger.getLogger(VistaInicio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            //Logger.getLogger(VistaInicio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            // Logger.getLogger(VistaInicio.class.getName()).log(Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaInformacionVentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargarTodoCompa;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JMenu menuInformacionCompras;
    public javax.swing.JMenuItem menuRegresarVentas;
    private javax.swing.JTable tablaVentas;
    // End of variables declaration//GEN-END:variables

}
