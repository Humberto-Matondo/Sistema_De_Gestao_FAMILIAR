/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesdoProjProgIII;
/**
 *
 * @author HP
 */

public class Humanos extends Familia {
    private String nome, email, tele, data,grau, senha;
    private int idFamilia;
    public int idHumanos;

    public int getIdHumanos() {
        return idHumanos;
    }

    public void setIdHumanos(int idHumanos) {
        this.idHumanos = idHumanos;
    }
    
    public int getIdHumano() {
        return idHumano;
    }

    public void setIdHumano(int idHumano) {
        this.idHumano = idHumano;
    }
    private int idHumano;
    
    public Humanos(String sobrenome, String endereco, String bairro, String tel) {
        super(sobrenome, endereco, bairro, tel);
    }

    public Humanos(String nome, String email, String tele, String data, String grau, String senha, int idFamilia, int idHumano, String sobrenome, String endereco, String bairro, String tel) {
        super(sobrenome, endereco, bairro, tel);
        this.nome = nome;
        this.email = email;
        this.tele = tele;
        this.data = data;
        this.grau = grau;
        this.senha = senha;
        this.idFamilia = idFamilia;
        this.idHumano = idHumano;
    }

  

   


    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTele() {
        return tele;
    }

    public void setTele(String tel) {
        this.tele = tel;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getGrau() {
        return grau;
    }

    public void setGrau(String grau) {
        this.grau = grau;
    }

    public int getIdFamilia() {
        return idFamilia;
    }

    public void setIdFamilia(int idFamilia) {
        this.idFamilia = idFamilia;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
   
    
    
}
