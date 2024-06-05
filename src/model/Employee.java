package model;

public class Employee {

    private static String employeeType;
    private static String employeeFirstName;
     private static String employeeEmail;

    public static String getEmployeeType() {
        return employeeType;
    }

    public static void setEmployeeType(String aEmployeeType) {
        employeeType = aEmployeeType;
    }

    public static String getEmployeeFirstName() {
        return employeeFirstName;
    }

    public static void setEmployeeFirstName(String aEmployeeFirstName) {
        employeeFirstName = aEmployeeFirstName;
    }

    public static String getEmployeeEmail() {
        return employeeEmail;
    }

    public static void setEmployeeEmail(String aEmployeeEmail) {
        employeeEmail = aEmployeeEmail;
    }

}
