package sinmalolor.builder;

import javafx.util.Builder;
import sinmalolor.exceptions.BadCedulaException;
import sinmalolor.exceptions.BadLastNameException;
import sinmalolor.exceptions.BadNameException;
import sinmalolor.models.Localizacion;
import sinmalolor.models.Persona;

public class ClientBuilder implements Builder<Persona> {

    String nombre;
    String apellido;
    String cedula;
    String telefono;
    Localizacion localizacion;

    public ClientBuilder setNombre(String nombre) throws BadNameException {
        if(this.nombre.isEmpty() || this.nombre.length()> 16){
            throw new BadNameException();
        }
        this.nombre = nombre;
        return this;
    }

    public ClientBuilder setApellido(String apellido) throws BadLastNameException {
        if(apellido.isEmpty() || apellido.length() > 16){
            throw new BadLastNameException();
        }

        this.apellido = apellido;
        return this;
    }

    public ClientBuilder setCedula(String cedula) throws BadCedulaException {

        if(cedula.isEmpty() || cedula.length() < 10){
            throw new BadCedulaException();
        }

        this.cedula = cedula;
        return this;
    }

    public ClientBuilder setTelefono(String telefono) {
        this.telefono = telefono;
        return this;
    }

    public ClientBuilder setLocalizacion(Localizacion localizacion) {
        this.localizacion = localizacion;
        return this;
    }

    @Override
    public Persona build() {
        Persona cliente = new Persona();

        cliente.setNombre(this.nombre);
        cliente.setApellido(this.apellido);
        cliente.setCedula(this.cedula);
        cliente.setTelefono(this.telefono);
        cliente.setLocalizacion(this.localizacion);
        return cliente;
    }
}
