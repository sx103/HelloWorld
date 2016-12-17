/**
 * Created by kenneth.shu on 2016/12/6.
 * This is the first class I create in IntelliJ IDEA
 */
public class HelloWorldApp {
    public static void main(String args[])
    {
        // This comment is added to test the merge behavior
        // test comment to check in GitHub
        // test comment 2 to check in GitHub
        // test comment 3 to check in GitHub
        HelloWorldParm.getInstance().setName("Wing");

        System.out.println("This is my first class developed in IntelliJ IDEA!\n" + HelloWorldParm.getInstance().getName());

        // revised on 2016/12/16
        for (int i=0; i<10; i++){
            System.out.print("[" + i + "," + i*i + "] I love you.\n");
        }

        System.out.print(new KennethHeartRobot() + "\n");
        System.out.print(new WingHeartRobot() + "\n");

    }
}
