/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

/**
 *
 * @author davidperezarias
 */
public class FrmMenu extends javax.swing.JFrame {
    
    
    FrmGestorCandidato frmCandidato;
    FrmGestorVotantes frmVotante;
    FrmVotarCandidato frmVotar;
    FrmResultados frmResultados;

    /**
     * Creates new form FrmGestorCandidato
     */
    public FrmMenu() {
        initComponents();
        frmCandidato = new FrmGestorCandidato(this);
        frmVotante = new FrmGestorVotantes (this);
        frmVotar = new FrmVotarCandidato (this);
        frmResultados = new FrmResultados (this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new javax.swing.JLabel();
        botonVotar = new javax.swing.JButton();
        botonMenuCandidato = new javax.swing.JButton();
<<<<<<< HEAD
        botonGestorVotante = new javax.swing.JButton();
        botonResultados = new javax.swing.JButton();
=======
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
>>>>>>> 20981d6073082997708deb82482561aa543afba6

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label1.setFont(new java.awt.Font("Franklin Gothic Medium", 2, 18)); // NOI18N
        label1.setForeground(new java.awt.Color(0, 0, 153));
        label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label1.setText("SISTEMA DIGITAL DE ELECCIONES");

        botonVotar.setText("Votar");
        botonVotar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVotarActionPerformed(evt);
            }
        });

        botonMenuCandidato.setText("Gestor candidato");
        botonMenuCandidato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMenuCandidatoActionPerformed(evt);
            }
        });

        botonGestorVotante.setText("Gestor votante");
        botonGestorVotante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGestorVotanteActionPerformed(evt);
            }
        });

        botonResultados.setText("Resultados");
        botonResultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonResultadosActionPerformed(evt);
            }
        });

        jButton2.setText("Gesto Elección");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonGestorVotante, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonMenuCandidato, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
<<<<<<< HEAD
                        .addGap(107, 107, 107)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonResultados, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonVotar, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50))))
=======
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(49, 49, 49))))
>>>>>>> 20981d6073082997708deb82482561aa543afba6
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonMenuCandidato, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonResultados, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
<<<<<<< HEAD
                    .addComponent(botonGestorVotante, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonVotar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
=======
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
>>>>>>> 20981d6073082997708deb82482561aa543afba6
                .addContainerGap(101, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonMenuCandidatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenuCandidatoActionPerformed
      
        frmCandidato.setLocationRelativeTo(this);
        
        frmCandidato.setVisible(true);
        
    }//GEN-LAST:event_botonMenuCandidatoActionPerformed

    private void botonGestorVotanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGestorVotanteActionPerformed
        frmVotante.setLocationRelativeTo(this);
        
        frmVotante.setVisible(true);


        // TODO add your handling code here:
    }//GEN-LAST:event_botonGestorVotanteActionPerformed

    private void botonVotarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVotarActionPerformed
        frmVotar.setLocationRelativeTo(this);
        
        frmVotar.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_botonVotarActionPerformed

    private void botonResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonResultadosActionPerformed
        // TODO add your handling code here:
        frmResultados.setLocationRelativeTo(this);
        frmResultados.setVisible (true);
        
        
    }//GEN-LAST:event_botonResultadosActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonGestorVotante;
    private javax.swing.JButton botonMenuCandidato;
<<<<<<< HEAD
    private javax.swing.JButton botonResultados;
    private javax.swing.JButton botonVotar;
=======
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
>>>>>>> 20981d6073082997708deb82482561aa543afba6
    private javax.swing.JLabel label1;
    // End of variables declaration//GEN-END:variables
}
