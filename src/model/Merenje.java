/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author novke
 */
public class Merenje {
    
    private double iznos;
    private Date datum;

    public double getIznos() {
        return iznos;
    }

    public void setIznos(double iznos) {
        if (iznos <=0) throw new RuntimeException();
        this.iznos = iznos;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        //if (datum==null || datum.after(new Date())) throw new RuntimeException();
        this.datum = datum;
    }
    
    
}
