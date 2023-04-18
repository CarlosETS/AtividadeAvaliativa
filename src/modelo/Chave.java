/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author IFPR
 */
public class Chave {
    private String num_bloco,nrNomesala;
    private boolean diponivel;
    /**
     * @return the num_bloco
     */
    public String getNum_bloco() {
        return num_bloco;
    }

    /**
     * @param num_bloco the num_bloco to set
     */
    public void setNum_bloco(String num_bloco) {
        this.num_bloco = num_bloco;
    }

    /**
     * @return the diponivel
     */
    public boolean isDiponivel() {
        return diponivel;
    }

    /**
     * @param diponivel the diponivel to set
     */
    public void setDiponivel(boolean diponivel) {
        this.diponivel = diponivel;
    }

    /**
     * @return the nrNomesala
     */
    public String getNrNomesala() {
        return nrNomesala;
    }

    /**
     * @param nrNomesala the nrNomesala to set
     */
    public void setNrNomesala(String nrNomesala) {
        this.nrNomesala = nrNomesala;
    }

    @Override
    public String toString() {
        return "Numero Sala " + nrNomesala+ " Numero Bloco "+ num_bloco+" Disponivel ?" + diponivel;
    }

}
