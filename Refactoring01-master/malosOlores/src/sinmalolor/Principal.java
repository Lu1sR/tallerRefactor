/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinmalolor;

import sinmalolor.builder.ClientBuilder;
import sinmalolor.models.EmployeeWorker;
import sinmalolor.models.Empresa;
import sinmalolor.models.Localizacion;
import sinmalolor.models.Persona;

/**
 *
 * @author djurado
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empresa miEmpresa = new Empresa();

        try {
            Persona cliente = new ClientBuilder()
                    .setNombre("Alberto")
                    .setApellido("Castillo")
                    .setCedula("0987678711")
                    .setLocalizacion(new Localizacion("Guayas","Ecuador","Guayaquil","Enrique segoviano"))
                    .build();
            
            miEmpresa.guardarCliente(cliente);
            miEmpresa.mostrarInformacion(cliente);

            miEmpresa.mostrarTodo();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
    
}
