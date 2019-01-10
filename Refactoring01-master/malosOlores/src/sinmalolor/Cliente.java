package sinmalolor;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



public class Cliente {
    public String Nombre;
    public String Apellido;
    public String Cedula;
    private Localizacion data = new Localizacion();
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
        String dir = data.getPais() + " - " + data.getProvincia() + " - " + data.getCiudad();
        return  dir+ "\n" + data.getDireccion();
    }
    
    public void setLocation(String nuevoPais, String ciudadnueva, String provinciaNueva, String direccionNueva){
        data.setPais(nuevoPais);
        data.setCiudad(ciudadnueva);
        data.setProvincia(provinciaNueva);
        data.setDireccion(direccionNueva);
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    
}
