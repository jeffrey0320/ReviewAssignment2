import java.util.ArrayList;

public class personnelData {
    private String employeeNumber;
    private String lastName;
    private String firstName;
    private String streetAddress;
    private String cityStateZip;
    private double rateBefore9PM;
    private double rateBet9and12;
    private double rateAfter12;
    private ArrayList<payrollData> data;

    public personnelData(String employeeNumber,String lastName) {
        this.employeeNumber = employeeNumber;
        this.lastName = lastName;
        this.firstName = firstName;

        data = new ArrayList<>();
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getCityStateZip() {
        return cityStateZip;
    }

    public double getRateBefore9PM() {
        return rateBefore9PM;
    }

    public double getRateBet9and12() {
        return rateBet9and12;
    }

    public double getRateAfter12() {
        return rateAfter12;
    }
}
