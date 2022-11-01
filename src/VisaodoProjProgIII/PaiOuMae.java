/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VisaodoProjProgIII;
import ClassesdoProjProgIII.Familia;
import ClassesdoProjProgIII.Humanos;
import ClassesdoProjProgIII.Humanos;
import static controlo.Conexao.ligar;
import controlo.Familia_Login;
import static controlo.Familia_Login.idfamilia;
import static controlo.Familia_Login.idpessoa;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class PaiOuMae extends javax.swing.JFrame {

    /**
     * Creates new form PaiOuMae
     */
    public PaiOuMae() {
        initComponents();
        setSize(1263, 775);
        dispose();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        senhaMaePai = new javax.swing.JPasswordField();
        confSenhaMaePai = new javax.swing.JPasswordField();
        confSenha = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        adc_PaiMae = new javax.swing.JButton();
        voltar = new javax.swing.JButton();
        grauMaePai = new javax.swing.JComboBox<>();
        telMaePai = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        emailMaePai = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        dataNMaePai = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nomeMaePai = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(senhaMaePai);
        senhaMaePai.setBounds(780, 320, 260, 40);
        getContentPane().add(confSenhaMaePai);
        confSenhaMaePai.setBounds(780, 390, 260, 40);

        confSenha.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        confSenha.setText("CONFIRMA A SENHA");
        getContentPane().add(confSenha);
        confSenha.setBounds(570, 400, 180, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setText("SENHA");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(680, 330, 70, 20);

        jLabel6.setText("YYYY/MM/DD");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(270, 300, 120, 20);

        adc_PaiMae.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        adc_PaiMae.setText("ADICIONAR");
        adc_PaiMae.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adc_PaiMaeActionPerformed(evt);
            }
        });
        getContentPane().add(adc_PaiMae);
        adc_PaiMae.setBounds(550, 550, 140, 40);

        voltar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        voltar.setText("Voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });
        getContentPane().add(voltar);
        voltar.setBounds(100, 620, 140, 40);

        grauMaePai.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        grauMaePai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PAI", "MÃE", " " }));
        grauMaePai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grauMaePaiActionPerformed(evt);
            }
        });
        getContentPane().add(grauMaePai);
        grauMaePai.setBounds(780, 250, 260, 40);
        getContentPane().add(telMaePai);
        telMaePai.setBounds(270, 450, 260, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("TELEFONE");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(150, 460, 90, 20);
        getContentPane().add(emailMaePai);
        emailMaePai.setBounds(270, 390, 260, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("E-MAIL");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(170, 400, 70, 20);
        getContentPane().add(dataNMaePai);
        dataNMaePai.setBounds(270, 320, 260, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("DATA NASCIMENTO");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 330, 170, 20);
        getContentPane().add(nomeMaePai);
        nomeMaePai.setBounds(270, 250, 260, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("NOME");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(190, 260, 80, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VisaodoProjProgIII/Imagens/dizimo (7).png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1240, 720);

        setSize(new java.awt.Dimension(1261, 776));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void grauMaePaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grauMaePaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grauMaePaiActionPerformed

    private void adc_PaiMaeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adc_PaiMaeActionPerformed
        // TODO add your handling code here:
        String telpart= telMaePai.getText();
        String senhacad= Arrays.toString(senhaMaePai.getPassword());
        String Confsenha= Arrays.toString(confSenhaMaePai.getPassword());
        String nomeM= nomeMaePai.getText();
        String datanasci= dataNMaePai.getText();
        String emailN= emailMaePai.getText();
        String grauPe=grauMaePai.getSelectedItem().toString();
        
      //  Humanos h=new Humanos(nomeM, emailN, telpart, datanasci, grauPe, null, null, null, null);
        Humanos h = new Humanos(nomeM, emailN, telpart, datanasci, grauPe, senhacad, idfamilia, idpessoa, null, null, null, null) ;
        h.setSenha(senhacad);
        Familia_Login f=new Familia_Login();        
        h.setIdFamilia(Menu.pessoa.getIdFamilia());       
        f.cadastrarPessoa(h);
        dispose();
        new Adc_Membros().setVisible(true);
    }//GEN-LAST:event_adc_PaiMaeActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        // TODO add your handling code here:
        dispose();
        new Adc_Membros().setVisible(true);
    }//GEN-LAST:event_voltarActionPerformed

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
            java.util.logging.Logger.getLogger(PaiOuMae.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaiOuMae.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaiOuMae.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaiOuMae.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaiOuMae().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adc_PaiMae;
    private javax.swing.JLabel confSenha;
    private javax.swing.JPasswordField confSenhaMaePai;
    private javax.swing.JTextField dataNMaePai;
    private javax.swing.JTextField emailMaePai;
    private javax.swing.JComboBox<String> grauMaePai;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField nomeMaePai;
    private javax.swing.JPasswordField senhaMaePai;
    private javax.swing.JTextField telMaePai;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
