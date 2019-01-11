package sinmalolor.models;

import java.util.Date;
import sinmalolor.Utils;
public class Worker extends Employee {
	public Worker(float salary, float bonusPercentage) {
        super(salary, bonusPercentage);
	}

        @Override
    public float calcularSalario() {
        Date date = new Date();
        int month = Utils.getLocalDate().getMonthValue();
        return month%2==0?salary:salary + Utils.RMU/Utils.RMU;
    }

    @Override
    public float CalculateYearBonus() {
        return 0;
    }
}
