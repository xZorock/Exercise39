package it.develhope.exercise39;

public class Badge {
    private static int totalNumberOfEmployees;
    private String badgeIdCode;
    public Employee employee;

    public Badge(Employee employeeThatNeedsBadge){
        keepTrackOfEmployeesNumber();
        this.employee = employeeThatNeedsBadge;
        this.badgeIdCode = generateBadgeIdCode();
    }
    private static void keepTrackOfEmployeesNumber(){
        totalNumberOfEmployees++;
    }
    private String generateBadgeIdCode(){
        return "XZY" + employee.getName() + employee.getSurname() + "ZXY";
    }
    public void showBadgeDetails(){
        System.out.println("Total number Of Employees : " + totalNumberOfEmployees);
        System.out.println("Employees' details : " + employee.getEmployeeDetails());
        System.out.println("Badge id Code : " + badgeIdCode);
    }

}
