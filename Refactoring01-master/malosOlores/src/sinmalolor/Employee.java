/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinmalolor;

public class Employee
{   

    protected String Nombre;
    protected String Apellido;
    protected String Cedula;
    protected Localizacion data;
    protected Direccion direccion;
	protected final float rmu = (float) 386.0;
    //salario del employee
    protected float salary;
    //porcentaje de bonus
    protected float bonusPercentage;    
    //variable de tipo employeeType    

    public Employee(float salary, float bonusPercentage)    
    {        
        this.salary = salary;        
        this.bonusPercentage = bonusPercentage;        
        this.Nombre = "Descconocido";
        this.Apellido = "Descconocido";
        this.Cedula = "0000000000";
        this.data.cambiarDireccion("Ecuador", "Gye", "Guayas");
        this.direccion.setDireccion("ESPOL Prosperina"," ", 0, 0);
        
    }
    //calcula el salario dependiendo del tipo de trabajador y entrega el décimo correspondiente cada 2 meses
   
   
  
        /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Apellido
     */
    public String getApellido() {
        return Apellido;
    }

    /**
     * @param Apellido the Apellido to set
     */
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    /**
     * @return the Cedula
     */
    public String getCedula() {
        return Cedula;
    }

    /**
     * @param Cedula the Cedula to set
     */
    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }
 
	public Localizacion getData() {
		return data;
	}
	public void setData(Localizacion data) {
		this.data = data;
	}
}
