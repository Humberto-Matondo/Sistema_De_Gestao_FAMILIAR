/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlo;

import ClassesdoProjProgIII.Familia;
import ClassesdoProjProgIII.Humanos;
import ClassesdoProjProgIII.Poupanca;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class PoupancaBD {
    
      public void adicionarPoupanca(Poupanca pou) {
        
            try {
                Conexao co = new Conexao();
                Connection con = co.ligar();
                String inserir = "INSERT INTO Poupanca(Familia_idFamilia, motivodepou, valor, datapou) values(?,?,?,?)";

                PreparedStatement p = con.prepareStatement(inserir);//passaporte para o java ter acesso a BD
                p.setInt(1, pou.getFamilia().getIdFamilia());
                p.setString(2, pou.getMotivoDaPou());
                p.setFloat(3, pou.getValor());
                p.setString(4, pou.getDataInicioPou());
                
                //public static float somaRendimentos(pou.getHumanos().IdHumanos )
                p.execute();
                JOptionPane.showMessageDialog(null, "ADICIONADA");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "ERRO!\n" + ex);
            }
        
    }
      
           
    public ArrayList<Poupanca> lerP(int x) throws SQLException {
        Conexao co = new Conexao();
        Connection con = co.ligar();
        ResultSet rs = null;
        PreparedStatement stmt = null;

        ArrayList<Poupanca> pou = new ArrayList<>();
        try {
            stmt = (PreparedStatement) con.prepareStatement("SELECT * FROM Poupanca where Familia_idFamilia="+x);
            rs = stmt.executeQuery();
           
            while (rs.next()) {
                Poupanca p = new Poupanca();
             
                p.setMotivoDaPou(rs.getString("MotivodePou"));
                p.setValor(rs.getFloat("Valor"));
                p.setDataInicioPou(rs.getString("DataPou"));
                pou.add(p);
            }

        } catch (SQLException ex) {
               System.out.println(ex.getMessage());
        } finally {
            con.close();
        }
        return pou;   
    }
    
       public static float somapoupanca(int x) throws SQLException{
        float soma =0;
        Familia familia = null;
        Conexao co = new Conexao();
        Connection con = co.ligar();
        PreparedStatement stml= null; 
        ResultSet rs= null;
        stml = con.prepareStatement("SELECT SUM(Valor) AS soma FROM Poupanca WHERE Familia_idFamilia="+x);
        //stml.setInt(1, familia.getIdFamilia());
        rs= stml.executeQuery();
        while(rs.next()){
            soma= rs.getFloat("soma");  
        }
      return soma;  
    } 
}
    

