package sinmalolor;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Supervisor extends Employee {
	 public Supervisor(float salary, float bonusPercentage) {
		super(salary, bonusPercentage);
		// TODO Auto-generated constructor stub
	}
	//calcula el salario dependiendo del tipo de trabajador y entrega el décimo correspondiente cada 2 meses	   
	public float calcularSalario()
	    {
	        Date date = new Date();
	        //Obtiene la hora local
	        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	        //Obtiene el mes en forma de entero
	        int month = localDate.getMonthValue();
	        float valueS = salary + (bonusPercentage * 0.5F);
	        return month%2==0?valueS:valueS + rmu/12*2;
	    }
	 //calcula el bonus anual
	public float CalculateYearBonus() 
    {
		return salary + salary * 0.7F;
    }

}
