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
public class Dizimo{

    public Dizimo(float valor, String instituicao, String dataDiz) {
        this.valor = valor;
        this.instituicao = instituicao;
        this.dataDiz = dataDiz;
    }
    private float valor;
    private String instituicao, dataDiz;
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

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public String getDataDiz() {
        return dataDiz;
    }

    public void setDataDiz(String dataDiz) {
        this.dataDiz = dataDiz;
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

    
    public Dizimo(){
        
    }
}
