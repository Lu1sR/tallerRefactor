package sinmalolor.models;

public class Localizacion {
	private String provincia;
	private String pais;
	private String ciudad;
	private String direccion;

	public Localizacion() {
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	 public void cambiarDireccion(String nuevoPais, String ciudadnueva, String provinciaNueva, String direccionNueva){
	       pais = nuevoPais;
	       ciudad = ciudadnueva;
	       provincia = provinciaNueva;
	       direccion = direccionNueva;
	}
	 public String mostrarDireccion(){	        
	        return  pais + " - " + provincia + " - " + ciudad+ "\n" + direccion;
	}
}