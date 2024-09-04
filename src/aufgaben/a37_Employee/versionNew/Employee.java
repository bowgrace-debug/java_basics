package aufgaben.a37_Employee.versionNew;

/**
 * Employee
 * <p>
 *
 * @author Maximilian Stolle
 * @version 04.09.2024
 */
public class Employee {

    public final int MIN_DAYS_OF_LEAVE = 20;

    private String firstname;
    private String lastname;
    private String staffNumber;
    private String dateOfBirth;
    private int annualLeave;
    private int daysOfLeaveTaken;

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getFirstname() {
        return firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getLastname() {
        return lastname;
    }

    public void setStaffNumber(String staffNumber) {
        this.staffNumber = staffNumber;
    }
    public String getStaffNumber() {
        return staffNumber;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setAnnualLeave(int annualLeave) {
        this.annualLeave = annualLeave;
    }
    public int getAnnualLeave() {
        return annualLeave;
    }

    public void setDaysOfLeaveTaken(int daysOfLeaveTaken) {
        this.daysOfLeaveTaken = daysOfLeaveTaken;
    }
    public int getDaysOfLeaveTaken() {
        return daysOfLeaveTaken;
    }
}
