/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlo;

import ClassesdoProjProgIII.Humanos;
import ClassesdoProjProgIII.Rendimento;
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
public class RendimentoBD {
        public void adicionarRendimento(Rendimento rend) {
        {
            try {
                Conexao co = new Conexao();
                Connection con = co.ligar();
                String inserir = "INSERT INTO Rendimento(Humanos_idHumanos, valor, origem, datarend) values(?,?,?,?)";

                PreparedStatement p = con.prepareStatement(inserir);//passaporte para o java ter acesso a BD
                p.setInt(1, rend.getHumanos().getIdHumanos());
                p.setFloat(2, rend.getValor());
                p.setString(3, rend.getOrigem());
                p.setString(4, rend.getDataRend());
                p.execute();
                JOptionPane.showMessageDialog(null, "RENDIMENTO ADICIONADO");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "ERRO!\n" + ex);
            }
        }
    }
        
    public ArrayList<Rendimento> ler(int x) throws SQLException {
        Conexao co = new Conexao();
        Connection con = co.ligar();
        ResultSet rs = null;
        PreparedStatement stmt = null;

        ArrayList<Rendimento> rendi = new ArrayList<>();
        try {
            stmt = (PreparedStatement) con.prepareStatement("SELECT * FROM Rendimento where humanos_idhumanos="+x);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Rendimento rend = new Rendimento();
               // gasto.setId(rs.getInt("idg"));
               rend.setId(rs.getInt("idRendimento"));
                rend.setValor(rs.getFloat("Valor"));
                rend.setOrigem(rs.getString("Origem"));
                rend.setDataRend(rs.getString("DataRend"));
                rendi.add(rend);
            }

        } catch (SQLException ex) {
               System.out.println(ex.getMessage());
        } finally {
            con.close();
        }
        return rendi;
    }
    public static float somaRendimentos(int x) throws SQLException{
        float soma =0;
        Humanos humanos = null;
        Conexao co = new Conexao();
        Connection con = co.ligar();
        PreparedStatement stml= null; 
        ResultSet rs= null;
        stml = con.prepareStatement("SELECT SUM(Valor) AS soma FROM Rendimento WHERE Humanos_idHumanos="+x);
//        stml.setInt(1, humanos.getIdHumanos());
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
            String query="DELETE FROM rendimento WHERE idRendimento=?";
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
    public static void AlteraRend(Rendimento r){
        try {
            Conexao co = new Conexao();
            Connection con = co.ligar();
            String query="UPDATE rendimento SET valor=?, origem=?, dataRend=? WHERE idrendimento=?";
            PreparedStatement ps=con.prepareStatement(query);
            ps.setFloat(1, r.getValor());
            ps.setString(2, r.getOrigem());
            ps.setString(3, r.getDataRend());
            ps.setInt(4, r.getId());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Dados alterado com sucesso");
        } catch (SQLException ex) {
            Logger.getLogger(RendimentoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
