/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VisaodoProjProgIII;

import ClassesdoProjProgIII.Familia;
import controlo.CreditoBD;
import ClassesdoProjProgIII.Humanos;
import static VisaodoProjProgIII.Meu_Perfil.pessoa;
import static controlo.Familia_Login.idfamilia;
import static controlo.Familia_Login.idpessoa;
import controlo.PoupancaBD;
import controlo.PrevisaoBD;
import controlo.RendimentoBD;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */


public class Menu extends javax.swing.JFrame {
    public static Humanos pessoa;
    public static Familia familia;
    
    public static float soma_Gastos;
    public static float soma_Creditos;
    public static float soma_Dizimos;
    public static float soma_Previsao;
    public static float soma_poupanca;
    public static float soma_Rendimento;
    

    public Menu(Humanos h) {
            initComponents();
            setSize(1260, 765);
            pessoa=h;
            grau.setText(h.getNome().toUpperCase()+"\n, "+h.getGrau());         
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        grau = new javax.swing.JLabel();
        prevMensal = new javax.swing.JButton();
        poupanca = new javax.swing.JButton();
        voltalogin = new javax.swing.JButton();
        rendimentos = new javax.swing.JButton();
        creditos = new javax.swing.JButton();
        dizimos = new javax.swing.JButton();
        gastosP = new javax.swing.JButton();
        meuPerfil = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        grau.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(grau);
        grau.setBounds(910, 150, 330, 50);

        prevMensal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        prevMensal.setText("PREVISÃO MENSAL");
        prevMensal.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        prevMensal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevMensalActionPerformed(evt);
            }
        });
        getContentPane().add(prevMensal);
        prevMensal.setBounds(860, 580, 280, 40);

        poupanca.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        poupanca.setText("POUPANÇA");
        poupanca.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        poupanca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poupancaActionPerformed(evt);
            }
        });
        getContentPane().add(poupanca);
        poupanca.setBounds(480, 410, 280, 150);

        voltalogin.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        voltalogin.setText("Voltar");
        voltalogin.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        voltalogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltaloginActionPerformed(evt);
            }
        });
        getContentPane().add(voltalogin);
        voltalogin.setBounds(100, 620, 140, 40);

        rendimentos.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        rendimentos.setText("RENDIMENTO");
        rendimentos.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        rendimentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rendimentosActionPerformed(evt);
            }
        });
        getContentPane().add(rendimentos);
        rendimentos.setBounds(860, 410, 280, 150);

        creditos.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        creditos.setText("CREDITO");
        creditos.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        creditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditosActionPerformed(evt);
            }
        });
        getContentPane().add(creditos);
        creditos.setBounds(100, 410, 280, 150);

        dizimos.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        dizimos.setText("DIZIMO");
        dizimos.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        dizimos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dizimosActionPerformed(evt);
            }
        });
        getContentPane().add(dizimos);
        dizimos.setBounds(860, 240, 280, 150);

        gastosP.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        gastosP.setText("GASTOS");
        gastosP.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        gastosP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gastosPActionPerformed(evt);
            }
        });
        getContentPane().add(gastosP);
        gastosP.setBounds(480, 240, 280, 150);

        meuPerfil.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        meuPerfil.setText("MEU PERFIL");
        meuPerfil.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        meuPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meuPerfilActionPerformed(evt);
            }
        });
        getContentPane().add(meuPerfil);
        meuPerfil.setBounds(100, 240, 280, 150);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VisaodoProjProgIII/Imagens/menu (1).png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1240, 710);

        setSize(new java.awt.Dimension(1260, 765));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void meuPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meuPerfilActionPerformed
        // TODO add your handling code here:
        dispose();
        new Meu_Perfil(pessoa).setVisible(true);  
    }//GEN-LAST:event_meuPerfilActionPerformed

    private void gastosPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gastosPActionPerformed
        // TODO add your handling code here:
         try {
            float ver= PrevisaoBD.somaPrev(idfamilia);
            if(ver == 0.0f ){
                JOptionPane.showMessageDialog(null,"AINDA NAO FOI ADICIONADA NENHUMA PREVISAO.");
            } else {
                dispose();
                new Gastos_Particulares().setVisible(true);  
            }
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_gastosPActionPerformed

    private void poupancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poupancaActionPerformed
        // TODO add your handling code here:
           try {
            // TODO add your handling code here:
            float ver= RendimentoBD.somaRendimentos(idpessoa);
            if((ver == 0.0f)){
                JOptionPane.showMessageDialog(null,"AINDA NAO FOI ADICIONADO NENHUM RENDIMENTO.");
            } else {
                dispose();
                new Poupancas().setVisible(true);  
            }
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }//GEN-LAST:event_poupancaActionPerformed

    private void rendimentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rendimentosActionPerformed
        dispose();
        new Rendimentos().setVisible(true);
    }//GEN-LAST:event_rendimentosActionPerformed

    private void creditosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditosActionPerformed
        // TODO add your handling code here:
        dispose();
        new Creditos().setVisible(true); 
    }//GEN-LAST:event_creditosActionPerformed

    private void dizimosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dizimosActionPerformed
        try {
            // TODO add your handling code here:
            float ver= RendimentoBD.somaRendimentos(idpessoa);
            if(ver == 0.0f ){
                JOptionPane.showMessageDialog(null,"AINDA NAO FOI ADICIONADO NENHUM RENDIMENTO.");
            } else {
                dispose();
                new Dizimos().setVisible(true);  
            }
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_dizimosActionPerformed

    private void voltaloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltaloginActionPerformed
        // TODO add your handling code here:
        dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_voltaloginActionPerformed

    private void prevMensalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevMensalActionPerformed
        // TODO add your handling code here:
        
        boolean p;
        p = pessoa.getGrau().equalsIgnoreCase("Filho");
        if(p == true){
            JOptionPane.showMessageDialog(null,"MEMBRO NAO AUTORIZADO!");
        }else{
                try {
                float ver= RendimentoBD.somaRendimentos(idpessoa);
                if((ver == 0.0f)){
                    JOptionPane.showMessageDialog(null,"AINDA NAO FOI ADICIONADO NENHUM RENDIMENTO.");
                } else {
                    dispose();
                    new Previsao_Mensal().setVisible(true); 
                }
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        } 
        }   
        
               
    }//GEN-LAST:event_prevMensalActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu(pessoa).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton creditos;
    private javax.swing.JButton dizimos;
    private javax.swing.JButton gastosP;
    private javax.swing.JLabel grau;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton meuPerfil;
    private javax.swing.JButton poupanca;
    private javax.swing.JButton prevMensal;
    private javax.swing.JButton rendimentos;
    private javax.swing.JButton voltalogin;
    // End of variables declaration//GEN-END:variables
}
