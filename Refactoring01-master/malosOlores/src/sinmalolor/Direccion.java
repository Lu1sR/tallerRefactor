/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinmalolor;

/**
 *
 * @author Usuario
 */
public class Direccion {
    private String calle1;
    private String calle2;
    private int numeroManzana;
    private int numeroDomicilio;

    public Direccion(String calle1, String calle2, int numeroManzana, int numeroDomicilio) {
        this.calle1 = calle1;
        this.calle2 = calle2;
        this.numeroManzana = numeroManzana;
        this.numeroDomicilio = numeroDomicilio;
    }

    public String getCalle1() {
        return calle1;
    }

    public void setCalle1(String calle1) {
        this.calle1 = calle1;
    }

    public String getCalle2() {
        return calle2;
    }

    public void setCalle2(String calle2) {
        this.calle2 = calle2;
    }

    public int getNumeroManzana() {
        return numeroManzana;
    }

    public void setNumeroManzana(int numeroManzana) {
        this.numeroManzana = numeroManzana;
    }

    public int getNumeroDomicilio() {
        return numeroDomicilio;
    }

    public void setNumeroDomicilio(int numeroDomicilio) {
        this.numeroDomicilio = numeroDomicilio;
    }
    public String mostrarDireccion(){
        String dir = this.calle1 + " - " + this.calle2 + " - " + this.numeroManzana+" - " + this.numeroDomicilio;
        return dir;
    }
    public void setDireccion(String calle1, String calle2, int numeroManzana, int numeroDomicilio){
        this.calle1=calle1;
        this.calle2=calle2;
        this.numeroManzana=numeroManzana;
        this.numeroDomicilio=numeroDomicilio;
    }
}
