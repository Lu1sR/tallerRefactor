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
public class Telefono {
    private int codPais;
    private int numero;

    public Telefono(int codPais, int numero) {
        this.codPais = codPais;
        this.numero = numero;
    }

    public int getCodPais() {
        return codPais;
    }

    public void setCodPais(int codPais) {
        this.codPais = codPais;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getTelefono(){
        String telefono = "("+ this.codPais+ ")-" +this.numero;
        return telefono;
    }
}
