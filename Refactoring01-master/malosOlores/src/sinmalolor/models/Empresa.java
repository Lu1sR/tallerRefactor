/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinmalolor.models;

import java.util.ArrayList;
import java.util.List;




public class Empresa {
    
    private List<Persona> clientes;
    private List<Employee> empleados;
    
    public Empresa(){
        clientes = new ArrayList<Persona>();
        empleados = new ArrayList<Employee>();
    }
    
    public void mostrarInformacion(Persona cliente){
        System.out.println(cliente);
    }
    public void mostrarInformacionEmployee(Employee employee){
        System.out.println(employee);
    }
    
    public void guardarCliente(Persona cliente){

        this.clientes.add(cliente);

    }

    public void guardarEmpleado(Employee employee){
        this.empleados.add(employee);
    }
    
    public void mostrarTodo() {
        
        //Mostrar los clientes 
        for(Persona cliente : this.clientes){
            mostrarInformacion(cliente);
        }
        
        //Mostrar los empleados 
        for(Employee empleado : this.empleados){
            mostrarInformacionEmployee(empleado);
        }
    }
    
    
}
