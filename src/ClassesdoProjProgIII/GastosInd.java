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
public class GastosInd {

    public GastosInd(String designacao, String localdogasto, String dataGasto, float valor) {
        this.designacao = designacao;
        this.localdogasto = localdogasto;
        this.dataGasto = dataGasto;
        this.valor = valor;
    }
    private String designacao, localdogasto, dataGasto;
    private float valor;
    private int idHumanos;
    private Familia familia;
    private Humanos humanos;
    private int id ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesignacao() {
        return designacao;
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    public String getLocaldogasto() {
        return localdogasto;
    }

    public void setLocaldogasto(String localdogasto) {
        this.localdogasto = localdogasto;
    }

    public String getDataGasto() {
        return dataGasto;
    }

    public void setDataGasto(String dataGasto) {
        this.dataGasto = dataGasto;
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

    public GastosInd() {
    }

  
    
    

  
    
    
}
