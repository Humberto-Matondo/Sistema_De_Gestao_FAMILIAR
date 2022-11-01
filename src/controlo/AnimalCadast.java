package controlo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import ClassesdoProjProgIII.Animal;

public class AnimalCadast {
    public void cadastrarAnimal(Animal animal){ 
         {
            try{ 
            Conexao co=new Conexao();
            Connection con=co.ligar();
            String inserir="INSERT INTO animal(familia_idFamilia, tipoAnimal, raca, nome, dataNas) values(?,?,?,?,?)";
           
            PreparedStatement p= con.prepareStatement(inserir);//passaporte para o java ter acesso a BD
            p.setInt(1, animal.getFamilia().getIdFamilia());
            p.setString(2, animal.getTipoAnimal());
            p.setString(3, animal.getNome());
            p.setString(4, animal.getRaca());
            p.setString(5, animal.getDataNas());
            p.execute();
            JOptionPane.showMessageDialog(null, "ANIMAL CADASTRADO");
         }catch(SQLException ex){
             JOptionPane.showMessageDialog(null, "ERRO: \n"+ex);
            }
        }
    }    
    
}
