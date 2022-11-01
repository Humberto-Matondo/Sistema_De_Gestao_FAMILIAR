/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlo;

import ClassesdoProjProgIII.Dizimo;
import ClassesdoProjProgIII.Familia;
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
public class DizimoBD {
 
        public void adicionarDizimo(Dizimo diz) {
   
            try {
                Conexao co = new Conexao();
                Connection con = co.ligar();
                String inserir = "INSERT INTO Dizimo(Humanos_idHumanos, Valor, Instituicao, DataDiz) values(?,?,?,?)";

                PreparedStatement p = con.prepareStatement(inserir);//passaporte para o java ter acesso a BD
                p.setInt(1, diz.getHumanos().getIdHumanos());
                p.setFloat(2, diz.getValor());
                p.setString(3, diz.getInstituicao());
                p.setString(4, diz.getDataDiz());
                p.execute();
                JOptionPane.showMessageDialog(null, "DIZIMO OFERTADO");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "ERRO!\n" + ex);
            }
        }
        
           public static boolean Eliminar(String id){
        try {
            Conexao co = new Conexao();
            Connection con = co.ligar();
            String query="DELETE FROM rendimento WHERE idDizimo=?";
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
        
        public ArrayList<Dizimo> ler(int x) throws SQLException {
        Conexao co = new Conexao();
        Connection con = co.ligar();
        ResultSet rs = null;
        PreparedStatement stmt = null;

        ArrayList<Dizimo> diz = new ArrayList<>();
        try {
            stmt = (PreparedStatement) con.prepareStatement("SELECT * FROM Dizimo where humanos_idhumanos="+x);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Dizimo d = new Dizimo();
                d.setInstituicao(rs.getString("Instituicao"));
                d.setValor(rs.getFloat("Valor"));
                d.setDataDiz(rs.getString("DataDiz"));
                diz.add(d);
            }

        } catch (SQLException ex) {
               System.out.println(ex.getMessage());
        } finally {
            con.close();
        }
        return diz;
    }
        
        public static float somaDizimo(int x) throws SQLException{
        float soma =0;
        Familia familia = null;
        Conexao co = new Conexao();
        Connection con = co.ligar();
        PreparedStatement stml= null; 
        ResultSet rs= null;
        stml = con.prepareStatement("SELECT SUM(Valor) AS soma FROM Dizimo WHERE Humanos_IdHumanos="+x);
        //stml.setInt(1, familia.getIdFamilia());
        rs= stml.executeQuery();
        while(rs.next()){
            soma= rs.getFloat("soma");  
        }
      return soma;  
    } 
        
}
