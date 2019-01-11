package sinmalolor.models;

import sinmalolor.Utils;

public class EmployeeManager extends Employee {

    float bonusValue = 0.7F;

	public float calcularSalario()
    {
        if(Utils.getLocalDate().getMonthValue() %2 == 0 ){
            return salary + (bonusPercentage * bonusValue);
        }
        return salary + (bonusPercentage * bonusValue) + Utils.RMU /Utils.RMU_MONTH;
    }

	public float CalculateYearBonus() {
		return salary + salary * 1.0F;
    }

}
