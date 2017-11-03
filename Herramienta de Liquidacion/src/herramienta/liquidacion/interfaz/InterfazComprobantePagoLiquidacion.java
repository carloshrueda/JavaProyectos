/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herramienta.liquidacion.interfaz;

import javax.swing.JOptionPane;

import herramienta.liquidacion.mundo.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CRUEDA
 */
public class InterfazComprobantePagoLiquidacion extends javax.swing.JFrame {

    private Persona persona;
    final long MILLSECS_PER_DAY = 24 * 60 * 60 * 1000;

    /**
     * Creates new form InterfazHerramientaLiquidacion
     */
    public InterfazComprobantePagoLiquidacion() {
        initComponents();
        this.getContentPane().setBackground(new java.awt.Color(204,255,204));

        //Se agregan los botones de C.C. y C.E. al botongroup
        btngrpTipoDocumento.add(jrbtnCC);
        btngrpTipoDocumento.add(jrbtnCE);

        persona = new Persona();
    }

    public InterfazComprobantePagoLiquidacion(Persona p) {
        initComponents();
        this.getContentPane().setBackground(new java.awt.Color(204,255,20));
        //Se agregan los botones de C.C. y C.E. al botongroup
        btngrpTipoDocumento.add(jrbtnCC);
        btngrpTipoDocumento.add(jrbtnCE);

        persona = new Persona(p);
        cargarFormulario();
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
        jbtnImprimir = new javax.swing.JButton();
        jbtnSalir = new javax.swing.JButton();
        jftxtSalBas = new javax.swing.JFormattedTextField();
        jftxtAuxTx = new javax.swing.JFormattedTextField();
        jftxtDiasLab = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jblsaldeven = new javax.swing.JLabel();
        jblEPS = new javax.swing.JLabel();
        jblPension = new javax.swing.JLabel();
        jblAuxTx = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jblSalNeto = new javax.swing.JLabel();
        jbltextopie = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Comprobante pago Liquidación");
        setBackground(new java.awt.Color(204, 255, 204));
        setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Comprobante Pago Liquidación");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Tipo de documento");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Operación");

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
        jrbtnCC.setEnabled(false);

        jrbtnCE.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jrbtnCE.setText("C.E");
        jrbtnCE.setEnabled(false);

        jtxtNumDoc.setEditable(false);
        jtxtNumDoc.setBackground(new java.awt.Color(255, 255, 255));
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

        jtxtPrimerNom.setEditable(false);
        jtxtPrimerNom.setBackground(new java.awt.Color(255, 255, 255));
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

        jtxtSegNombre.setEditable(false);
        jtxtSegNombre.setBackground(new java.awt.Color(255, 255, 255));
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

        jtxtPrimerApel.setEditable(false);
        jtxtPrimerApel.setBackground(new java.awt.Color(255, 255, 255));
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

        jtxtSegApel.setEditable(false);
        jtxtSegApel.setBackground(new java.awt.Color(255, 255, 255));
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

