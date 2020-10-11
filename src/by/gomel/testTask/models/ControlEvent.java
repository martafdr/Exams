package by.gomel.testTask.models;

public class ControlEvent {
    private String controlEventName;
    private String student;
    private String controlEventUnits;
    private String result;
    private int controlValue1 = 9;
    // control value that a student must have in order to pass first control event
    private double controlValue2 = 7.5;
    // control value that a student must have in order to pass second control event
    private String result1 = "is passed!";
    private String result2 = "is not passed!";

    public ControlEvent(String student, String exam1, int mark1, String exam2, int mark2) {
        this.controlEventName = "First control event";
        this.controlEventUnits = " (" + exam1 + ", " + exam2 + ") ";
        this.student = student;
        if (controlValue1 <= (mark1 + mark2)) {
            this.result = result1;
        } else this.result = result2;
    }

    public ControlEvent(String student, String exam3, double mark3, String credit, boolean resultCredit) {
        this.controlEventName = "Second control event";
        this.controlEventUnits = " (" + exam3 + ", " + credit + ") ";
        this.student = student;
        if (controlValue2 <= mark3 && resultCredit) {
            this.result = result1;
        } else this.result = result2;
    }

    public ControlEvent(String student, String credit1, boolean resultCredit1,
                        String credit2, boolean resultCredit2, String credit3, boolean resultCredit3,
                        String credit4, boolean resultCredit4, String credit5, boolean resultCredit5) {
        this.controlEventName = "Third control event";
        this.controlEventUnits = " (" + credit1 + ", " + credit2 + ", " + credit3 + ", " + credit4 + ", " + credit5 + ") ";
        this.student = student;
        int r = 0;
        if (resultCredit1) r += 1;
        if (resultCredit2) r += 1;
        if (resultCredit3) r += 1;
        if (resultCredit4) r += 1;
        if (resultCredit5) r += 1;
        if (r >= 4) {
            this.result = result1;
        } else this.result = result2;
    }

    public String getControlEventName() {
        return controlEventName;
    }

    public void setControlEventName(String controlEventName) {
        this.controlEventName = controlEventName;
    }

    public String getControlEventUnits() {
        return controlEventUnits;
    }

    public void setControlEventUnits(String controlEventUnits) {
        this.controlEventUnits = controlEventUnits;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public int getControlValue1() {
        return controlValue1;
    }

    public void setControlValue1(int controlValue1) {
        this.controlValue1 = controlValue1;
    }

    public double getControlValue2() {
        return controlValue2;
    }

    public void setControlValue2(double controlValue2) {
        this.controlValue2 = controlValue2;
    }

    @Override
    public String toString() {
        return  student + ": " +
                controlEventName +
                controlEventUnits +
                result;
    }
}
