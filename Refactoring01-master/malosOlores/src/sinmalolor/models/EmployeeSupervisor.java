package sinmalolor.models;

import sinmalolor.Utils;

public class EmployeeSupervisor extends Employee {

	float bonusValue = 0.5F;

	public float calcularSalario() {

		if(Utils.getLocalDate().getMonthValue() % 2 == 0){
			return salary + (bonusPercentage * bonusValue);
		}
		return salary + (bonusPercentage * bonusValue) + Utils.RMU /Utils.RMU_MONTH;
	}

	public float calculateYearBonus() {
		return salary + salary * 0.7F;
    }

}
