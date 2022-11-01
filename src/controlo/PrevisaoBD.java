/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlo;

import ClassesdoProjProgIII.Familia;
import ClassesdoProjProgIII.PrevMensal;
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
public class PrevisaoBD { 
    
      public void adicionarPrevisao(PrevMensal prev) {
        {
            try {
                Conexao co = new Conexao();
                Connection con = co.ligar();
                String inserir = "INSERT INTO PrevisaoMensal(Familia_idFamilia, NomeGastos, Valor) values(?,?,?)";

                PreparedStatement p = con.prepareStatement(inserir);//passaporte para o java ter acesso a BD
                p.setInt(1, prev.getFamilia().getIdFamilia());
                p.setString(2, prev.getNomeDoGasto());
                p.setFloat(3, prev.getValor());
                p.execute();
                
                JOptionPane.showMessageDialog(null, "PREVISAO ADICIONADO");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "ERRO!\n" + ex);
            }
        }
      }
          
         public static boolean Eliminar(String id){
        try {
            Conexao co = new Conexao();
            Connection con = co.ligar();
            String query="DELETE FROM rendimento WHERE idPrevisaoMensal=?";
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
      
    public ArrayList<PrevMensal> lerP(int x) throws SQLException {
        Conexao co = new Conexao();
        Connection con = co.ligar();
        ResultSet rs = null;
        PreparedStatement stmt = null;

        ArrayList<PrevMensal> pv = new ArrayList<>();
        try {
            stmt = (PreparedStatement) con.prepareStatement("SELECT * FROM PrevisaoMensal where Familia_idFamilia="+x);
            rs = stmt.executeQuery();
            while (rs.next()) {
                PrevMensal p = new PrevMensal();
               // gasto.setId(rs.getInt("idg"));
                p.setId(rs.getInt("idPrevisaoMensal"));
                p.setValor(rs.getFloat("Valor"));
                p.setNomeDoGasto(rs.getString("NomeGastos"));
                pv.add(p);
            }

        } catch (SQLException ex) {
               System.out.println(ex.getMessage());
        } finally {
            con.close();
        }
        return pv;
    }
      
    public static float somaRendi(int x) throws SQLException{
        float soma =0;
        Familia familia = null;
        Conexao co = new Conexao();
        Connection con = co.ligar();
     String query="select sum(valor) from rendimento WHERE Humanos_idHumanos=?";
        PreparedStatement ps=con.prepareStatement(query);
        ps.setInt(1, x);
        ResultSet rs= ps.executeQuery();
        while(rs.next()){
            soma= rs.getFloat("sum(valor)");
        }
      return soma;  
    }
    
    public static float descontos1(int x){
        float soma=0.0f;
        try {            
            Conexao co = new Conexao();
            Connection con = co.ligar();
  PreparedStatement stml = con.prepareStatement("SELECT SUM(Valor) AS soma FROM Dizimo WHERE Humanos_idhumanos="+x);
            ResultSet rs= stml.executeQuery();
            while(rs.next()){
                soma = rs.getFloat("soma");
            }  
            return soma;
        } catch (SQLException ex) {
            Logger.getLogger(PrevisaoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return soma;
    }
    
        public static float descontos2(int x){
        float soma=0.0f;
        try {            
            Conexao co = new Conexao();
            Connection con = co.ligar();
  PreparedStatement stml = con.prepareStatement("SELECT SUM(Valor) AS soma FROM poupanca WHERE familia_idfamilia="+x);
            ResultSet rs= stml.executeQuery();
            while(rs.next()){
                soma = rs.getFloat("soma");
            }  
            return soma;
        } catch (SQLException ex) {
            Logger.getLogger(PrevisaoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return soma;
    }
    
      public static float somaPrev(int x) throws SQLException{
        float soma =0;
        Familia familia = null;
        Conexao co = new Conexao();
        Connection con = co.ligar();
        PreparedStatement stml= null; 
        ResultSet rs= null;
        stml = con.prepareStatement("SELECT SUM(Valor) AS soma FROM PrevisaoMensal WHERE Familia_idFamilia="+x);
        //stml.setInt(1, familia.getIdFamilia());
        rs= stml.executeQuery();
        while(rs.next()){
            soma= rs.getFloat("soma");
        }
      return soma;  
    }
      
      public static void mudarPRevisao(int x, String desc, float saldo, int id, int op) throws SQLException{
        float soma =0;
        Familia familia = null;
        Conexao co = new Conexao();
        Connection con = co.ligar();
        
        
        String query="SELECT * FROM PrevisaoMensal WHERE Familia_idFamilia=? AND NomeGastos =?";
        PreparedStatement ps=con.prepareStatement(query);
        ps.setInt(1, x);
        ps.setString(2, desc);
        ResultSet rs= ps.executeQuery();
        
        while(rs.next()){
            soma= rs.getFloat("valor"); 
        }
        if(op==0){
            soma-=saldo;
        }
        else if(op==1){
            soma+=saldo;
        }
        System.out.println(soma);
          System.out.println(desc);
        ps = con.prepareStatement("UPDATE previsaoMensal set valor="+soma+" WHERE idPrevisaoMensal="+id);
        ps.execute();
    }
      
      public static boolean Existe(String desc, int id){
          boolean f=false;
          try {              
              Conexao co = new Conexao();
              Connection con = co.ligar();
              String query="SELECT * FROM previsaoMensal WHERE NomeGastos=? AND Familia_idFamilia=?";
              PreparedStatement ps=con.prepareStatement(query);
              ps.setString(1, desc);
              ps.setInt(2, id);
              ResultSet rs=ps.executeQuery();
              while(rs.next()){
                  f=true;
              }
          } catch (SQLException ex) {
              Logger.getLogger(PrevisaoBD.class.getName()).log(Level.SEVERE, null, ex);
          }
          return f;
      }
      
      public static void alterarPrevi(int x, String desc, float saldo) throws SQLException{
        float soma =0;
        Familia familia = null;
        Conexao co = new Conexao();
        Connection con = co.ligar();
        
        
        String query="SELECT * FROM PrevisaoMensal WHERE Familia_idFamilia=? AND NomeGastos =?";
        PreparedStatement ps=con.prepareStatement(query);
        ps.setInt(1, x);
        ps.setString(2, desc);
        ResultSet rs= ps.executeQuery();
        
        while(rs.next()){
            soma= rs.getFloat("valor"); 
        }
            soma+=saldo; 
            query="UPDATE previsaoMensal set Valor=? WHERE NomeGastos=? AND Familia_idFamilia=?";
            ps = con.prepareStatement(query);
            ps.setFloat(1, soma);
            ps.setString(2, desc);
            ps.setInt(3, x);
        ps.execute();
        JOptionPane.showMessageDialog(null, "Previsao salva");
    }
}
