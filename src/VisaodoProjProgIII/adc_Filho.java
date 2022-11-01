/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VisaodoProjProgIII;

import ClassesdoProjProgIII.Familia;
import ClassesdoProjProgIII.Humanos;
import ClassesdoProjProgIII.Humanos;
import controlo.Familia_Login;
import static controlo.Familia_Login.idfamilia;
import static controlo.Familia_Login.idpessoa;
import java.util.Arrays;

/**
 *
 * @author HP
 */
public class adc_Filho extends javax.swing.JFrame {

    /**
     * Creates new form adc_Filho
     */
    public adc_Filho() {
        initComponents();
        setSize(1253, 775);
        dispose();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        confSenhaFilho = new javax.swing.JPasswordField();
        senhaFilho = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        adc_filho = new javax.swing.JButton();
        emailFilho = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        telFilho = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        dataNFilho = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nomeFilho = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        voltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(confSenhaFilho);
        confSenhaFilho.setBounds(240, 490, 260, 40);
        getContentPane().add(senhaFilho);
        senhaFilho.setBounds(240, 440, 260, 40);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setText("CONFIRMA A SENHA");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(50, 500, 170, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setText("SENHA");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(160, 450, 70, 20);

        jLabel7.setText("YYYY/MM/DD");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(240, 360, 110, 20);

        adc_filho.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        adc_filho.setText("ADICIONAR");
        adc_filho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adc_filhoActionPerformed(evt);
            }
        });
        getContentPane().add(adc_filho);
        adc_filho.setBounds(560, 550, 140, 40);
        getContentPane().add(emailFilho);
        emailFilho.setBounds(850, 380, 260, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setText("E-MAIL");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(760, 390, 90, 20);

        telFilho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telFilhoActionPerformed(evt);
            }
        });
        getContentPane().add(telFilho);
        telFilho.setBounds(850, 300, 260, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("TELEFONE");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(740, 310, 120, 20);
        getContentPane().add(dataNFilho);
        dataNFilho.setBounds(240, 380, 260, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("DATA DE NASCIMENTO");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 390, 220, 22);
        getContentPane().add(nomeFilho);
        nomeFilho.setBounds(240, 300, 260, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("NOME");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(170, 310, 80, 20);

        voltar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        voltar.setText("Voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });
        getContentPane().add(voltar);
        voltar.setBounds(100, 620, 140, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VisaodoProjProgIII/Imagens/dizimo (5).png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-10, 0, 1240, 720);

        setSize(new java.awt.Dimension(1251, 772));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void telFilhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telFilhoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telFilhoActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        // TODO add your handling code here:
        dispose();
        new Adc_Membros().setVisible(true);
    }//GEN-LAST:event_voltarActionPerformed

    private void adc_filhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adc_filhoActionPerformed
        // TODO add your handling code here:
        String telpart= telFilho.getText();
        String senhacad= Arrays.toString(senhaFilho.getPassword());
        String Confsenha= Arrays.toString(confSenhaFilho.getPassword());
        String nomeM= nomeFilho.getText();
        String datanasci= dataNFilho.getText();
        String emailN= emailFilho.getText();
        String grauPe= "Filho";
        
        //Humanos h=new Humanos(nomeM, emailN, telpart, datanasci, grauPe, null, null, null, null);
        Humanos h = new Humanos(nomeM, emailN, telpart, datanasci, grauPe, senhacad, idfamilia, idpessoa, null, null, null, null) ;
        h.setSenha(senhacad);
        Familia_Login f=new Familia_Login();        
        h.setIdFamilia(Menu.pessoa.getIdFamilia());       
        f.cadastrarPessoa(h);
        dispose();
        new Adc_Membros().setVisible(true);
    }//GEN-LAST:event_adc_filhoActionPerformed

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
            java.util.logging.Logger.getLogger(adc_Filho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adc_Filho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adc_Filho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adc_Filho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adc_Filho().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adc_filho;
    private javax.swing.JPasswordField confSenhaFilho;
    private javax.swing.JTextField dataNFilho;
    private javax.swing.JTextField emailFilho;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nomeFilho;
    private javax.swing.JPasswordField senhaFilho;
    private javax.swing.JTextField telFilho;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
