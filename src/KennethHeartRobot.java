import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by kenneth.shu on 2016/12/17.
 */
public class KennethHeartRobot extends HeartRobot {
    public KennethHeartRobot() {
        this.setName("Kenneth");
        Calendar calendar = Calendar.getInstance();
        calendar.set(1960, Calendar.JANUARY, 1);
        this.setBirthDate(calendar.getTime());
    }

    @Override
    public String toString(){
        DateFormat df = new SimpleDateFormat("yyyy MMM dd");
        return "*Name: " + this.getName() + ", Birth Date: " + df.format(this.getBirthDate());
    }
}
