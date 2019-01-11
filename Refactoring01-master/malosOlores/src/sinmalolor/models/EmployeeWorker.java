package sinmalolor.models;

import sinmalolor.Utils;

public class EmployeeWorker extends Employee {


	public float calcularSalario() {

	    if(Utils.getLocalDate().getMonthValue() % 2 ==  0)
	        return salary;

	    return salary + Utils.RMU /Utils.RMU_MONTH;

    }

    public float getYearBonus(){
	    return 0;
    }
}
