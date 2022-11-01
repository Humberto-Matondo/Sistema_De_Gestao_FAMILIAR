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
public class PrevMensal{
    private float valor;
    private String nomeDoGasto;

    public PrevMensal(float valor, String nomeDoGasto) {
        this.valor = valor;
        this.nomeDoGasto = nomeDoGasto;
    }
    private int idHumanos;
    private Familia familia;
    private Humanos humanos;
    private int id ;

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getNomeDoGasto() {
        return nomeDoGasto;
    }

    public void setNomeDoGasto(String nomeDoGasto) {
        this.nomeDoGasto = nomeDoGasto;
    }

    public int getIdHumanos() {
        return idHumanos;
    }

    public void setIdHumanos(int idHumanos) {
        this.idHumanos = idHumanos;
    }

    public Familia getFamilia() {
        return familia;
    }

    public void setFamilia(Familia familia) {
        this.familia = familia;
    }

    public Humanos getHumanos() {
        return humanos;
    }

    public void setHumanos(Humanos humanos) {
        this.humanos = humanos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    


    public PrevMensal(){
        
    }
}
