package sinmalolor.models;

import javafx.util.Builder;

public class Persona {
    String nombre;
    String apellido;
    String cedula;
    String telefono;
    Localizacion localizacion;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String cedula, String telefono, Localizacion localizacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.telefono = telefono;
        this.localizacion = localizacion;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {

        this.apellido = apellido;

    }

    public String getCedula() {
        return cedula;
    }

    public boolean setCedula(String cedula) {
        if(cedula.isEmpty() || cedula.length() < 10){
            return false;
        }

        this.cedula = cedula;
        return true;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Localizacion getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(Localizacion localizacion) {
        this.localizacion = localizacion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Nombre: ").append(nombre).append("\n");
        sb.append("Apellido: ").append(apellido).append("\n");
        sb.append("Cedula: ").append(cedula).append("\n");
        sb.append("Telefono: ").append(telefono).append("\n");
        sb.append(localizacion);
        return sb.toString();
    }

}
