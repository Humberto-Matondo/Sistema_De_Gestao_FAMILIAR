/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import ClassesdoProjProgIII.GastosInd;
import ClassesdoProjProgIII.Humanos;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GastosI {

    public void adicionarGastos(GastosInd gastos) {
        {
            try {
                Conexao co = new Conexao();
                Connection con = co.ligar();
                String inserir = "INSERT INTO GastosIndividuais(Humanos_idHumanos, designacao, valor, localdogasto, datagastos) values(?,?,?,?,?)";

                PreparedStatement p = con.prepareStatement(inserir);//passaporte para o java ter acesso a BD
                p.setInt(1, gastos.getHumanos().getIdHumanos());
                p.setString(2, gastos.getDesignacao());
                p.setFloat(3, gastos.getValor());
                p.setString(4, gastos.getLocaldogasto());
                p.setString(5, gastos.getDataGasto());
                p.execute();
                JOptionPane.showMessageDialog(null, "GASTO ADICIONADO");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "ERRO!\n" + ex);
            }
        }
    }

    public ArrayList<GastosInd> ler(int x) throws SQLException {
        Conexao co = new Conexao();
        Connection con = co.ligar();
        ResultSet rs = null;
        PreparedStatement stmt = null;

        ArrayList<GastosInd> gastos = new ArrayList<>();
        try {
            stmt = (PreparedStatement) con.prepareStatement("SELECT * FROM GastosIndividuais where humanos_idhumanos="+x);
            rs = stmt.executeQuery();
            while (rs.next()) {
                GastosInd gasto = new GastosInd();
           
                gasto.setDesignacao(rs.getString("Designacao"));
                gasto.setValor(rs.getFloat("Valor"));
                gasto.setLocaldogasto(rs.getString("Localdogasto"));
                gasto.setDataGasto(rs.getString("Datagastos"));
                gastos.add(gasto);
            }
        } catch (SQLException ex) {
               System.out.println(ex.getMessage());
        } finally {
            con.close();
        }
        return gastos;
    }
       public static boolean Eliminar(String id){
        try {
            Conexao co = new Conexao();
            Connection con = co.ligar();
            String query="DELETE FROM rendimento WHERE idGastosIndiduais=?";
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
    
    public static float somaGastosI(int x) throws SQLException{
        float soma =0;
        Humanos humanos;
        Conexao co = new Conexao();
        Connection con = co.ligar();
        PreparedStatement stml= null; 
        ResultSet rs= null;
        stml = con.prepareStatement("SELECT SUM(Valor) AS soma FROM GastosIndividuais WHERE Humanos_idHumanos="+x);
        //stml.setInt(1, humanos.getIdHumanos());
        rs= stml.executeQuery();
        while(rs.next()){
            soma= rs.getFloat("soma");  
        }
      return soma;  
    } 

}
