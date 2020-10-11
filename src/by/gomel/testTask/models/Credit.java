package by.gomel.testTask.models;

public class Credit {
    private String creditName;
    private boolean isPassed;
    private String result;

    public Credit() {
    }

    public String getCreditName() {
        return creditName;
    }

    public void setCreditName(String creditName) {
        this.creditName = creditName;
    }

    public boolean isPassed() {
        return isPassed;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public void setPassed(String result) {
        if (result.equals("yes")) isPassed = true;
        else if (result.equals("no")) isPassed = false;
        else {
            System.out.println("You have incorrect data entry! Credit: " + creditName
                    + " can not be '" + result + "'. It must be 'yes' or 'no'. " +
                    "Please, correct data in file! \n");
        }
    }
}
