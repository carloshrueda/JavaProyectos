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
    private long diasperiodo;
    private int saldevengado;
    private int desEps;
    private int desPension;
    private int bonoAuxTx;
    private int salneto;
    private int prima;
    private int cesantias;
    private int vacaciones;
    private int intcesantias;
    private int liquidacion;

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
        this.diasperiodo = 0;
        this.saldevengado = 0;
        this.desEps = 0;
        this.desPension = 0;
        this.bonoAuxTx = 0;
        this.salneto = 0;
        this.prima = 0;
        this.cesantias = 0;
        this.vacaciones = 0;
        this.intcesantias = 0;
        this.liquidacion = 0;
    }

    public Persona(Persona p) {
        this.tipodoc = p.tipodoc;
        this.primNombre = p.primNombre;
        this.segNombre = p.segNombre;
        this.primApel = p.primApel;
        this.segApel = p.segApel;
        this.diastrab = p.diastrab;
        this.salbas = p.salbas;
        this.numdoc = p.numdoc;
        this.perinicio = p.perinicio;
        this.perfin = p.perfin;
        this.auxtrans = p.auxtrans;
        this.diasperiodo = p.diasperiodo;
        this.saldevengado = p.saldevengado;
        this.desEps = p.desEps;
        this.desPension = p.desPension;
        this.bonoAuxTx = p.bonoAuxTx;
        this.salneto = p.salneto;
        this.prima = p.getPrima();
        this.cesantias = p.getCesantias();
        this.vacaciones = p.getVacaciones();
        this.intcesantias = p.getIntcesantias();
        this.liquidacion = p.getLiquidacion();
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

    public long getDiasperiodo() {
        return diasperiodo;
    }

    public void setDiasperiodo(long diasperiodo) {
        this.diasperiodo = diasperiodo;
    }

    public int getSaldevengado() {
        return saldevengado;
    }

    public void setSaldevengado(int saldevengado) {
        this.saldevengado = saldevengado;
    }

    public int getDesEps() {
        return desEps;
    }

    public void setDesEps(int desEps) {
        this.desEps = desEps;
    }

    public int getDesPension() {
        return desPension;
    }

    public void setDesPension(int desPension) {
        this.desPension = desPension;
    }

    public int getBonoAuxTx() {
        return bonoAuxTx;
    }

    public void setBonoAuxTx(int bonoAuxTx) {
        this.bonoAuxTx = bonoAuxTx;
    }

    public int getSalneto() {
        return salneto;
    }

    public void setSalneto(int salneto) {
        this.salneto = salneto;
    }

    public int getbonoAuxTx() {
        return bonoAuxTx;
    }

    public int getPrima() {
        return prima;
    }

    public void setPrima(int prima) {
        this.prima = prima;
    }

    public int getCesantias() {
        return cesantias;
    }

    public void setCesantias(int cesantias) {
        this.cesantias = cesantias;
    }

    public int getVacaciones() {
        return vacaciones;
    }

    public void setVacaciones(int vacaciones) {
        this.vacaciones = vacaciones;
    }

    public int getIntcesantias() {
        return intcesantias;
    }

    public void setIntcesantias(int intcesantias) {
        this.intcesantias = intcesantias;
    }

    public int getLiquidacion() {
        return liquidacion;
    }

    public void setLiquidacion(int liquidacion) {
        this.liquidacion = liquidacion;
    }

}
