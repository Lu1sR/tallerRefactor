package sinmalolor;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



public class Cliente {
    private String Nombre;
    private String Apellido;
    private String Cedula;
    private Localizacion local = new Localizacion();
    private String telefono;
    
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
        return local.mostrarDireccion();
    }
    
    public void setLocation(String nuevoPais, String ciudadnueva, String provinciaNueva, String direccionNueva){
        local.cambiarDireccion(nuevoPais, ciudadnueva, provinciaNueva, direccionNueva);
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Localizacion getLocal() {
        return local;
    }

    public void setLocal(Localizacion local) {
        this.local = local;
    }

    
}
