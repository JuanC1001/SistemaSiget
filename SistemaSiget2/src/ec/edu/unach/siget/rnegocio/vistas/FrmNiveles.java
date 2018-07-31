/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.unach.siget.rnegocio.vistas;

import com.mxrck.autocompleter.TextAutoCompleter;
import static com.sun.java.accessibility.util.AWTEventMonitor.addWindowListener;
import ec.edu.unach.siget.dao.contrato.IEscuela;
import ec.edu.unach.siget.dao.contrato.INivel;
import ec.edu.unach.siget.dao.implementacion.EscuelaImp;
import ec.edu.unach.siget.dao.implementacion.NivelImp;
import ec.edu.unach.siget.rnegocio.entidades.Escuela;
import ec.edu.unach.siget.rnegocio.entidades.Nivel;
import ec.edu.unach.siget.rnegocio.vistas.FrmEscuela;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MI PC
 */
public class FrmNiveles extends javax.swing.JInternalFrame {
     private TextAutoCompleter auto;
    /**
     * Creates new form Niveles
     */
    public FrmNiveles() {
    initComponents();
        txtCodigo.setEnabled(true);
        txtNombre.setEnabled(true);
        txtCodigoSicoa.setEnabled(true);
        txtParalelo.setEnabled(false);
        txtModalidad.setEnabled(false);
        cmbEscuela.setEnabled(true);
        

        btnInsertar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnNuevo.setEnabled(true);
        btnBuscar.setEnabled(true);
        btnModificar.setEnabled(false);
        btnCancelar.setEnabled(true);
        btnCancelar.setVisible(false);
        btnGuardar.setVisible(false);
        btnInsertar.setVisible(false);
        
        auto = new TextAutoCompleter(txtNombre);
        
        NivelImp niveldao = new NivelImp();
    
        List<Nivel> lstnivel = new ArrayList<>();
        try {
            lstnivel = niveldao.obtener();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Error", JOptionPane.INFORMATION_MESSAGE);
        }
        for (int i = 0; i < lstnivel.size(); i++) {
            auto.addItem(lstnivel.get(i).getNombre());
        }

        IEscuela escueladao = new EscuelaImp();
        List<Escuela> lstCategoria = new ArrayList<>();
        try {
            lstCategoria = escueladao.obtener();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Error", JOptionPane.INFORMATION_MESSAGE);
        }
        for (int i = 0; i < lstCategoria.size(); i++) {
            cmbEscuela.addItem(lstCategoria.get(i));
        }

        
        
           setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
           addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                cerrar();
            }

        });
        
    }
    public void cerrar() {
        int valor = JOptionPane.showConfirmDialog(this, "¿Esta seguro que desea cerrar?", "Advertencia", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (valor == JOptionPane.YES_OPTION) {
            //this.dispose();
        }
    }
     public void modificar() throws Exception {
        int valor = JOptionPane.showConfirmDialog(this, "¿Esta seguro que desea modificar la escuela?", "Advertencia", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (valor == JOptionPane.YES_OPTION) {
            Nivel nivel = new Nivel();
            NivelImp niveldao = new NivelImp();
            IEscuela escueladao = new EscuelaImp();

            nivel.setCodigo(Integer.parseInt(this.txtCodigo.getText()));
             nivel.setCodigo_Sicoa(Integer.parseInt(this.txtCodigo.getText()));
              nivel.setNombre(this.txtNombre.getText());
              nivel.setParalelo(this.txtParalelo.getText());
              nivel.setModalidad(this.txtModalidad.getText());
             nivel.setEscuela(escueladao.obtener(((Escuela) cmbEscuela.getSelectedItem()).getCodigo()));
                      
            
            
            if (niveldao.modificar(nivel) > 0) {
                JOptionPane.showMessageDialog(this, "Nivel Modificada!!",
                        "Satisfactorio", JOptionPane.INFORMATION_MESSAGE);
        
        txtCodigo.setEnabled(true);
        txtNombre.setEnabled(true);
        txtCodigoSicoa.setEnabled(true);
        txtParalelo.setEnabled(false);
        txtModalidad.setEnabled(false);
        cmbEscuela.setEnabled(true);
        

        btnInsertar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnNuevo.setEnabled(true);
        btnBuscar.setEnabled(true);
        btnModificar.setEnabled(false);
        btnCancelar.setEnabled(true);
        btnCancelar.setVisible(false);
        btnGuardar.setVisible(false);
        btnInsertar.setVisible(false);
        cargarTabla();
            } else {
                JOptionPane.showMessageDialog(this, "Nivel NO Modificada!!",
                        "Transacción no realizada", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
public void eliminar() {
        int valor = JOptionPane.showConfirmDialog(this, "¿Esta seguro que desea eliminar ?", "Advertencia", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (valor == JOptionPane.YES_OPTION) {
            INivel niveldao = new NivelImp();
                      
            try {
                Nivel nivel = new Nivel();

                nivel = niveldao.obtener(Integer.parseInt(txtCodigo.getText()));
                if (niveldao.eliminar(nivel) > 0) {
                    JOptionPane.showMessageDialog(this, "Nivel eliminada!!",
                            "Satisfactorio", JOptionPane.INFORMATION_MESSAGE);
        txtCodigo.setEnabled(true);
        txtNombre.setEnabled(true);
        txtCodigoSicoa.setEnabled(true);
        txtParalelo.setEnabled(false);
        txtModalidad.setEnabled(false);
        cmbEscuela.setEnabled(true);
        

        btnInsertar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnNuevo.setEnabled(true);
        btnBuscar.setEnabled(true);
        btnModificar.setEnabled(false);
        btnCancelar.setEnabled(true);
        btnCancelar.setVisible(false);
        btnGuardar.setVisible(false);
        btnInsertar.setVisible(false);
         cargarTabla();
                } else {
                    JOptionPane.showMessageDialog(this, "Escuela NO Eliminado!!",
                            "Transacción no realizada", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage(),
                        "Error", JOptionPane.INFORMATION_MESSAGE);
            }
        }
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtParalelo = new javax.swing.JTextField();
        txtModalidad = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCodigoSicoa = new javax.swing.JTextField();
        cmbEscuela = new javax.swing.JComboBox();
        jPanel4 = new javax.swing.JPanel();
        btnListar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnInsertar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblListarNivel = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Nivel");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(jLabel1)
                .addContainerGap(306, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Codigo");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Codigo Sicoa");

        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtParalelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtParaleloActionPerformed(evt);
            }
        });

        txtModalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModalidadActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Nombre");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Paralelo");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Modalidad");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Escuela");

        txtCodigoSicoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoSicoaActionPerformed(evt);
            }
        });

        cmbEscuela.setEditable(true);
        cmbEscuela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEscuelaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre)
                    .addComponent(txtCodigo)
                    .addComponent(txtParalelo)
                    .addComponent(txtModalidad)
                    .addComponent(txtCodigoSicoa)
                    .addComponent(cmbEscuela, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtCodigoSicoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtParalelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtModalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))))
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cmbEscuela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(new javax.swing.border.MatteBorder(null));

        btnListar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/unach/siget/rnegocio/Imagenes/Listar.png"))); // NOI18N
        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/unach/siget/rnegocio/Imagenes/Modificar.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/unach/siget/rnegocio/Imagenes/Eliminar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/unach/siget/rnegocio/Imagenes/Buscar.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnNuevo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/unach/siget/rnegocio/Imagenes/Nuevo.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnInsertar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/unach/siget/rnegocio/Imagenes/Aceptar.png"))); // NOI18N
        btnInsertar.setText("Insertar");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/unach/siget/rnegocio/Imagenes/Cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/unach/siget/rnegocio/Imagenes/Guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                    .addComponent(btnInsertar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnListar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(btnListar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar)
                .addGap(5, 5, 5)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnInsertar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblListarNivel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblListarNivel);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 466, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtParaleloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtParaleloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtParaleloActionPerformed

    private void txtModalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModalidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModalidadActionPerformed

    private void txtCodigoSicoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoSicoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoSicoaActionPerformed

    private void cmbEscuelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEscuelaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbEscuelaActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        cargarTabla();
    }//GEN-LAST:event_btnListarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        btnInsertar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnNuevo.setEnabled(false);
        btnBuscar.setEnabled(false);
        btnModificar.setEnabled(false);
        btnCancelar.setEnabled(true);
        btnCancelar.setVisible(true);
        btnGuardar.setVisible(true);
        btnGuardar.setEnabled(true);

        txtCodigo.setEnabled(false);
        cmbEscuela.setEnabled(true);
        txtNombre.setEnabled(true);
        txtParalelo.setEnabled(true);
        txtModalidad.setEnabled(true);
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        eliminar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        INivel niveldao = new NivelImp();
        Nivel nivel = new Nivel();
        try {
            nivel = niveldao.obtener(Integer.parseInt(txtCodigo.getText()));
            if (nivel != null) {
                txtCodigo.setText(String.valueOf(nivel.getCodigo()));
                txtNombre.setText(String.valueOf(nivel.getNombre()));
                txtParalelo.setText(String.valueOf(nivel.getParalelo()));
                txtModalidad.setText(String.valueOf(nivel.getParalelo()));
                cmbEscuela.setSelectedItem(nivel.getEscuela().toString());

                btnEliminar.setEnabled(true);
                btnModificar.setEnabled(true);
                btnCancelar.setEnabled(true);
                btnCancelar.setVisible(true);
                btnBuscar.setEnabled(false);

                txtCodigo.setEnabled(false);
                cmbEscuela.setEnabled(false);
                txtNombre.setEnabled(false);
                txtParalelo.setEnabled(false);
                txtModalidad.setEnabled(false);

            } else {
                txtCodigo.setText(null);
                JOptionPane.showMessageDialog(this, "No existe ningun nivel con ese codigo",
                    "Buscar", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "No existe ninguna nivel con ese codigo",
                "Buscar", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        btnInsertar.setEnabled(true);
        btnEliminar.setEnabled(false);
        btnNuevo.setEnabled(false);
        btnBuscar.setEnabled(false);
        btnModificar.setEnabled(false);
        btnCancelar.setVisible(true);
        btnInsertar.setVisible(true);
        btnCancelar.setEnabled(true);

        txtCodigo.setEnabled(true);
        cmbEscuela.setEnabled(true);
        txtNombre.setEnabled(true);
        txtParalelo.setEnabled(true);
        txtModalidad.setEnabled(true);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed

        Nivel nivel = new Nivel();
        NivelImp niveldao = new NivelImp();
        IEscuela escueladao = new EscuelaImp();
        nivel.setCodigo(Integer.parseInt(this.txtCodigo.getText()));

        try {

            nivel.setEscuela(escueladao.obtener(((Escuela) cmbEscuela.getSelectedItem()).getCodigo()));

        } catch (Exception ex6) {
            JOptionPane.showMessageDialog(this, ex6.getMessage(),
                "Error en obtener la Escuela", JOptionPane.INFORMATION_MESSAGE);
        }
        nivel.setNombre(this.txtNombre.getText());
        nivel.setParalelo(this.txtParalelo.getText());
        nivel.setModalidad(this.txtModalidad.getText());
        nivel.setCodigo_Sicoa(Integer.parseInt(this.txtCodigoSicoa.getText()));

        if (niveldao.insertar(nivel) > 0) {
            JOptionPane.showMessageDialog(this, "Nivel  insertado!!",
                "Satisfactorio", JOptionPane.INFORMATION_MESSAGE);
            btnInsertar.setEnabled(false);
            btnEliminar.setEnabled(false);
            btnNuevo.setEnabled(true);
            btnBuscar.setEnabled(true);
            btnModificar.setEnabled(false);
            btnCancelar.setEnabled(true);
            btnCancelar.setVisible(false);
            btnGuardar.setVisible(false);
            btnInsertar.setVisible(false);
            txtCodigo.setText(null);
            txtNombre.setText(null);
            txtParalelo.setText(null);
            txtModalidad.setText(null);

            txtCodigo.setEnabled(true);
            cmbEscuela.setEnabled(true);
            txtNombre.setEnabled(true);
            txtParalelo.setEnabled(false);
            txtModalidad.setEnabled(false);
            cargarTabla();
        } else {
            JOptionPane.showMessageDialog(this, "Nivel NO insertado!!",
                "Transacción no realizada", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        btnInsertar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnNuevo.setEnabled(true);
        btnBuscar.setEnabled(true);
        btnModificar.setEnabled(false);
        btnCancelar.setEnabled(true);
        btnCancelar.setVisible(false);
        btnGuardar.setVisible(false);
        btnInsertar.setVisible(false);

        txtCodigo.setText(null);
        txtNombre.setText(null);
        txtParalelo.setText(null);
        txtModalidad.setText(null);

        txtCodigo.setEnabled(true);
        cmbEscuela.setEnabled(true);
        txtNombre.setEnabled(true);
        txtParalelo.setEnabled(false);
        txtModalidad.setEnabled(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try {
            modificar();
        } catch (Exception ex) {
            Logger.getLogger(FrmEscuela.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed
private void cargarTabla() {
        INivel niveldao = new NivelImp();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Codigo");
        modelo.addColumn("Codigo Sicoa");
        modelo.addColumn("Nombre");
        modelo.addColumn("Paralelo");
        modelo.addColumn("Modalidad");
        modelo.addColumn("Escuela");
        List<Nivel> lstprov = new ArrayList<>();
        try {
        lstprov = niveldao.obtener();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Error de obtencion por aqui", JOptionPane.INFORMATION_MESSAGE);
        }
        for (Nivel prov : lstprov) {
            modelo.addRow(new Object[]{prov.getCodigo(), prov.getCodigo_Sicoa(), prov.getNombre(), prov.getParalelo(), prov.getModalidad(),prov.getEscuela()});
        }
        tblListarNivel.setModel(modelo);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    public static javax.swing.JComboBox cmbEscuela;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblListarNivel;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCodigoSicoa;
    private javax.swing.JTextField txtModalidad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtParalelo;
    // End of variables declaration//GEN-END:variables
}
