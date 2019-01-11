/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinmalolor;

import java.util.ArrayList;
import java.util.List;




public class Empresa {
    
    private List<Cliente> clientes;
    private List<Employee> empleados;
    
    public Empresa(){
        clientes = new ArrayList<Cliente>();
        empleados = new ArrayList<Employee>();
    }
    
    public List<Employee> getEmpleados(){
    return empleados;
    }
    
    public void MostrarInformacion(Cliente cliente){
        System.out.println("Cliente:");
        System.out.println("Nombre: " + cliente.getNombre() + ", Apellido: " + cliente.getApellido() + ", con numero de cedula: " + cliente.getCedula() );
        System.out.println("Direccion: " + cliente.mostrarLocation());
        System.out.println("----------------------");
    }
    public void MostrarInformacionEmp(Employee emp){
        System.out.println("Empleado:");
        System.out.println("Nombre: " + emp.getNombre() + ", Apellido: " + emp.getApellido() + ", con numero de cedula: " + emp.getCedula() );
        System.out.println("Direccion: " + emp.getData().mostrarDireccion());
        System.out.println("----------------------");
    }
    
    public void GuardarCliente(String Nombre, String Apellido, String Cedula){
        validarInformacion(Nombre,Apellido,Cedula);
        Cliente cliente = new Cliente(Nombre, Apellido, Cedula);
        cliente.setLocation("Ecuador", "Guayaquil", "Guayas", "Alborada 3era etapa");
        this.clientes.add(cliente);
        System.out.println(Nombre +" " + Apellido + " ha sido agregado como nuevo cliente");
        
    }
    
    public void validarInformacion(String Nombre, String Apellido, String Cedula ){
        final boolean nombrevalido= Nombre.equals("") && Nombre.length()> 16;
        final boolean apellidovalido= Apellido.equals("") && Apellido.length()> 16;
        final boolean cedulavalida =Cedula.equals("") && Cedula.length()< 10;
        if(nombrevalido){
            mostrarMensaje(true, "nombre");
        }else{
            mostrarMensaje(false, "nombre");
            
        }
        if(apellidovalido){
            mostrarMensaje(true, "apellido");

        }else{
            mostrarMensaje(false, "apellido");
            
        }
        if(!cedulavalida){
            mostrarMensaje(true, "cedula");
        }else{
            mostrarMensaje(false, "cedula");

        }
        
    }
    
    public void mostrarMensaje(boolean valido, String campo){
    if(valido == true){
        System.out.println("ingreso de " + campo+ " correcto");
    }else{
        System.out.println("ingreso de " + campo+ " incorrecto");
    }
    }
    
    public void mostrarTodo() {
        
        for(Cliente cliente : this.clientes){
            MostrarInformacion(cliente);           
        }
        
        for(Employee empleado : this.empleados){
            MostrarInformacionEmp(empleado);           
        }
    }
    
    
}
