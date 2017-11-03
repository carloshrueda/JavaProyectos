/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herramienta.liquidacion.mundo;

import java.util.Date;

/**
 *
 * @author CRUEDA
 */
public class Persona {

    private TipoDocumento tipodoc;
    private String primNombre;
    private String segNombre;
    private String primApel;
    private String segApel;
    private int diastrab;
    private int salbas;
    private String numdoc;
    private Date perinicio;
    private Date perfin;
    private int auxtrans;
    private TipoCalculo tipocalc;

    public Persona() {
        this.tipodoc = null;
        this.primNombre = "";
        this.segNombre = "";
        this.primApel = "";
        this.segApel = "";
        this.diastrab = 0;
        this.salbas = 0;
        this.numdoc = "";
        this.perinicio = null;
        this.perfin = null;
        this.auxtrans = 0;
        this.tipocalc = null;
    }

    public TipoDocumento getTipodoc() {
        return tipodoc;
    }

    public void setTipodoc(TipoDocumento tipodoc) {
        this.tipodoc = tipodoc;
    }

    public String getPrimNombre() {
        return primNombre;
    }

    public void setPrimNombre(String primNombre) {
        this.primNombre = primNombre;
    }

    public String getSegNombre() {
        return segNombre;
    }

    public void setSegNombre(String segNombre) {
        this.segNombre = segNombre;
    }

    public String getPrimApel() {
        return primApel;
    }

    public void setPrimApel(String primApel) {
        this.primApel = primApel;
    }

    public String getSegApel() {
        return segApel;
    }

    public void setSegApel(String segApel) {
        this.segApel = segApel;
    }

    public int getDiastrab() {
        return diastrab;
    }

    public void setDiastrab(int diastrab) {
        this.diastrab = diastrab;
    }

    public int getSalbas() {
        return salbas;
    }

    public void setSalbas(int salbas) {
        this.salbas = salbas;
    }

    public String getNumdoc() {
        return numdoc;
    }

    public void setNumdoc(String numdoc) {
        this.numdoc = numdoc;
    }

    public Date getPerinicio() {
        return perinicio;
    }

    public void setPerinicio(Date perinicio) {
        this.perinicio = perinicio;
    }

    public Date getPerfin() {
        return perfin;
    }

    public void setPerfin(Date perfin) {
        this.perfin = perfin;
    }

    public int getAuxtrans() {
        return auxtrans;
    }

    public void setAuxtrans(int auxtrans) {
        this.auxtrans = auxtrans;
    }

    public TipoCalculo getTipocalc() {
        return tipocalc;
    }

    public void setTipocalc(TipoCalculo tipocalc) {
        this.tipocalc = tipocalc;
    }

}
