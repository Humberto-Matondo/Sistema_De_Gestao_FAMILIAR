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
public class Rendimento{
    private String origem, dataRend;
    private float valor;

    public Rendimento(String origem, String dataRend, float valor) {
        this.origem = origem;
        this.dataRend = dataRend;
        this.valor = valor;
    }
    private int idHumanos;
    private Familia familia;
    private Humanos humanos;
    private int id ;
    
    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDataRend() {
        return dataRend;
    }

    public void setDataRend(String dataRend) {
        this.dataRend = dataRend;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
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
    
    public Rendimento(){
        
    }
    
}
