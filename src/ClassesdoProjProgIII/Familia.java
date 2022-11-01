/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesdoProjProgIII;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Familia {
    private String sobrenome, endereco, bairro, tel;
    private Poupanca economia;
    private  int idFamilia;

    public int getIdFamilia() {
        return idFamilia;
    }

    public void setIdFamilia(int idFamilia) {
        this.idFamilia = idFamilia;
    }
    private ArrayList<GastosMensal> gastos;
    private ArrayList<Animal> animal;
    private ArrayList<PrevMensal> previs;
    

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Poupanca getEconomia() {
        return economia;
    }

    public void setEconomia(Poupanca economia) {
        this.economia = economia;
    }

    public ArrayList<GastosMensal> getGastos() {
        return gastos;
    }

    public void setGastos(ArrayList<GastosMensal> gastos) {
        this.gastos = gastos;
    }

    public ArrayList<Animal> getAnimal() {
        return animal;
    }

    public void setAnimal(ArrayList<Animal> animal) {
        this.animal = animal;
    }

    public ArrayList<PrevMensal> getPrevis() {
        return previs;
    }

    public void setPrevis(ArrayList<PrevMensal> previs) {
        this.previs = previs;
    }
    public Familia(String sobrenome, String endereco, String bairro, String tel) {
        this.sobrenome = sobrenome;
        this.endereco = endereco;
        this.bairro = bairro;
        this.tel = tel;
     }
    
    
}