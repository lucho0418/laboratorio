/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.gov.parqueadero.manizales.modelo;

import java.io.Serializable;

/**
 *
 * @author carloaiza
 */
public class Taxi extends TransportePublico implements Serializable{
    private double valorCupo;
    private String tipoOperacion;

    public Taxi(double valorCupo, String tipoOperacion, short numeroPasajeros, float capacidad, String tipoCarroceria, String placa, String numeroChasis, String color, String numeroMotor) {
        super(numeroPasajeros, capacidad, tipoCarroceria, placa, numeroChasis, color, numeroMotor);
        this.valorCupo = valorCupo;
        this.tipoOperacion = tipoOperacion;
    }
    
    
    
}
