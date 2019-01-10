package sinmalolor;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Worker extends Employee {
	public Worker(float salary, float bonusPercentage) {
		super(salary, bonusPercentage);
		// TODO Auto-generated constructor stub
	}
	
	//calcula el salario dependiendo del tipo de trabajador y entrega el décimo correspondiente cada 2 meses
	   
	public float cs()
    {
        Date date = new Date();
        //Obtiene la hora local
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        //Obtiene el mes en forma de entero
        int month = localDate.getMonthValue();
      //Si el mes es impar entonces le entrega el decimo junto con su salario
        return month%2==0?salary:salary + rmu/12*2;
    }
}