        jfmtxtInicio.setEditable(false);
        jfmtxtInicio.setBackground(new java.awt.Color(255, 255, 255));
        jfmtxtInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd-MMM-yyyy"))));
        jfmtxtInicio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jfmtxtInicio.setToolTipText("dd-mes-yyyy (i.e.: 12-may-2017)");
        jfmtxtInicio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jfmtxtInicio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtxtFocusLost(evt);
            }
        });

        jfmtxtFin.setEditable(false);
        jfmtxtFin.setBackground(new java.awt.Color(255, 255, 255));
        jfmtxtFin.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd-MMM-yyyy"))));
        jfmtxtFin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jfmtxtFin.setToolTipText("dd-mes-yyyy (i.e.: 12-may-2017)");
        jfmtxtFin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jfmtxtFin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtxtFocusLost(evt);
            }
        });

        jbtnImprimir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnImprimir.setMnemonic('C');
        jbtnImprimir.setText("Imprimir");
        jbtnImprimir.setToolTipText("Calcula el salario");
        jbtnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnImprimirActionPerformed(evt);
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

        jftxtSalBas.setEditable(false);
        jftxtSalBas.setBackground(new java.awt.Color(255, 255, 255));
        jftxtSalBas.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("¤#,##0"))));
        jftxtSalBas.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jftxtSalBas.setToolTipText("i.e.: $747000");
        jftxtSalBas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jftxtSalBas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtxtFocusLost(evt);
            }
        });

        jftxtAuxTx.setEditable(false);
        jftxtAuxTx.setBackground(new java.awt.Color(255, 255, 255));
        jftxtAuxTx.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("¤#,##0"))));
        jftxtAuxTx.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jftxtAuxTx.setToolTipText("i.e.: $54000");
        jftxtAuxTx.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jftxtAuxTx.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtxtFocusLost(evt);
            }
        });

        jftxtDiasLab.setEditable(false);
        jftxtDiasLab.setBackground(new java.awt.Color(255, 255, 255));
        jftxtDiasLab.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##"))));
        jftxtDiasLab.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jftxtDiasLab.setToolTipText("i.e.: 15");
        jftxtDiasLab.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jftxtDiasLab.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtxtFocusLost(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Item");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Valor");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("+");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setText("+");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setText("+");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel20.setText("+");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel21.setText("Prima");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel22.setText("Cesantias");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel23.setText("Vacaciones");

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel24.setText("Intereses de las Cesantias");

        jblsaldeven.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jblsaldeven.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jblsaldeven.setText("$0");

        jblEPS.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jblEPS.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jblEPS.setText("$0");

        jblPension.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jblPension.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jblPension.setText("$0");

        jblAuxTx.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jblAuxTx.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jblAuxTx.setText("$0");

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 51, 204));
        jLabel29.setText("Total a pagar");

        jblSalNeto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jblSalNeto.setForeground(new java.awt.Color(0, 51, 204));
        jblSalNeto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jblSalNeto.setText("$0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29)
                .addGap(157, 157, 157)
                .addComponent(jblSalNeto, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(jblSalNeto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        jbltextopie.setText("Fecha de liquidación: 03 de Febrero de 2017 - Liquidado por Fabio Atuesta Osorio");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
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
                                            .addComponent(jLabel14)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(151, 151, 151)
                                        .addComponent(jLabel6)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(82, 82, 82)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel8)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel18)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jftxtSalBas, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel9))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jftxtDiasLab, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(19, 19, 19)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel21)
                                            .addComponent(jLabel22)
                                            .addComponent(jLabel23)
                                            .addComponent(jLabel24))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jblsaldeven, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                                            .addComponent(jblEPS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jblPension, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jblAuxTx, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jftxtAuxTx, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(33, 33, 33)
                        .addComponent(jrbtnCC)
                        .addGap(18, 18, 18)
                        .addComponent(jrbtnCE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel10)
                            .addComponent(jLabel15)
                            .addComponent(jLabel17)
                            .addComponent(jLabel20))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(75, 75, 75))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jbtnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(307, 307, 307)
                                .addComponent(jbtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)))
                        .addComponent(jbltextopie))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89))))
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
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel21)
                    .addComponent(jblsaldeven))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel22)
                    .addComponent(jblEPS))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel23)
                    .addComponent(jblPension))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel24)
                    .addComponent(jblAuxTx))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jbltextopie)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnImprimir)
                    .addComponent(jbtnSalir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtFocusGained
        //((javax.swing.JTextField) evt.getComponent()).setBackground(java.awt.Color.YELLOW);
    }//GEN-LAST:event_jtxtFocusGained

    private void jtxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtFocusLost
        //((javax.swing.JTextField) evt.getComponent()).setBackground(java.awt.Color.WHITE);
    }//GEN-LAST:event_jtxtFocusLost

    private void jbtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSalirActionPerformed
        //this.dispose();
        this.setVisible(false);
    }//GEN-LAST:event_jbtnSalirActionPerformed

    private void jbtnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnImprimirActionPerformed

    }//GEN-LAST:event_jbtnImprimirActionPerformed

    public boolean isNumeric(String cadena) {

        boolean resultado;

        try {

            Integer.parseInt(cadena);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }

        return resultado;
    }

    public void cargarFormulario() {
        if (this.persona.getTipodoc() == TipoDocumento.CC){
            jrbtnCC.setSelected(true);
        } else {
           jrbtnCE.setSelected(true); 
        }

        jtxtPrimerNom.setText(this.persona.getPrimNombre());
        jtxtSegNombre.setText(this.persona.getSegNombre());
        jtxtPrimerApel.setText(this.persona.getPrimApel());
        jtxtSegApel.setText(this.persona.getSegApel());
        jftxtDiasLab.setValue(this.persona.getDiastrab());
        jftxtSalBas.setValue(this.persona.getSalbas());
        jftxtAuxTx.setValue(this.persona.getAuxtrans());
        jtxtNumDoc.setText(this.persona.getNumdoc());
        if (this.persona.getPerinicio() != null) {
            DateFormat df = new SimpleDateFormat("dd/MMM/yyyy");
            jfmtxtInicio.setText(df.format(this.persona.getPerinicio()));
            jfmtxtFin.setText(df.format(this.persona.getPerfin()));
        } else {
            jfmtxtInicio.setText("");
            jfmtxtFin.setText("");
        }
        jblsaldeven.setText(String.valueOf(this.persona.getPrima()));
        jblEPS.setText(String.valueOf(this.persona.getCesantias()));
        jblPension.setText(String.valueOf(this.persona.getVacaciones()));
        jblAuxTx.setText(String.valueOf(this.persona.getIntcesantias()));
        jblSalNeto.setText(String.valueOf(this.persona.getLiquidacion()));
    }

    public void setPersona(Persona p) {
        this.persona = p;
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
            java.util.logging.Logger.getLogger(InterfazComprobantePagoLiquidacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazComprobantePagoLiquidacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazComprobantePagoLiquidacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazComprobantePagoLiquidacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazComprobantePagoLiquidacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btngrpTipoCalculo;
    private javax.swing.ButtonGroup btngrpTipoDocumento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jblAuxTx;
    private javax.swing.JLabel jblEPS;
    private javax.swing.JLabel jblPension;
    private javax.swing.JLabel jblSalNeto;
    private javax.swing.JLabel jblsaldeven;
    private javax.swing.JLabel jbltextopie;
    private javax.swing.JButton jbtnImprimir;
    private javax.swing.JButton jbtnSalir;
    private javax.swing.JFormattedTextField jfmtxtFin;
    private javax.swing.JFormattedTextField jfmtxtInicio;
    private javax.swing.JFormattedTextField jftxtAuxTx;
    private javax.swing.JFormattedTextField jftxtDiasLab;
    private javax.swing.JFormattedTextField jftxtSalBas;
    private javax.swing.JRadioButton jrbtnCC;
    private javax.swing.JRadioButton jrbtnCE;
    private javax.swing.JTextField jtxtNumDoc;
    private javax.swing.JTextField jtxtPrimerApel;
    private javax.swing.JTextField jtxtPrimerNom;
    private javax.swing.JTextField jtxtSegApel;
    private javax.swing.JTextField jtxtSegNombre;
    // End of variables declaration//GEN-END:variables
}
