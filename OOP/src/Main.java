import java.lang.reflect.Array;
import java.net.SocketPermission;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
//import org.apache.commons.lang3.ArrayUtils;

public class Main {

    public static void main(String[] args) {

        Student[] students = new Student[10];
        Random rand=new Random();

        for (int i = 0; i < 10; i++) {
            students[i]=new Student("niki"+i, "tor"+i);
            students[i].setGrade(rand.nextInt(25-1)+1);
        }

        Arrays.sort(students);
        System.out.println(students[0].compareTo(students[2]));

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

        Worker[] workers = new Worker[10];
        for (int i = 0; i < workers.length; i++) {
            workers[i]=new Worker("niki"+i,"tor");
            workers[i].setDaily_wage(i+1);
            workers[i].setHours_spent_at_work(i+1);
        }

        Arrays.sort(workers, Collections.reverseOrder());

        System.out.println();

    }
}
