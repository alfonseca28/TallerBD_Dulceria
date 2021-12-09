/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import Modelo.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Erick Gonzalez
 */
public class VistaInformacionProveedores extends javax.swing.JFrame {

    /**
     * Creates new form VistaInformacionProveedores
     */
    public VistaInformacionProveedores() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProveedores = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtBuscarProveedor = new javax.swing.JTextField();
        btnBuscarProveedores = new javax.swing.JButton();
        btnCargarTodoProveedor = new javax.swing.JButton();
        btnEditarProveedor = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuVistaInformacionProveedores = new javax.swing.JMenu();
        menuRegresarInformacionProveedores = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Informacion Proveedores");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Dulceria Itver");

        tablaProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "IdProveedor", "Nombre", "Direccion", "Telefono", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaProveedores);
        if (tablaProveedores.getColumnModel().getColumnCount() > 0) {
            tablaProveedores.getColumnModel().getColumn(0).setResizable(false);
            tablaProveedores.getColumnModel().getColumn(1).setResizable(false);
            tablaProveedores.getColumnModel().getColumn(2).setResizable(false);
            tablaProveedores.getColumnModel().getColumn(3).setResizable(false);
            tablaProveedores.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Buscar  por Id Especifico:");

        btnBuscarProveedores.setText("Buscar");
        btnBuscarProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProveedoresActionPerformed(evt);
            }
        });

        btnCargarTodoProveedor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCargarTodoProveedor.setText("Cagar todos los registros");
        btnCargarTodoProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarTodoProveedorActionPerformed(evt);
            }
        });

        btnEditarProveedor.setText("Añadir, Modificar o Eliminar registro");

        jButton1.setText("Limpiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jMenuVistaInformacionProveedores.setText("Opciones");

        menuRegresarInformacionProveedores.setText("Regresar");
        jMenuVistaInformacionProveedores.add(menuRegresarInformacionProveedores);

        jMenuBar1.add(jMenuVistaInformacionProveedores);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBuscarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBuscarProveedores))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCargarTodoProveedor)
                                .addGap(30, 30, 30)
                                .addComponent(btnEditarProveedor)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 130, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtBuscarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarProveedores))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCargarTodoProveedor)
                    .addComponent(btnEditarProveedor)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(138, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProveedoresActionPerformed
        DefaultTableModel modelotabla = new DefaultTableModel();
        tablaProveedores.setModel(modelotabla);

        PreparedStatement ps = null;
        ResultSet rs = null;

        Conexion con = new Conexion();
        Connection conexion = con.getconnection();

        try {
            ps = conexion.prepareStatement("Select * from proveedor where idProveedor = ?");
            ps.setInt(1, Integer.parseInt(txtBuscarProveedor.getText()));

            rs = ps.executeQuery();

            modelotabla.addColumn("IdCliente");
            modelotabla.addColumn("Nombre");                               
            modelotabla.addColumn("Direccion");
            modelotabla.addColumn("Telefono");
            modelotabla.addColumn("Email");
            modelotabla.addColumn("Estado");
            
            while(rs.next()){
                Object fila [] = new Object [6];
                for(int i =1 ; i<= 6;i++){
                fila[i-1] = rs.getObject(i);
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
    }//GEN-LAST:event_btnBuscarProveedoresActionPerformed

    private void btnCargarTodoProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarTodoProveedorActionPerformed
        DefaultTableModel modelotabla = new DefaultTableModel();
        tablaProveedores.setModel(modelotabla);

        PreparedStatement ps = null;
        ResultSet rs = null;

        Conexion con = new Conexion();
        Connection conexion = con.getconnection();

        try {
            ps = conexion.prepareStatement("Select * from proveedor where idProveedor ");
            

            rs = ps.executeQuery();

            modelotabla.addColumn("IdCliente");
            modelotabla.addColumn("Nombre");                               
            modelotabla.addColumn("Direccion");
            modelotabla.addColumn("Telefono");
            modelotabla.addColumn("Email");
            modelotabla.addColumn("Estado");
            
            while(rs.next()){
                Object fila [] = new Object [6];
                for(int i =1 ; i<= 6;i++){
                fila[i-1] = rs.getObject(i);
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
    }//GEN-LAST:event_btnCargarTodoProveedorActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           DefaultTableModel modelotabla = new DefaultTableModel();
        tablaProveedores.setModel(modelotabla);
        modelotabla.setNumRows(0);
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
            java.util.logging.Logger.getLogger(VistaInformacionProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaInformacionProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaInformacionProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaInformacionProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new VistaInformacionProveedores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarProveedores;
    private javax.swing.JButton btnCargarTodoProveedor;
    public javax.swing.JButton btnEditarProveedor;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuVistaInformacionProveedores;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JMenuItem menuRegresarInformacionProveedores;
    private javax.swing.JTable tablaProveedores;
    private javax.swing.JTextField txtBuscarProveedor;
    // End of variables declaration//GEN-END:variables
}
