/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemasiget2;

import ec.edu.unach.siget.rnegocio.vistas.*;
import ec.edu.unach.siget.rnegocio.vistas.FrmUsuario;
import javax.swing.ImageIcon;
import javax.swing.border.Border;

/**
 *
 * @author JORGE
 */
public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("../ec/edu/unach/siget/rnegocio/Imagenes/LogoUnach.jpg")).getImage());
        escritorio.setBorder(new Imagen());
        this.setExtendedState(FrmPrincipal.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuInicio = new javax.swing.JMenu();
        MenuFacultad = new javax.swing.JMenu();
        MenuAdministrar = new javax.swing.JMenuItem();
        MenuCarrera = new javax.swing.JMenu();
        MenuGestionar = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        MenuUsuario = new javax.swing.JMenu();
        MenuGestionUsuario = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        escritorio.setBackground(new java.awt.Color(255, 255, 255));
        escritorio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        escritorio.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 626, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 402, Short.MAX_VALUE)
        );

        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        MenuInicio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        MenuInicio.setText("Inicio");
        MenuInicio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuBar1.add(MenuInicio);

        MenuFacultad.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        MenuFacultad.setText("Facultad");
        MenuFacultad.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N

        MenuAdministrar.setText("GESTIONAR");
        MenuAdministrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAdministrarActionPerformed(evt);
            }
        });
        MenuFacultad.add(MenuAdministrar);

        jMenuBar1.add(MenuFacultad);

        MenuCarrera.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        MenuCarrera.setText("Carreras");
        MenuCarrera.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        MenuCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCarreraActionPerformed(evt);
            }
        });

        MenuGestionar.setText("GESTIONAR");
        MenuGestionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuGestionarActionPerformed(evt);
            }
        });
        MenuCarrera.add(MenuGestionar);

        jMenuBar1.add(MenuCarrera);

        jMenu1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu1.setText("Niveles");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N

        jMenuItem1.setText("GESTIONAR");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        MenuUsuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        MenuUsuario.setText("Usuarios");
        MenuUsuario.setFocusable(false);
        MenuUsuario.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N

        MenuGestionUsuario.setText("Gestiona Usuarios");
        MenuGestionUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuGestionUsuarioActionPerformed(evt);
            }
        });
        MenuUsuario.add(MenuGestionUsuario);

        jMenuBar1.add(MenuUsuario);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorio)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCarreraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuCarreraActionPerformed

    private void MenuGestionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuGestionarActionPerformed
        FrmEscuela frmescuela = new FrmEscuela();
        escritorio.add(frmescuela);
        frmescuela.show();
    }//GEN-LAST:event_MenuGestionarActionPerformed

    private void MenuGestionUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuGestionUsuarioActionPerformed
        FrmUsuario frmusuario = new FrmUsuario();
        escritorio.add(frmusuario);
        frmusuario.show();     }//GEN-LAST:event_MenuGestionUsuarioActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        FrmNiveles frmnivel = new FrmNiveles();
        escritorio.add(frmnivel);
        frmnivel.show();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void MenuAdministrarActionPerformed(java.awt.event.ActionEvent evt) {
        FrmFacultades frmfacultad = new FrmFacultades();
        escritorio.add(frmfacultad);
        frmfacultad.show();
    }

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FrmPrincipal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuAdministrar;
    private javax.swing.JMenu MenuCarrera;
    private javax.swing.JMenu MenuFacultad;
    private javax.swing.JMenuItem MenuGestionUsuario;
    private javax.swing.JMenuItem MenuGestionar;
    private javax.swing.JMenu MenuInicio;
    private javax.swing.JMenu MenuUsuario;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
