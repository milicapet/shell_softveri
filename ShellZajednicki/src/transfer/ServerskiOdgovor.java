/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transfer;

import java.io.Serializable;

/**
 *
 * @author milic
 */
public class ServerskiOdgovor implements Serializable{
    
    private Object parametar;
    private String poruka;

    public ServerskiOdgovor() {
    }

    public ServerskiOdgovor(Object parametar, String poruka) {
        this.parametar = parametar;
        this.poruka = poruka;
    }

    public String getPoruka() {
        return poruka;
    }

    public void setPoruka(String poruka) {
        this.poruka = poruka;
    }

    public Object getParametar() {
        return parametar;
    }

    public void setParametar(Object parametar) {
        this.parametar = parametar;
    }
    
    
    
}
