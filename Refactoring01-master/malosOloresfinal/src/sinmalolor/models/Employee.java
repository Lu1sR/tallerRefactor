/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinmalolor.models;
import sinmalolor.models.Persona;

public abstract class Employee extends Persona
{   
    protected float salary;
    protected float bonusPercentage;    

    public Employee(float salary, float bonusPercentage)    
    {        
        this.salary = salary;        
        this.bonusPercentage = bonusPercentage;        
        super.Nombre = "Desconocido";
        super.Apellido = "Desconocido";
        super.Cedula = "0000000000";
        super.local.cambiarDireccion("Ecuador", "Gye", "Guayas", "ESPOL Prosperina");
        
    }
    //calcula el salario dependiendo del tipo de trabajador y entrega el décimo correspondiente cada 2 meses
   
   
    public abstract float calcularSalario();
    public abstract float CalculateYearBonus();

    
         
}
