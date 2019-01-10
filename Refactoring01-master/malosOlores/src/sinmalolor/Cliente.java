package sinmalolor;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



public class Cliente {
    protected String Nombre;
    protected String Apellido;
    protected String Cedula;
    protected Localizacion data;
    protected Direccion direccion;
    protected Telefono telefono;
    
    public Cliente(String Nombre, String Apellido, String Cedula) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Cedula = Cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String mostrarLocation(){
        String dir = data.getPais() + " - " + data.getProvincia() + " - " + data.getCiudad();
        return  dir+ "\n" + direccion.mostrarDireccion();
    }
    
    public void setLocation(String nuevoPais, String ciudadnueva, String provinciaNueva, String direccionNueva){
        data.setPais(nuevoPais);
        data.setCiudad(ciudadnueva);
        data.setProvincia(provinciaNueva);
        
    }
    public void setDireccion(String calle1, String calle2, int numeManzana,int numeroDominicilio){
        direccion.setCalle1(calle1);
        direccion.setCalle2(calle2);
        direccion.setNumeroDomicilio(numeroDominicilio);
        direccion.setNumeroManzana(numeManzana);
    }
    public String getTelefono() {
        return telefono.getTelefono();
    }

    public void setTelefono(int codPais, int numero) {
        telefono.setCodPais(codPais);
        telefono.setNumero(numero);
    }

    
}
