package sinmalolor;

public class Localizacion {
	private String provincia;
	private String pais;
	private String ciudad;

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

	 public void cambiarDireccion(String nuevoPais, String ciudadnueva, String provinciaNueva){
	       this.pais = nuevoPais;
	       this.ciudad = ciudadnueva;
	       this.provincia = provinciaNueva;
	       
	}
	 public String mostrarDireccion(){
	        String dir = this.pais + " - " + this.provincia + " - " + this.ciudad;
	        return  dir+ "\n";
	}
}
