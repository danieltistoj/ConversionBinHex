/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.awt.Color;

/**
 *
 * @author Jose Daniel Tistoj Reyes 
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnTraductorDecimal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnTraductorBinario = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        btnTraductorHex = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        btnTraductorOct = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        panelCentral = new javax.swing.JPanel();
        panelTraductorDec = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btnConvertirDec = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        panelTraductorBin = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        panelTraductorHex = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        panelTraductorOct = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(34, 87, 126));

        btnTraductorDecimal.setBackground(new java.awt.Color(34, 87, 126));
        btnTraductorDecimal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnTraductorDecimal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTraductorDecimal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mouseClickLateral(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                entrarLateral(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salirLateral(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Traductor  Decimal");

        javax.swing.GroupLayout btnTraductorDecimalLayout = new javax.swing.GroupLayout(btnTraductorDecimal);
        btnTraductorDecimal.setLayout(btnTraductorDecimalLayout);
        btnTraductorDecimalLayout.setHorizontalGroup(
            btnTraductorDecimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnTraductorDecimalLayout.setVerticalGroup(
            btnTraductorDecimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
        );

        btnTraductorBinario.setBackground(new java.awt.Color(34, 87, 126));
        btnTraductorBinario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnTraductorBinario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTraductorBinario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mouseClickLateral(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                entrarLateral(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salirLateral(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Traductor Binario");

        javax.swing.GroupLayout btnTraductorBinarioLayout = new javax.swing.GroupLayout(btnTraductorBinario);
        btnTraductorBinario.setLayout(btnTraductorBinarioLayout);
        btnTraductorBinarioLayout.setHorizontalGroup(
            btnTraductorBinarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnTraductorBinarioLayout.setVerticalGroup(
            btnTraductorBinarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        btnTraductorHex.setBackground(new java.awt.Color(34, 87, 126));
        btnTraductorHex.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnTraductorHex.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTraductorHex.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mouseClickLateral(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                entrarLateral(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salirLateral(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Traducto Hexadecimal");

        javax.swing.GroupLayout btnTraductorHexLayout = new javax.swing.GroupLayout(btnTraductorHex);
        btnTraductorHex.setLayout(btnTraductorHexLayout);
        btnTraductorHexLayout.setHorizontalGroup(
            btnTraductorHexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnTraductorHexLayout.setVerticalGroup(
            btnTraductorHexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        btnTraductorOct.setBackground(new java.awt.Color(34, 87, 126));
        btnTraductorOct.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnTraductorOct.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTraductorOct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mouseClickLateral(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                entrarLateral(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salirLateral(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Traductor Octadecimal");

        javax.swing.GroupLayout btnTraductorOctLayout = new javax.swing.GroupLayout(btnTraductorOct);
        btnTraductorOct.setLayout(btnTraductorOctLayout);
        btnTraductorOctLayout.setHorizontalGroup(
            btnTraductorOctLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
        );
        btnTraductorOctLayout.setVerticalGroup(
            btnTraductorOctLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnTraductorDecimal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnTraductorBinario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnTraductorHex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnTraductorOct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(btnTraductorDecimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnTraductorBinario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnTraductorHex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnTraductorOct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.LINE_START);

        jPanel3.setBackground(new java.awt.Color(34, 87, 126));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 751, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, java.awt.BorderLayout.PAGE_START);

        panelCentral.setBackground(new java.awt.Color(85, 132, 172));
        panelCentral.setLayout(new java.awt.CardLayout());

        panelTraductorDec.setBackground(new java.awt.Color(85, 132, 172));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("HEX:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("DEC:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("OCT:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("BIN:");

        jTextField1.setBackground(new java.awt.Color(85, 132, 172));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(null);

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        btnConvertirDec.setBackground(new java.awt.Color(85, 132, 172));
        btnConvertirDec.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Convertir");

        javax.swing.GroupLayout btnConvertirDecLayout = new javax.swing.GroupLayout(btnConvertirDec);
        btnConvertirDec.setLayout(btnConvertirDecLayout);
        btnConvertirDecLayout.setHorizontalGroup(
            btnConvertirDecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
        );
        btnConvertirDecLayout.setVerticalGroup(
            btnConvertirDecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Traductor Decimal");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("null");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("null");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("null");

        javax.swing.GroupLayout panelTraductorDecLayout = new javax.swing.GroupLayout(panelTraductorDec);
        panelTraductorDec.setLayout(panelTraductorDecLayout);
        panelTraductorDecLayout.setHorizontalGroup(
            panelTraductorDecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTraductorDecLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(panelTraductorDecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTraductorDecLayout.createSequentialGroup()
                        .addGroup(panelTraductorDecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelTraductorDecLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3))
                            .addGroup(panelTraductorDecLayout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelTraductorDecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnConvertirDec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelTraductorDecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator1)
                                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)))
                        .addGap(41, 41, 41))
                    .addGroup(panelTraductorDecLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(panelTraductorDecLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 25, Short.MAX_VALUE))
        );
        panelTraductorDecLayout.setVerticalGroup(
            panelTraductorDecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTraductorDecLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panelTraductorDecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelTraductorDecLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(panelTraductorDecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58)
                        .addGroup(panelTraductorDecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelTraductorDecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelTraductorDecLayout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(jLabel5))
                            .addGroup(panelTraductorDecLayout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(btnConvertirDec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        panelCentral.add(panelTraductorDec, "card2");

        panelTraductorBin.setBackground(new java.awt.Color(85, 132, 172));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("BIN");

        javax.swing.GroupLayout panelTraductorBinLayout = new javax.swing.GroupLayout(panelTraductorBin);
        panelTraductorBin.setLayout(panelTraductorBinLayout);
        panelTraductorBinLayout.setHorizontalGroup(
            panelTraductorBinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTraductorBinLayout.createSequentialGroup()
                .addContainerGap(230, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(218, 218, 218))
        );
        panelTraductorBinLayout.setVerticalGroup(
            panelTraductorBinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTraductorBinLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(175, Short.MAX_VALUE))
        );

        panelCentral.add(panelTraductorBin, "card3");

        panelTraductorHex.setBackground(new java.awt.Color(85, 132, 172));

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("HEX");

        javax.swing.GroupLayout panelTraductorHexLayout = new javax.swing.GroupLayout(panelTraductorHex);
        panelTraductorHex.setLayout(panelTraductorHexLayout);
        panelTraductorHexLayout.setHorizontalGroup(
            panelTraductorHexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTraductorHexLayout.createSequentialGroup()
                .addContainerGap(254, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(222, 222, 222))
        );
        panelTraductorHexLayout.setVerticalGroup(
            panelTraductorHexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTraductorHexLayout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(180, Short.MAX_VALUE))
        );

        panelCentral.add(panelTraductorHex, "card4");

        panelTraductorOct.setBackground(new java.awt.Color(85, 132, 172));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("OCT");

        javax.swing.GroupLayout panelTraductorOctLayout = new javax.swing.GroupLayout(panelTraductorOct);
        panelTraductorOct.setLayout(panelTraductorOctLayout);
        panelTraductorOctLayout.setHorizontalGroup(
            panelTraductorOctLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTraductorOctLayout.createSequentialGroup()
                .addContainerGap(242, Short.MAX_VALUE)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(205, 205, 205))
        );
        panelTraductorOctLayout.setVerticalGroup(
            panelTraductorOctLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTraductorOctLayout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(170, Short.MAX_VALUE))
        );

        panelCentral.add(panelTraductorOct, "card5");

        jPanel1.add(panelCentral, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mouseClickLateral(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseClickLateral
        if(evt.getSource() == btnTraductorDecimal){
            panelTraductorDec.setVisible(true);
            panelTraductorBin.setVisible(false);
            panelTraductorHex.setVisible(false);
            panelTraductorOct.setVisible(false);
        }
        if(evt.getSource() == btnTraductorBinario){
            panelTraductorDec.setVisible(false);
            panelTraductorBin.setVisible(true);
            panelTraductorHex.setVisible(false);
            panelTraductorOct.setVisible(false);
        }
        if(evt.getSource() == btnTraductorHex){
            panelTraductorDec.setVisible(false);
            panelTraductorBin.setVisible(false);
            panelTraductorHex.setVisible(true);
            panelTraductorOct.setVisible(false);            
        }
        if(evt.getSource() == btnTraductorOct){
            panelTraductorDec.setVisible(false);
            panelTraductorBin.setVisible(false);
            panelTraductorHex.setVisible(false);
            panelTraductorOct.setVisible(true);           
        }
    }//GEN-LAST:event_mouseClickLateral

    private void entrarLateral(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarLateral
        if(evt.getSource() == btnTraductorDecimal){
            btnTraductorDecimal.setBackground(new Color(85, 132, 172)); 
        }
        if(evt.getSource() == btnTraductorBinario){
            btnTraductorBinario.setBackground(new Color(85, 132, 172)); 
        }
        if(evt.getSource() == btnTraductorHex){
            btnTraductorHex.setBackground(new Color(85, 132, 172));
        }
        if(evt.getSource() == btnTraductorOct){
            btnTraductorOct.setBackground(new Color(85, 132, 172));
        }
    }//GEN-LAST:event_entrarLateral

    private void salirLateral(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirLateral
        if(evt.getSource() == btnTraductorDecimal){
            btnTraductorDecimal.setBackground(new Color(34, 87, 126)); 
        }
        if(evt.getSource() == btnTraductorBinario){
            btnTraductorBinario.setBackground(new Color(34, 87, 126)); 
        }
        if(evt.getSource() == btnTraductorHex){
            btnTraductorHex.setBackground(new Color(34, 87, 126));
        }
        if(evt.getSource() == btnTraductorOct){
            btnTraductorOct.setBackground(new Color(34, 87, 126));
        }
    }//GEN-LAST:event_salirLateral

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnConvertirDec;
    private javax.swing.JPanel btnTraductorBinario;
    private javax.swing.JPanel btnTraductorDecimal;
    private javax.swing.JPanel btnTraductorHex;
    private javax.swing.JPanel btnTraductorOct;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel panelCentral;
    private javax.swing.JPanel panelTraductorBin;
    private javax.swing.JPanel panelTraductorDec;
    private javax.swing.JPanel panelTraductorHex;
    private javax.swing.JPanel panelTraductorOct;
    // End of variables declaration//GEN-END:variables
}
