/**
 * Created by kenneth.shu on 2016/12/17.
 */
public class HelloWorldParm {
    private static HelloWorldParm ourInstance = new HelloWorldParm();
    private String name;

    private HelloWorldParm() {
        name = "Kenneth X Shu";
    }

    public static HelloWorldParm getInstance() {
        return ourInstance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
