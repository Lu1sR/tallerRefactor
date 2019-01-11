package sinmalolor;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Utils {

    public static final float RMU = 386.0f;
    public static final int RMU_MONTH = 12*2;

    public static LocalDate getLocalDate(){
        return new Date().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }
}
