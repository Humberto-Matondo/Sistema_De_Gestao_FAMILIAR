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
public class Animal extends Familia {
   private String raca;
   private String tipoAnimal,nome;
   private String dataNas;
    private Familia familia;

    public Familia getFamilia() {
        return familia;
    }

    public void setFamilia(Familia familia) {
        this.familia = familia;
    }
    
    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNas() {
        return dataNas;
    }

    public void setDataNas(String dataNas) {
        this.dataNas = dataNas;
    }

    public Animal(String sobrenome, String endereco, String bairro, String tel) {
        super(sobrenome, endereco, bairro, tel);
    }

    public Animal(String raca, String tipoAnimal, String nome, String dataNas, String sobrenome, String endereco, String bairro, String tel) {
        super(sobrenome, endereco, bairro, tel);
        this.raca = raca;
        this.tipoAnimal = tipoAnimal;
        this.nome = nome;
        this.dataNas = dataNas;
    }

   

    
}
