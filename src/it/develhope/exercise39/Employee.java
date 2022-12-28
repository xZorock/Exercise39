package it.develhope.exercise39;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee {
    final private String name;
    final private String surname;
    final private int address;

    public Employee(String newEmployeeName,String newEmployeeSurname,int newEmployeeAddress){
        this.name=newEmployeeName;
        this.surname=newEmployeeSurname;
        this.address=newEmployeeAddress;
    }
    public String getEmployeeDetails(){
        return "Employee Name : " + name + "\nEmployee Surname : " + surname + "\nEmployee Address : " + address;
    }
}
