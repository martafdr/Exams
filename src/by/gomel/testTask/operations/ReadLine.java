package by.gomel.testTask.operations;

import by.gomel.testTask.models.*;

public class ReadLine {
    Student st = new Student();
    FirstExam e1 = new FirstExam();
    SecondExam e2 = new SecondExam();
    ThirdExam e3 = new ThirdExam();
    Credit z = new Credit();
    Credit z1 = new Credit();
    Credit z2 = new Credit();
    Credit z3 = new Credit();
    Credit z4 = new Credit();
    Credit z5 = new Credit();
    String assessment = null;
    String str = null;

    public ReadLine(String line) {
        String[] arr = line.split(" ");
        // break down the string into nominal elements
        st.setName(arr[0]);
        // first element is name of Student

        for (int i = 1; i < arr.length; i++) {
            str = arr[i];
            String[] array = str.split("-");
            // starting from the second element, break down it to a smaller parts
            // the first part of element is the type of control event
            // the second is the name of control event
            // the third is the result of control event
            switch (array[0]) {
                case "a":
                    e1.setExamName(array[1]);
                    e1.setMark(Integer.parseInt(array[2]));
                    assessment = "as1";
                    break;
                case "b":
                    e2.setExamName(array[1]);
                    e2.setMark(Integer.parseInt(array[2]));
                    break;
                case "c":
                    e3.setExamName(array[1]);
                    e3.setMark(Double.parseDouble(array[2]));
                    assessment = "as2";
                    break;
                case "z":
                    z.setCreditName(array[1]);
                    z.setPassed(array[2]);
                    break;
                case "z1":
                    z1.setCreditName(array[1]);
                    z1.setPassed(array[2]);
                    assessment = "as3";
                    break;
                case "z2":
                    z2.setCreditName(array[1]);
                    z2.setPassed(array[2]);
                    break;
                case "z3":
                    z3.setCreditName(array[1]);
                    z3.setPassed(array[2]);
                    break;
                case "z4":
                    z4.setCreditName(array[1]);
                    z4.setPassed(array[2]);
                    break;
                case "z5":
                    z5.setCreditName(array[1]);
                    z5.setPassed(array[2]);
                    break;
                default:
                    break;
            }
        }
    }

    public ControlEvent getControlEvent() {
        if (assessment.equals("as1")) {
            ControlEvent controlEvent = new ControlEvent(st.getName(), e1.getExamName(),
                    e1.getMark(), e2.getExamName(), e2.getMark());
            return controlEvent;
        } else if (assessment.equals("as2")) {
            ControlEvent controlEvent = new ControlEvent(st.getName(), e3.getExamName(),
                    e3.getMark(), z.getCreditName(), z.isPassed());
            return controlEvent;
        } else if (assessment.equals("as3")) {
            ControlEvent controlEvent = new ControlEvent(st.getName(), z1.getCreditName(), z1.isPassed(),
                    z2.getCreditName(), z2.isPassed(), z3.getCreditName(), z3.isPassed(),
                    z4.getCreditName(), z4.isPassed(), z5.getCreditName(), z5.isPassed());
            return controlEvent;
        }
        return null;
    }
}

