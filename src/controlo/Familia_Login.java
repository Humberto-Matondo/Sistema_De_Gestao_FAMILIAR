/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlo;

import ClassesdoProjProgIII.Animal;
import ClassesdoProjProgIII.Humanos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Familia_Login {
    public static int idfamilia;
    public static int idpessoa;
    
    
    public void CadastrarFamilia(Humanos dados){//faz o cadastramento da Familia_Login
        Conexao co=new Conexao();
        
        try {
            Connection c=co.ligar();
            PreparedStatement p=c.prepareStatement("INSERT INTO familia(sobrenome, endereco, bairro, tel) values(?,?,?,?)");
            p.setString(1, dados.getSobrenome());
            p.setString(2, dados.getEndereco());
            p.setString(3, dados.getBairro());
            p.setString(4, dados.getTel());
            p.execute();
            JOptionPane.showMessageDialog(null, "Familia Cadastrada");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro");
        }
    }
    
    public int buscaCod( String numero){//pega o cod que cadastrei a Familia_Login !0000000000000000000000000000!
        int codigo= -1;
        try{
           Conexao co=new Conexao();
            Connection con=co.ligar();
            String busca="select idfamilia from familia where tel=?";
            PreparedStatement p=con.prepareStatement(busca);
            p.setString(1, numero);
            ResultSet rs=p.executeQuery();
            while(rs.next()){
                codigo=rs.getInt("idfamilia");
            }  
        }   
        catch(SQLException e){
         JOptionPane.showMessageDialog(null, "Erro\n"+e);   
        }
        return codigo;
    }
        
     public void cadastrarPessoa(Humanos dados){//cadastra a famila ou seja pega os dados que digitar no CADASTRARFAMILIA
         try{
            Conexao co=new Conexao();
            Connection con=co.ligar();
            String inserir="INSERT INTO humanos(familia_idfamilia, nome, dataNas, tel, email, relacao, senha) values(?,?,?,?,?,?,?)";
            PreparedStatement p= con.prepareStatement(inserir);//passaporte para o java ter acesso a BD
            p.setInt(1, dados.getIdFamilia());
            p.setString(2, dados.getNome());
            p.setString(3, dados.getData());
            p.setString(4, dados.getTel());
            p.setString(5, dados.getEmail());
            p.setString(6, dados.getGrau());
            p.setString(7, dados.getSenha());
            p.execute();
            JOptionPane.showMessageDialog(null, "MEMBRO CADASTRADO");
         }catch(SQLException ex){
             JOptionPane.showMessageDialog(null, "ERRO!\n"+ex);
         }
     }
 
    public Humanos Login(String nome, String senha){
        Humanos h=null;
        try{
            Conexao co=new Conexao();
            Connection con=co.ligar();
            String busca="select * from humanos WHERE nome=? AND senha=?";
            PreparedStatement p= con.prepareStatement(busca);
            p.setString(1, nome);
            p.setString(2, senha); 
            ResultSet rs=p.executeQuery();
            if(rs!=null){

                while(rs.next()){
                    h= new Humanos(rs.getString("nome"),rs.getString("email"),rs.getString("tel"),rs.getString("dataNas"),rs.getString("relacao"), null, rs.getInt("Familia_idfamilia"), rs.getInt("idHumanos"), null,null, null,null);
                    h.setIdFamilia(rs.getInt("familia_idfamilia"));
                    h.setIdHumano(rs.getInt("idHumanos"));
                    idfamilia=h.getIdFamilia();
                    idpessoa=h.getIdHumano();
                }
            }else{
                return h;
            }
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }   
        return h;
    }

    public void CadastrarFamilia(Animal a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
