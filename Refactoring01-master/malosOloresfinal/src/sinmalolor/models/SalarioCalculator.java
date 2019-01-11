/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinmalolor.models;

/**
 *
 * @author carlasanchez
 */
public class SalarioCalculator {
    private float salario;
    private float bono;
    public float calcularSalario(Employee empleado){
        this.salario = empleado.calcularSalario();
        return salario;
    }
}
