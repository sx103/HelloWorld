import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by kenneth.shu on 2016/12/17.
 */
public class HeartRobot {
    private String name;
    private Date birthDate;

    // this is a test comment for master branch [1]
    // this is a bug fix on master [001-done]
    // this is a bug fix on master [002-done]

    // this is a change in 201612 release [002]

    // this is a bug fix on master [003-done]
    // this is a bug fix on master [004-done] test
    // this is a bug fix on master [005-done]

    // this is a feature [a.002]

    // this is a feature [b.001]

    public HeartRobot() {
        this.setName("No Name.");
        this.setBirthDate(new Date());
    }

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    protected void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String toString(){
        DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
        return "Name: " + this.getName() + ", Birth Date: " + df.format(this.getBirthDate());
    }
}
