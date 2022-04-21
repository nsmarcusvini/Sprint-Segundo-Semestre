/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.loginhealthinspec;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Nicolas
 */
public class TelaAcesso extends javax.swing.JFrame {
    
    private int mouseX = 0, mouseY = 0;
    
    /**
     * Creates new form Login
     */
    
    public TelaAcesso() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        minimizeLbl = new javax.swing.JLabel();
        closeLbl = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        lblSistemaOperacional = new javax.swing.JLabel();
        lblProcessador = new javax.swing.JLabel();
        lblMemoriaRam = new javax.swing.JLabel();
        lblDisco = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(250, 250, 250));

        jLabel2.setBackground(new java.awt.Color(1, 103, 126));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(1, 103, 126));
        jLabel2.setText("HOSTNAME");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/computador.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel2)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(131, 131, 131))
        );

        jPanel3.setBackground(new java.awt.Color(1, 103, 126));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(250, 250, 250));
        jSeparator2.setForeground(new java.awt.Color(250, 250, 250));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 400, 20));

        jSeparator3.setBackground(new java.awt.Color(250, 250, 250));
        jSeparator3.setForeground(new java.awt.Color(250, 250, 250));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 80, 340, 20));

        minimizeLbl.setBackground(new java.awt.Color(250, 250, 250));
        minimizeLbl.setFont(new java.awt.Font("Myanmar Text", 0, 48)); // NOI18N
        minimizeLbl.setForeground(new java.awt.Color(250, 250, 250));
        minimizeLbl.setText("-");
        minimizeLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeLblMouseClicked(evt);
            }
        });
        jPanel3.add(minimizeLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 30, 40));

        closeLbl.setBackground(new java.awt.Color(250, 250, 250));
        closeLbl.setFont(new java.awt.Font("Myanmar Text", 0, 24)); // NOI18N
        closeLbl.setForeground(new java.awt.Color(250, 250, 250));
        closeLbl.setText("X");
        closeLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeLblMouseClicked(evt);
            }
        });
        jPanel3.add(closeLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 30, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(250, 250, 250));
        jLabel11.setText("Sistema Operacional: ");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(250, 250, 250));
        jLabel12.setText("Processador: ");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 210, -1, -1));

        jSeparator4.setBackground(new java.awt.Color(250, 250, 250));
        jSeparator4.setForeground(new java.awt.Color(250, 250, 250));
        jPanel3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 400, 20));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(250, 250, 250));
        jLabel13.setText("Memória RAM: ");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 280, -1, -1));

        jSeparator5.setBackground(new java.awt.Color(250, 250, 250));
        jSeparator5.setForeground(new java.awt.Color(250, 250, 250));
        jPanel3.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 400, 20));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(250, 250, 250));
        jLabel14.setText("Disco Rígido: ");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 350, -1, -1));

        jLabel3.setBackground(new java.awt.Color(250, 250, 250));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(250, 250, 250));
        jLabel3.setText("CONFIGURAÇÕES DO SISTEMA");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, -1, -1));

        jSeparator6.setBackground(new java.awt.Color(250, 250, 250));
        jSeparator6.setForeground(new java.awt.Color(250, 250, 250));
        jPanel3.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 400, 20));

        lblSistemaOperacional.setForeground(new java.awt.Color(250, 250, 250));
        lblSistemaOperacional.setText("-");
        jPanel3.add(lblSistemaOperacional, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, -1, -1));

        lblProcessador.setForeground(new java.awt.Color(250, 250, 250));
        lblProcessador.setText("-");
        jPanel3.add(lblProcessador, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, -1, -1));

        lblMemoriaRam.setForeground(new java.awt.Color(250, 250, 250));
        lblMemoriaRam.setText("-");
        jPanel3.add(lblMemoriaRam, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, -1, -1));

        lblDisco.setForeground(new java.awt.Color(250, 250, 250));
        lblDisco.setText("-");
        jPanel3.add(lblDisco, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void minimizeLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeLblMouseClicked
        this.setExtendedState(TelaAcesso.ICONIFIED);
    }//GEN-LAST:event_minimizeLblMouseClicked

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        setLocation(evt.getXOnScreen() - mouseX, evt.getYOnScreen() - mouseY);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void closeLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeLblMouseClicked
        dispose();
    }//GEN-LAST:event_closeLblMouseClicked

    
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
            java.util.logging.Logger.getLogger(TelaAcesso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAcesso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAcesso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAcesso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAcesso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel closeLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lblDisco;
    private javax.swing.JLabel lblMemoriaRam;
    private javax.swing.JLabel lblProcessador;
    private javax.swing.JLabel lblSistemaOperacional;
    private javax.swing.JLabel minimizeLbl;
    // End of variables declaration//GEN-END:variables
}
