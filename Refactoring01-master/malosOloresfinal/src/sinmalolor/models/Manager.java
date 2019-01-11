package sinmalolor.models;


import java.util.Date;
import sinmalolor.Utils;

public class Manager extends Employee {
	public Manager(float salary, float bonusPercentage) {
		super(salary, bonusPercentage);
	}

        @Override
	public float calcularSalario()
    {
        Date date = new Date();
        int month = Utils.getLocalDate().getMonthValue();
        float valueM = salary + (bonusPercentage * 0.7F);
        return month%2==0?valueM:valueM + Utils.RMU/Utils.RMU_MONTH;
    }
        @Override
	public float CalculateYearBonus() 
    {
		return salary + salary * 1.0F;
		
    }

}
