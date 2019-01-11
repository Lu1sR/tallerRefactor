package sinmalolor.models;

import java.util.Date;
import sinmalolor.Utils;
public class Supervisor extends Employee {
	 public Supervisor(float salary, float bonusPercentage) {
		super(salary, bonusPercentage);
	}
    @Override
    public float calcularSalario(){
	        Date date = new Date();
	        int month = Utils.getLocalDate().getMonthValue();
	        float valueS = salary + (bonusPercentage * 0.5F);
	        return month%2==0?valueS:valueS + Utils.RMU/Utils.RMU_MONTH;
    }
    @Override
    public float CalculateYearBonus() 
    {
	return salary + salary * 0.7F;
    }

}
