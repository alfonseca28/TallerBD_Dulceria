/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import Modelo.Conexion;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 * @author Erick Gonzalez, Damian Cazarin & Aaron Alfonseca
 */
public class VistaInformacionClientes extends javax.swing.JFrame {

    /**
     * Creates new form VistaInformacionClientes
     */
    public VistaInformacionClientes() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtBuscarClientes = new javax.swing.JTextField();
        btnBuscarClientes = new javax.swing.JButton();
        btnCargarTodoClientes = new javax.swing.JButton();
        btnEditarClientes = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuVistaInformacionClientes = new javax.swing.JMenu();
        menuRegresarInformacionClientes = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Información Clientes");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        jLabel1.setText("Información Clientes");

        tablaClientes.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "IdCliente", "Nombre", "ApPaterno", "ApMaterno", "Telefono", "Direccion", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaClientes);
        if (tablaClientes.getColumnModel().getColumnCount() > 0) {
            tablaClientes.getColumnModel().getColumn(0).setResizable(false);
            tablaClientes.getColumnModel().getColumn(0).setPreferredWidth(30);
            tablaClientes.getColumnModel().getColumn(1).setResizable(false);
            tablaClientes.getColumnModel().getColumn(2).setResizable(false);
            tablaClientes.getColumnModel().getColumn(3).setResizable(false);
            tablaClientes.getColumnModel().getColumn(4).setResizable(false);
            tablaClientes.getColumnModel().getColumn(5).setResizable(false);
            tablaClientes.getColumnModel().getColumn(5).setPreferredWidth(100);
            tablaClientes.getColumnModel().getColumn(6).setResizable(false);
            tablaClientes.getColumnModel().getColumn(6).setPreferredWidth(100);
        }

        jLabel2.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel2.setText("Buscar  IdEspecifico");

        txtBuscarClientes.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N

        btnBuscarClientes.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        btnBuscarClientes.setText("Buscar");
        btnBuscarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClientesActionPerformed(evt);
            }
        });

        btnCargarTodoClientes.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        btnCargarTodoClientes.setText("Cagar todos los registros");
        btnCargarTodoClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarTodoClientesActionPerformed(evt);
            }
        });

        btnEditarClientes.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        btnEditarClientes.setText("Agregar, Modificar o Dar de baja registros");
        btnEditarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarClientesActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jButton1.setText("Limpiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jButton2.setText("Mostrar Clientes más frecuentes");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jMenuVistaInformacionClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graficos/icon_opciones16.png"))); // NOI18N
        jMenuVistaInformacionClientes.setText("Opciones");
        jMenuVistaInformacionClientes.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N

        menuRegresarInformacionClientes.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        menuRegresarInformacionClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graficos/icon_regresar16.png"))); // NOI18N
        menuRegresarInformacionClientes.setText("Regresar");
        jMenuVistaInformacionClientes.add(menuRegresarInformacionClientes);

        jMenuBar1.add(jMenuVistaInformacionClientes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscarClientes))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCargarTodoClientes)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditarClientes)
                        .addGap(29, 29, 29)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 818, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtBuscarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarClientes))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCargarTodoClientes)
                    .addComponent(btnEditarClientes)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClientesActionPerformed

        DefaultTableModel modelotabla = new DefaultTableModel();
        tablaClientes.setModel(modelotabla);

        PreparedStatement ps = null;
        ResultSet rs = null;

        Conexion con = new Conexion();
        Connection conexion = con.getconnection();

        try {
            ps = conexion.prepareStatement("Select idCliente,nombre,apellidoPaterno,apellidoMaterno,telefono,direccion,email,estado from cliente where idCliente = ?");
            ps.setInt(1, Integer.parseInt(txtBuscarClientes.getText()));

            rs = ps.executeQuery();

            modelotabla.addColumn("IdCliente");
            modelotabla.addColumn("Nombre");
            modelotabla.addColumn("ApPaterno");
            modelotabla.addColumn("ApMaterno");
            modelotabla.addColumn("Telefono");
            modelotabla.addColumn("Direccion");
            modelotabla.addColumn("Email");
            modelotabla.addColumn("Estado");

            while (rs.next()) {
                Object fila[] = new Object[8];
                for (int i = 1; i <= 8; i++) {
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

    }//GEN-LAST:event_btnBuscarClientesActionPerformed

    private void btnEditarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarClientesActionPerformed

    private void btnCargarTodoClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarTodoClientesActionPerformed
        DefaultTableModel modelotabla = new DefaultTableModel();
        tablaClientes.setModel(modelotabla);

        PreparedStatement ps = null;
        ResultSet rs = null;

        Conexion con = new Conexion();
        Connection conexion = con.getconnection();

        try {
            ps = conexion.prepareStatement("Select idCliente,nombre,apellidoPaterno,apellidoMaterno,telefono,direccion,email,estado from cliente ");

            rs = ps.executeQuery();

            modelotabla.addColumn("IdCliente");
            modelotabla.addColumn("Nombre");
            modelotabla.addColumn("ApPaterno");
            modelotabla.addColumn("ApMaterno");
            modelotabla.addColumn("Telefono");
            modelotabla.addColumn("Direccion");
            modelotabla.addColumn("Email");
            modelotabla.addColumn("Estado");

            while (rs.next()) {
                Object fila[] = new Object[8];
                for (int i = 1; i <= 8; i++) {
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
    }//GEN-LAST:event_btnCargarTodoClientesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel modelotabla = new DefaultTableModel();
        tablaClientes.setModel(modelotabla);
        modelotabla.setNumRows(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel modelotabla = new DefaultTableModel();
        tablaClientes.setModel(modelotabla);

        PreparedStatement ps = null;
        ResultSet rs = null;

        Conexion con = new Conexion();
        Connection conexion = con.getconnection();

        try {
            ps = conexion.prepareStatement("SELECT venta.idCliente, cliente.nombre AS NombreCliente, cliente.apellidoPaterno AS ApellidoCliente, SUM(precio) AS Importe, COUNT(venta.idcliente) AS Total\n"
                    + "FROM venta, cliente\n"
                    + "WHERE venta.idCliente = cliente.idCliente\n"
                    + "GROUP BY cliente.idcliente ORDER BY Importe DESC;");

            rs = ps.executeQuery();

            modelotabla.addColumn("IdCliente");
            modelotabla.addColumn("Nombre");
            modelotabla.addColumn("ApPaterno");
            modelotabla.addColumn("Importe");
            modelotabla.addColumn("Total ventas");

            while (rs.next()) {
                Object fila[] = new Object[5];
                for (int i = 1; i <= 5; i++) {
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
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(VistaInformacionClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaInformacionClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaInformacionClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaInformacionClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new VistaInformacionClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnBuscarClientes;
    public javax.swing.JButton btnCargarTodoClientes;
    public javax.swing.JButton btnEditarClientes;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    public javax.swing.JMenu jMenuVistaInformacionClientes;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JMenuItem menuRegresarInformacionClientes;
    public javax.swing.JTable tablaClientes;
    public javax.swing.JTextField txtBuscarClientes;
    // End of variables declaration//GEN-END:variables
}
