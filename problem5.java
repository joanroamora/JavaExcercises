import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
    JustFive instance1 = new JustFive();
    JustFive instance2 = new JustFive();
    JustFive instance3 = new JustFive();
    JustFive instance4 = new JustFive();
    JustFive instance5 = new JustFive();
    JustFive instance6 = new JustFive();
    System.out.println(instance4.numberOfInstances);  
    }
          
}

class JustFive {
    static int numberOfInstances = 0;
    public JustFive () {
        numberOfInstances++;
        if (numberOfInstances >= 5){
            throw new RuntimeException("Crash");
        }
    }
