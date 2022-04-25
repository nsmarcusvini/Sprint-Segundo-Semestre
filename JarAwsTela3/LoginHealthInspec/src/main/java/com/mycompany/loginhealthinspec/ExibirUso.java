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
import java.io.*;
/**
 *
 * @author Nicolas
 */
public class ExibirUso extends javax.swing.JFrame {

    private int mouseX = 0, mouseY = 0;

    /**
     * Creates new form Login
     */
    public ExibirUso() {
        initComponents();
        this.setUpOs();
    }

    private void setUpOs() {
        Looca looca = new Looca();
        try {
            
            
            Double ram = looca.getMemoria().getEmUso() / 1073741824.0;
            Double disco = looca.getGrupoDeDiscos().getTamanhoTotal() / 1073741824.0;
            
            double tamanho = new File("C:\\").getTotalSpace()- new File("C:\\").getFreeSpace();
            
            lblUsoProcessador.setText(String.format("%.2f%%", looca.getProcessador().getUso()));
            lblUsoMemoriaRam.setText(String.format("%.2f GB usados", ram));
            lblUsoDisco.setText(String.format("%.2f usados", tamanho/1073741824.0));
            
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
        lblUsoDisco = new javax.swing.JLabel();
        lblUsoProcessador = new javax.swing.JLabel();
        lblUsoMemoriaRam = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

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
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 140, 20));

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

        jLabel3.setBackground(new java.awt.Color(250, 250, 250));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(250, 250, 250));
        jLabel3.setText("EM USO");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        lblUsoDisco.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblUsoDisco.setForeground(new java.awt.Color(250, 250, 250));
        lblUsoDisco.setText("jLabel1");
        jPanel3.add(lblUsoDisco, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 236, -1, -1));

        lblUsoProcessador.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblUsoProcessador.setForeground(new java.awt.Color(250, 250, 250));
        lblUsoProcessador.setText("jLabel1");
        jPanel3.add(lblUsoProcessador, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 96, -1, -1));

        lblUsoMemoriaRam.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblUsoMemoriaRam.setForeground(new java.awt.Color(250, 250, 250));
        lblUsoMemoriaRam.setText("jLabel1");
        jPanel3.add(lblUsoMemoriaRam, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 166, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(250, 250, 250));
        jSeparator2.setForeground(new java.awt.Color(250, 250, 250));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 400, 20));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(250, 250, 250));
        jLabel12.setText("Processador: ");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, -1, -1));

        jSeparator4.setBackground(new java.awt.Color(250, 250, 250));
        jSeparator4.setForeground(new java.awt.Color(250, 250, 250));
        jPanel3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 400, 20));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(250, 250, 250));
        jLabel13.setText("Memória RAM: ");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, -1, -1));

        jSeparator5.setBackground(new java.awt.Color(250, 250, 250));
        jSeparator5.setForeground(new java.awt.Color(250, 250, 250));
        jPanel3.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 400, 20));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(250, 250, 250));
        jLabel14.setText("Disco Rígido: ");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hard-disk.png"))); // NOI18N
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cpu.png"))); // NOI18N
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memoria-ram.png"))); // NOI18N
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 350));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void minimizeLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeLblMouseClicked
        this.setExtendedState(ExibirUso.ICONIFIED);
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
            java.util.logging.Logger.getLogger(ExibirUso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExibirUso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExibirUso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExibirUso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExibirUso().setVisible(true);

            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel closeLbl;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lblUsoDisco;
    private javax.swing.JLabel lblUsoMemoriaRam;
    private javax.swing.JLabel lblUsoProcessador;
    private javax.swing.JLabel minimizeLbl;
    // End of variables declaration//GEN-END:variables
}
