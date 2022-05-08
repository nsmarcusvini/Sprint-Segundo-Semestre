/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.loginhealthinspec;

import com.github.britooo.looca.api.core.Looca;
import java.awt.Color;
import java.net.InetAddress;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.lang.Runtime;
import java.util.ArrayList;
import java.util.*;

/**
 *
 * @author Nicolas
 */
public class ExibirProcessos extends javax.swing.JFrame {

    private int mouseX = 0, mouseY = 0;

    /**
     * Creates new form Login
     */
    public ExibirProcessos() {
        initComponents();
        this.setUpOs();
    }

    private void setUpOs() {
        
        Looca looca = new Looca();
        try {
            
        String quebra = String.format("\n");
            
            Double ram = looca.getMemoria().getTotal() / 1073741824.0;
            Double disco = looca.getGrupoDeDiscos().getTamanhoTotal() / 1073741824.0;
            
            int proclist = looca.getGrupoDeProcessos().getProcessos().size();
            for (int i = 0; i < proclist; i++) {  
                txtTxtArea.setText(txtTxtArea.getText() + looca.getGrupoDeProcessos().getProcessos().get(i).getNome() + "\n");
            }
            //Runtime.getRuntime().exec("taskkill /F /PID <processname>.exe");
                        
        } catch (Exception e) {

            e.printStackTrace();

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

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        minimizeLbl = new javax.swing.JLabel();
        closeLbl = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtTxtArea = new javax.swing.JTextArea();

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
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(1, 103, 126));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, -1, -1));

        jSeparator3.setBackground(new java.awt.Color(250, 250, 250));
        jSeparator3.setForeground(new java.awt.Color(250, 250, 250));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 190, 20));

        minimizeLbl.setBackground(new java.awt.Color(250, 250, 250));
        minimizeLbl.setFont(new java.awt.Font("Myanmar Text", 0, 48)); // NOI18N
        minimizeLbl.setForeground(new java.awt.Color(250, 250, 250));
        minimizeLbl.setText("-");
        minimizeLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeLblMouseClicked(evt);
            }
        });
        jPanel3.add(minimizeLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 30, 40));

        closeLbl.setBackground(new java.awt.Color(250, 250, 250));
        closeLbl.setFont(new java.awt.Font("Myanmar Text", 0, 24)); // NOI18N
        closeLbl.setForeground(new java.awt.Color(250, 250, 250));
        closeLbl.setText("X");
        closeLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeLblMouseClicked(evt);
            }
        });
        jPanel3.add(closeLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 30, 30));

        jLabel3.setBackground(new java.awt.Color(250, 250, 250));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(250, 250, 250));
        jLabel3.setText("PROCESSOS");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        txtTxtArea.setEditable(false);
        txtTxtArea.setColumns(20);
        txtTxtArea.setRows(5);
        txtTxtArea.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane2.setViewportView(txtTxtArea);

        javax.swing.GroupLayout txtPanelLayout = new javax.swing.GroupLayout(txtPanel);
        txtPanel.setLayout(txtPanelLayout);
        txtPanelLayout.setHorizontalGroup(
            txtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
        );
        txtPanelLayout.setVerticalGroup(
            txtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
        );

        jPanel3.add(txtPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 360, 210));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 471));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        setLocation(evt.getXOnScreen() - mouseX, evt.getYOnScreen() - mouseY);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void closeLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeLblMouseClicked
        dispose();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }//GEN-LAST:event_closeLblMouseClicked

    private void minimizeLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeLblMouseClicked
        this.setExtendedState(ExibirProcessos.ICONIFIED);
    }//GEN-LAST:event_minimizeLblMouseClicked

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
            java.util.logging.Logger.getLogger(ExibirProcessos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExibirProcessos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExibirProcessos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExibirProcessos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExibirProcessos().setVisible(true);

            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel closeLbl;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel minimizeLbl;
    private javax.swing.JPanel txtPanel;
    private javax.swing.JTextArea txtTxtArea;
    // End of variables declaration//GEN-END:variables
}
