import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
//import org.apache.commons.lang3.ArrayUtils;

public class Main {

    public static void main(String[] args) {
//        Student niki=new Student("niki","tor");

//        niki.setGrade(5);
//        System.out.println(niki.getGrade());
//        Student[] studentArr =new Student[10];
        Random rand=new Random();
        Student[] students = new Student[10];
        for (int i = 0; i < 10; i++) {
            students[i]=new Student("niki"+i, "tor"+i);
            students[i].setGrade(rand.nextInt(25-1)+1);
        }
        Student[] sorted = new Student[10];
        int[]exclude =new int[10];
        for (int i = 0; i < students.length; i++) {
            for (int j = 1; j <students.length-1; j++) {
//                if (sorted[i]!=null?(!ArrayUtils.contains(exclude, students[j].getGrade()))&&sorted[i].getGrade()>students[j].getGrade()):students[i].getGrade() > students[j].getGrade()){
                    sorted[i] = students[j];
                    exclude[i]=sorted[i].getGrade();
//                }
            }
        }
        System.out.println(sorted );

        Worker[] wrokers = new Worker[10];
    }
}
