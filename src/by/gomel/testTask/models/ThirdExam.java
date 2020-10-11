package by.gomel.testTask.models;

public class ThirdExam extends Exam {
    private double mark;

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        if (mark >= 0 && mark <= 10 && (mark % 0.5 == 0)) {
            this.mark = mark;
        } else {
            System.out.println("You have incorrect data entry! Exam: c-" + examName
                    + " can not be = " + mark + ". Please, correct data in file! \n");
        }
    }
}
