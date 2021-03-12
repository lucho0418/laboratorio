/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.gov.parqueadero.manizales.modelo;

import java.io.Serializable;

/**
 *
 * @author lucho
 */
public class Indycar extends Competencia implements Serializable{
    private String constructor;
    private String piloto;

    public Indycar(String constructor, String piloto, String escuderia, String numeroChasis, String color, String numeroMotor) {
        super(escuderia, numeroChasis, color, numeroMotor);
        this.constructor = constructor;
        this.piloto = piloto;
    }

    public String getConstructor() {
        return constructor;
    }

    public void setConstructor(String constructor) {
        this.constructor = constructor;
    }

    public String getPiloto() {
        return piloto;
    }

    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }

    @Override
    public String toString() {
        return "Indycar{" + "constructor=" + constructor + ", piloto=" + piloto + '}';
    }
    
    
    
}
