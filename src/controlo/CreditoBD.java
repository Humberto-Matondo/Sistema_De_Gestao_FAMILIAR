/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlo;

import ClassesdoProjProgIII.Credito;
import ClassesdoProjProgIII.Familia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class CreditoBD {
      public void adicionarCredito(Credito cred) {
        
            try {
                Conexao co = new Conexao();
                Connection con = co.ligar();
                String inserir = "INSERT INTO Credito(Humanos_idHumanos, ValorConc, ValorDiv, DataInicio, ValorVenc, TotalRend, LocalCred, DataFim) values(?,?,?,?,?,?,?,?)";

                PreparedStatement p = con.prepareStatement(inserir);//passaporte para o java ter acesso a BD
                p.setInt(1, cred.getHumanos().getIdHumanos());
                p.setFloat(2, cred.getValorConc());
                p.setFloat(3, cred.getValorDiv());
                p.setString(4, cred.getDataInacio());
                p.setFloat(5, cred.getValorVenc());
                p.setFloat(6, cred.getTotalRed());
                p.setString(7, cred.getLocalCred());
                p.setString(8, cred.getDataFim());
                
                p.execute();
                JOptionPane.showMessageDialog(null, "CREDITO FEITO");
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "ERRO!\n" + ex);
            }
        }
    
        public ArrayList<Credito> lerC(int x) throws SQLException {
        Conexao co = new Conexao();
        Connection con = co.ligar();
        ResultSet rs = null;
        PreparedStatement stmt = null;

        ArrayList<Credito> cred = new ArrayList<>();
        try {
            stmt = (PreparedStatement) con.prepareStatement("SELECT * FROM Credito where humanos_idhumanos="+x);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Credito cre = new Credito();
             
                cre.setValorConc(rs.getFloat("ValorConc"));
                cre.setValorDiv(rs.getFloat("ValorDiv"));
                cre.setDataInacio(rs.getString("DataInicio"));
                cre.setValorVenc(rs.getFloat("ValorVenc"));
                cre.setTotalRed(rs.getFloat("TotalRend"));
                cre.setLocalCred(rs.getString("LocalCred"));
                cre.setDataFim(rs.getString("DataFim"));
                cred.add(cre);
            }

        } catch (SQLException ex) {
               System.out.println(ex.getMessage());
        } finally {
            con.close();
        }
        return cred;
    }
        public static float somaCredito(int x) throws SQLException{
        float soma =0;
        Familia familia = null;
        Conexao co = new Conexao();
        Connection con = co.ligar();
        PreparedStatement stml= null; 
        ResultSet rs= null;
        stml = con.prepareStatement("SELECT SUM(ValorConc) AS soma FROM Credito WHERE humanos_idhumanos="+x);
        //stml.setInt(1, familia.getIdFamilia());
        rs= stml.executeQuery();
        while(rs.next()){
            soma= rs.getFloat("soma");  
        }
      return soma;  
    }
        
        public static boolean Eliminar(String id){
        try {
            Conexao co = new Conexao();
            Connection con = co.ligar();
            String query="DELETE FROM rendimento WHERE idCredito=?";
            PreparedStatement ps=con.prepareStatement(query);
            ps.setString(1, id);
            ps.execute();
            JOptionPane.showMessageDialog(null, "ELIMINADO!");
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(RendimentoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
