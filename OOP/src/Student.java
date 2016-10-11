/**
 * Created by vili on 9/29/2016.
 */
class Student extends Human implements Comparable<Student>{
    private int grade;

    Student(String first_name, String last_name) {
        super(first_name, last_name);
    }

    void setGrade(Integer grade) {
        this.grade = grade;
    }

    int getGrade() {
        return this.grade;
    }
    @Override
    public int compareTo(Student comparedStudent) {
        return comparedStudent.getGrade() > this.getGrade() ? -1 : 0;
    }
}
