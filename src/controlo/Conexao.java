/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Conexao{
    
     public static Connection ligar() throws SQLException{
       
        Connection con = null;    

        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myMoney","root","tch");//REVER ISSO
        }catch(ClassNotFoundException cnfe){
            JOptionPane.showMessageDialog(null,"Erro ClassNotFoundException\n"+cnfe);
        }catch(SQLException sqle){
            JOptionPane.showMessageDialog(null,"Erro SQLException\n"+sqle);
        }
        return con;
    }
    public static void desligar(Connection con){
        try{
            con.close();
        }catch(SQLException sqle){
        JOptionPane.showMessageDialog(null,"Erro \n\n"+sqle);
        }
    
    }
    
    public static void main(String[] args) {
         try {
             ligar();
         } catch (SQLException ex) {
             Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
}