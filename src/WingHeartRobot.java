import java.util.Calendar;

/**
 * Created by kenneth.shu on 2016/12/17.
 */
public class WingHeartRobot extends HeartRobot {
    public WingHeartRobot() {
        this.setName("Wing");
        Calendar calendar = Calendar.getInstance();
        calendar.set(1970, Calendar.JANUARY, 1);
        this.setBirthDate(calendar.getTime());
    }
}
