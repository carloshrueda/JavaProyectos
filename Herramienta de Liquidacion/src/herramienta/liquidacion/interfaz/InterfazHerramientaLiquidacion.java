/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herramienta.liquidacion.interfaz;

import java.awt.Button;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JOptionPane;
import java.time.format.*;

import herramienta.liquidacion.mundo.*;

/**
 *
 * @author CRUEDA
 */
public class InterfazHerramientaLiquidacion extends javax.swing.JFrame {
    private Persona persona;

    /**
     * Creates new form InterfazHerramientaLiquidacion
     */
    public InterfazHerramientaLiquidacion() {
        initComponents();
        this.getContentPane().setBackground(java.awt.Color.LIGHT_GRAY);

        //Se agregan los botones de C.C. y C.E. al botongroup
        btngrpTipoDocumento.add(jrbtnCC);
        btngrpTipoDocumento.add(jrbtnCE);

        //Se agregan los botones de Salario, liquidación e Indenmización 
        //al botongroup
        btngrpTipoCalculo.add(jrbtnSalario);
        btngrpTipoCalculo.add(jrbtnLiquidacion);
        btngrpTipoCalculo.add(jrbtnIndenmizacion);

        limpiarFormulario();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngrpTipoDocumento = new javax.swing.ButtonGroup();
        btngrpTipoCalculo = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jrbtnCC = new javax.swing.JRadioButton();
        jrbtnCE = new javax.swing.JRadioButton();
        jtxtNumDoc = new javax.swing.JTextField();
        jtxtPrimerNom = new javax.swing.JTextField();
        jtxtSegNombre = new javax.swing.JTextField();
        jtxtPrimerApel = new javax.swing.JTextField();
        jtxtSegApel = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jfmtxtInicio = new javax.swing.JFormattedTextField();
        jfmtxtFin = new javax.swing.JFormattedTextField();
        jrbtnSalario = new javax.swing.JRadioButton();
        jrbtnLiquidacion = new javax.swing.JRadioButton();
        jrbtnIndenmizacion = new javax.swing.JRadioButton();
        jbtnCalcular = new javax.swing.JButton();
        jbtnLimpiar = new javax.swing.JButton();
        jbtnSalir = new javax.swing.JButton();
        jftxtSalBas = new javax.swing.JFormattedTextField();
        jftxtAuxTx = new javax.swing.JFormattedTextField();
        jftxtDiasLab = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Herramienta de liquidación");
        setBackground(java.awt.Color.lightGray);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Herramienta de Liquidación");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Tipo de documento");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Tipo de cálculo");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Primer nombre");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Segundo nombre");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Fin");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Auxilio de transporte");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Primer apellido");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Segundo apellido");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Dias laborados");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Número de documento");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Inicio");

        jrbtnCC.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jrbtnCC.setText("C.C.");

        jrbtnCE.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jrbtnCE.setText("C.E");

        jtxtNumDoc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtxtNumDoc.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtxtNumDoc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtxtFocusLost(evt);
            }
        });

        jtxtPrimerNom.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtxtPrimerNom.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtxtPrimerNom.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtxtFocusLost(evt);
            }
        });

        jtxtSegNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtxtSegNombre.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtxtSegNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtxtFocusLost(evt);
            }
        });

        jtxtPrimerApel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtxtPrimerApel.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtxtPrimerApel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtxtFocusLost(evt);
            }
        });

        jtxtSegApel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtxtSegApel.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtxtSegApel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtxtFocusLost(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("Salario básico");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("Periodo liquidado");

        jfmtxtInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd-MMM-yyyy"))));
        jfmtxtInicio.setToolTipText("dd-mes-yyyy");
        jfmtxtInicio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jfmtxtInicio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtxtFocusLost(evt);
            }
        });

        jfmtxtFin.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd-MMM-yyyy"))));
        jfmtxtFin.setToolTipText("dd-mes-yyyy");
        jfmtxtFin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jfmtxtFin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtxtFocusLost(evt);
            }
        });

        jrbtnSalario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jrbtnSalario.setText("Salario");

        jrbtnLiquidacion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jrbtnLiquidacion.setText("Liquidación");

        jrbtnIndenmizacion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jrbtnIndenmizacion.setText("Indemnización");

        jbtnCalcular.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnCalcular.setMnemonic('C');
        jbtnCalcular.setText("Calcular");
        jbtnCalcular.setToolTipText("Calcula el salario");
        jbtnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCalcularActionPerformed(evt);
            }
        });

        jbtnLimpiar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnLimpiar.setMnemonic('l');
        jbtnLimpiar.setText("Limpiar");
        jbtnLimpiar.setToolTipText("Limpia el formulario");
        jbtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLimpiarActionPerformed(evt);
            }
        });

        jbtnSalir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnSalir.setMnemonic('s');
        jbtnSalir.setText("Salir");
        jbtnSalir.setToolTipText("Sale de la aplicación");
        jbtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSalirActionPerformed(evt);
            }
        });

        jftxtSalBas.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));
        jftxtSalBas.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jftxtSalBas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jftxtSalBas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtxtFocusLost(evt);
            }
        });

        jftxtAuxTx.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));
        jftxtAuxTx.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jftxtAuxTx.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jftxtAuxTx.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtxtFocusLost(evt);
            }
        });

        jftxtDiasLab.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##"))));
        jftxtDiasLab.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jftxtDiasLab.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jftxtDiasLab.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtxtFocusLost(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtPrimerNom, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtSegNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtPrimerApel, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtSegApel, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jfmtxtFin, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jfmtxtInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19)
                            .addComponent(jtxtNumDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jrbtnIndenmizacion, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jrbtnSalario)
                                        .addGap(61, 61, 61)
                                        .addComponent(jrbtnLiquidacion)
                                        .addGap(159, 159, 159))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jftxtDiasLab, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jftxtSalBas, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jftxtAuxTx, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 12, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2)
                        .addGap(33, 33, 33)
                        .addComponent(jrbtnCC)
                        .addGap(18, 18, 18)
                        .addComponent(jrbtnCE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jbtnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122)
                .addComponent(jbtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addComponent(jbtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2)
                    .addComponent(jrbtnCC)
                    .addComponent(jrbtnCE)
                    .addComponent(jLabel14))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jtxtPrimerNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jtxtNumDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel5)
                    .addComponent(jtxtSegNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel11)
                    .addComponent(jtxtPrimerApel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(jfmtxtInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel12)
                    .addComponent(jtxtSegApel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jfmtxtFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel13)
                    .addComponent(jLabel18)
                    .addComponent(jLabel9)
                    .addComponent(jftxtSalBas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jftxtAuxTx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jftxtDiasLab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jrbtnSalario)
                    .addComponent(jrbtnLiquidacion)
                    .addComponent(jrbtnIndenmizacion))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnCalcular)
                    .addComponent(jbtnLimpiar)
                    .addComponent(jbtnSalir))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtFocusGained
        ((javax.swing.JTextField) evt.getComponent()).setBackground(java.awt.Color.YELLOW);
    }//GEN-LAST:event_jtxtFocusGained

    private void jtxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtFocusLost

        ((javax.swing.JTextField) evt.getComponent()).setBackground(java.awt.Color.WHITE);
    }//GEN-LAST:event_jtxtFocusLost

    private void jbtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jbtnSalirActionPerformed

    private void jbtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLimpiarActionPerformed
        limpiarFormulario();
    }//GEN-LAST:event_jbtnLimpiarActionPerformed

    private void jbtnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCalcularActionPerformed
        persona= new Persona();
        
        //Asignar el tipo de documento a la persona
        if (jrbtnCC.isSelected()) {
            persona.setTipodoc(TipoDocumento.CC);
        } else {
            persona.setTipodoc(TipoDocumento.CE);
        }
        
        //Validar el primer nombre
        String strnombre = jtxtPrimerNom.getText();
        strnombre = strnombre.trim();
        if (strnombre.isEmpty()) {
            jtxtPrimerNom.requestFocus();
            JOptionPane.showMessageDialog(null, "Nombre invalido", "", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            persona.setPrimNombre(strnombre);
            
        }
    }//GEN-LAST:event_jbtnCalcularActionPerformed

    private void limpiarFormulario() {
        jrbtnCC.setSelected(true);
        jrbtnSalario.setSelected(true);
        jtxtPrimerNom.setText("");
        jtxtSegNombre.setText("");
        jtxtPrimerApel.setText("");
        jtxtSegApel.setText("");
        jftxtDiasLab.setText("0");
        jftxtSalBas.setText("$0");
        jftxtAuxTx.setText("$0");
        jtxtNumDoc.setText("");
        jfmtxtInicio.setText("");
        jfmtxtFin.setText("");
    }

    /**
     * * @param args the command line arguments
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
            java.util.logging.Logger.getLogger(InterfazHerramientaLiquidacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazHerramientaLiquidacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazHerramientaLiquidacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazHerramientaLiquidacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazHerramientaLiquidacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btngrpTipoCalculo;
    private javax.swing.ButtonGroup btngrpTipoDocumento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jbtnCalcular;
    private javax.swing.JButton jbtnLimpiar;
    private javax.swing.JButton jbtnSalir;
    private javax.swing.JFormattedTextField jfmtxtFin;
    private javax.swing.JFormattedTextField jfmtxtInicio;
    private javax.swing.JFormattedTextField jftxtAuxTx;
    private javax.swing.JFormattedTextField jftxtDiasLab;
    private javax.swing.JFormattedTextField jftxtSalBas;
    private javax.swing.JRadioButton jrbtnCC;
    private javax.swing.JRadioButton jrbtnCE;
    private javax.swing.JRadioButton jrbtnIndenmizacion;
    private javax.swing.JRadioButton jrbtnLiquidacion;
    private javax.swing.JRadioButton jrbtnSalario;
    private javax.swing.JTextField jtxtNumDoc;
    private javax.swing.JTextField jtxtPrimerApel;
    private javax.swing.JTextField jtxtPrimerNom;
    private javax.swing.JTextField jtxtSegApel;
    private javax.swing.JTextField jtxtSegNombre;
    // End of variables declaration//GEN-END:variables
}
