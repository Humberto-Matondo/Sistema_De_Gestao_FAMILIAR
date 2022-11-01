/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VisaodoProjProgIII;
import ClassesdoProjProgIII.Animal;
import ClassesdoProjProgIII.Familia;
import controlo.AnimalCadast;
import static controlo.Familia_Login.idfamilia;


/**
 *
 * @author HP
 */
public class adc_Animal extends javax.swing.JFrame {

    /**
     * Creates new form Animal
     */
      public static Animal animal;
    public adc_Animal() {
        initComponents();
        setSize(1263, 775);
        dispose();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        tipoAnimal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        racaAnimal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        dataNAnimal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nomeAnimal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        adc_animal = new javax.swing.JButton();
        voltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel6.setText("YYYY/MM/DD");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(230, 350, 120, 20);
        getContentPane().add(tipoAnimal);
        tipoAnimal.setBounds(880, 270, 260, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("TIPO DE ANIMAL");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(720, 280, 140, 22);
        getContentPane().add(racaAnimal);
        racaAnimal.setBounds(880, 370, 260, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("RAÇA");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(810, 380, 50, 22);
        getContentPane().add(dataNAnimal);
        dataNAnimal.setBounds(230, 370, 260, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("DATA NASCIMENTO");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 380, 170, 22);
        getContentPane().add(nomeAnimal);
        nomeAnimal.setBounds(230, 270, 260, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("NOME");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(160, 280, 50, 20);

        adc_animal.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        adc_animal.setText("ADICIONAR");
        adc_animal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adc_animalActionPerformed(evt);
            }
        });
        getContentPane().add(adc_animal);
        adc_animal.setBounds(580, 480, 129, 40);

        voltar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        voltar.setText("Voltar");
        voltar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });
        getContentPane().add(voltar);
        voltar.setBounds(100, 620, 140, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VisaodoProjProgIII/Imagens/dizimo (6).png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1240, 720);

        setSize(new java.awt.Dimension(1261, 778));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        // TODO add your handling code here:
        dispose();
        new Adc_Membros().setVisible(true);
    }//GEN-LAST:event_voltarActionPerformed

    private void adc_animalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adc_animalActionPerformed
        // TODO add your handling code here:
        String nomeM= nomeAnimal.getText();
        String tAnimal= tipoAnimal.getText();
        String raca= racaAnimal.getText();
        String datanasci= dataNAnimal.getText();
        
        Animal a=new Animal(nomeM, tAnimal, raca, datanasci, null, null, null, null);
        AnimalCadast an=new AnimalCadast(); 
        Familia familia = new Familia(null, null, null, null);
        familia.setIdFamilia(idfamilia);
        a.setFamilia(familia);
        an.cadastrarAnimal(a);    
        dispose();
        new Adc_Membros().setVisible(true);
    }//GEN-LAST:event_adc_animalActionPerformed

    /* Humanos h=new Humanos(nomeM, emailN, telpart, datanasci, grauPe, null, null, null, null);
        h.setSenha(senhacad);
        Familia_Login f=new Familia_Login();        
        h.setIdFamilia(Menu.pessoa.getIdFamilia());       
        f.cadastrarPessoa(h);
        dispose();
        new Adc_Membros().setVisible(true);*/
     /** @param args the command line arguments
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
            java.util.logging.Logger.getLogger(adc_Animal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adc_Animal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adc_Animal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adc_Animal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adc_Animal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adc_animal;
    private javax.swing.JTextField dataNAnimal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField nomeAnimal;
    private javax.swing.JTextField racaAnimal;
    private javax.swing.JTextField tipoAnimal;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
