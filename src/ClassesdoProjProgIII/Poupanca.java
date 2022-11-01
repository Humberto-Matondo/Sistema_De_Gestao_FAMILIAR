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
public class Poupanca{


    public Poupanca(String motivoDaPou, float valor, String dataInicioPou) {
        this.motivoDaPou = motivoDaPou;
        this.valor = valor;
        this.dataInicioPou = dataInicioPou;
    }
private String motivoDaPou;
    private float valor;
    private String dataInicioPou;
    private int idHumanos;
    private int idFamilia;
    private Familia familia;
    private Humanos humanos;
    private int id ;

    public String getMotivoDaPou() {
        return motivoDaPou;
    }

    public void setMotivoDaPou(String motivoDaPou) {
        this.motivoDaPou = motivoDaPou;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getDataInicioPou() {
        return dataInicioPou;
    }

    public void setDataInicioPou(String dataInicioPou) {
        this.dataInicioPou = dataInicioPou;
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
    

    public int getIdFamilia() {
        return idFamilia;
    }

    public void setIdFamilia(int idFamilia) {
        this.idFamilia = idFamilia;
    }
    
    public Poupanca(){
        
    }
}
