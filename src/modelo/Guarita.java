/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author IFPR
 */
public class Guarita {
    private Vigilante Vigilante;
    private ArrayList<String> todasChaves = new ArrayList();

    /**
     * @return the Vigilante
     */
    public Vigilante getVigilante() {
        return Vigilante;
    }

    /**
     * @param Vigilante the Vigilante to set
     */
    public void setVigilante(Vigilante Vigilante) {
        this.Vigilante = Vigilante;
    }

    /**
     * @return the todasChaves
     */
    public ArrayList<String> getTodasChaves() {
        return todasChaves;
    }

    /**
     * @param todasChaves the todasChaves to set
     */
    public void setTodasChaves(ArrayList<String> todasChaves) {
        this.todasChaves = todasChaves;
    }
    
}
