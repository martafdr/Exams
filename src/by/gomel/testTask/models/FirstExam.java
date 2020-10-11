package by.gomel.testTask.models;

public class FirstExam extends Exam {
    private int mark;

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        if (mark >= 1 && mark <= 10) {
            this.mark = mark;
        } else {
            System.out.println("You have incorrect data entry! Exam: a-" + examName
                    + " can not be = " + mark + ". Please, correct data in file! \n");
        }
    }
}

