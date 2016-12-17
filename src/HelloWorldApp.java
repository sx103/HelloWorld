/**
 * Created by kenneth.shu on 2016/12/6.
 * This is the first class I create in IntelliJ IDEA
 */
public class HelloWorldApp {
    public static void main(String args[])
    {
        // this is a change made to master branch [2]
        // this is a bug fix on master [001-done]
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
