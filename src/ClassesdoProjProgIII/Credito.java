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
public class Credito{
    
    private float valorConc, valorDiv, valorVenc, totalRed;
    private String dataInacio, localCred, dataFim;
    private int idHumanos;
    private Familia familia;
    private Humanos humanos;
    private int id ;

    public Credito(float valorConc, float valorDiv, float valorVenc, float totalRed, String dataInacio, String localCred, String dataFim) {
        this.valorConc = valorConc;
        this.valorDiv = valorDiv;
        this.valorVenc = valorVenc;
        this.totalRed = totalRed;
        this.dataInacio = dataInacio;
        this.localCred = localCred;
        this.dataFim = dataFim;
    }
    
    
    public float getValorConc() {
        return valorConc;
    }

    public void setValorConc(float valorConc) {
        this.valorConc = valorConc;
    }

    public float getValorDiv() {
        return valorDiv;
    }

    public void setValorDiv(float valorDiv) {
        this.valorDiv = valorDiv;
    }

    public float getValorVenc() {
        return valorVenc;
    }

    public void setValorVenc(float valorVenc) {
        this.valorVenc = valorVenc;
    }

    public float getTotalRed() {
        return totalRed;
    }

    public void setTotalRed(float totalRed) {
        this.totalRed = totalRed;
    }

    public String getDataInacio() {
        return dataInacio;
    }

    public void setDataInacio(String dataInacio) {
        this.dataInacio = dataInacio;
    }

    public String getLocalCred() {
        return localCred;
    }

    public void setLocalCred(String localCred) {
        this.localCred = localCred;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
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

    public Credito(){
    }
}
