package sinmalolor.models;

public class Localizacion {

	private String provincia;
	private String pais;
	private String ciudad;
	private String direccion;


	public Localizacion(String provincia, String pais, String ciudad, String direccion) {
		this.provincia = provincia;
		this.pais = pais;
		this.ciudad = ciudad;
		this.direccion = direccion;
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

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append("Pais: ").append(pais).append("\n");
		sb.append("Provincia: ").append(provincia).append("\n");
		sb.append("Ciudad: ").append(ciudad).append("\n");
		sb.append("Dirección:").append(direccion).append("\n");

		return sb.toString();
	}
}