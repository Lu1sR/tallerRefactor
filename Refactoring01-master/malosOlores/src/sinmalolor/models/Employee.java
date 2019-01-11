/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinmalolor.models;


public class Employee extends Persona{

    protected float salary;
    protected float bonusPercentage;

    public Employee(){
        super();
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("Salario: ").append(salary).append("\n");
        sb.append("Bonus percentage: ").append(bonusPercentage).append("\n");
        return sb.toString();
    }

}
